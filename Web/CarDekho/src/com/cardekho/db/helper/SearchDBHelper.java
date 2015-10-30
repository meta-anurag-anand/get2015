package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;
/**
 * Name: SearchDBHelper
 * @author Anurag
 * Since: 26 October,2015
 * Description: Searches the Data
 **/
public class SearchDBHelper
{
	// Creates the List
	private final static String CREATE_LIST_QUERY = "SELECT MAKE, MODEL FROM Vehicle";
	// Searches The Model
	private final static String SEARCH_QUERY = "SELECT * FROM vehicle WHERE make = ? AND model = ?";
	// Populates the List
	public List<String> populateList() throws CarDekhoSystemException
	{
		// For storing the List
		List<String> carList = new ArrayList<String>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try 
		{
			// Getting the Connection
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(CREATE_LIST_QUERY);
			// Getting the Result Query
			while(resultSet.next()) 
			{
				carList.add(resultSet.getString("make")+"-"+resultSet.getString("model"));
			}
			return carList;
			
		}
		catch(CarDekhoSystemException e) 
		{
			try
			{
				connection.rollback();
			} 
			catch (SQLException e1) 
			{
				System.out.println("Could not rollback.");
			}
			throw e;
			
		} 
		catch (SQLException e) 
		{
			try
			{
				connection.rollback();
			} 
			catch (SQLException e1)
			{
				System.out.println("Could not rollback.");
			}
			throw new CarDekhoSystemException("Could not Create List, [" + e.getMessage() + "]");
		} 
		finally
		{
			if(statement != null) 
			{
				try
				{
					statement.close();
				}
				catch (SQLException e)
				{
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
			// Gets The Connection
			ConnectionFactory.closeConnection(connection);
		}
	}
	/**
	 * Name: searchCar
	 * @param make
	 * @param model
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: SearchCaron make and model
	 **/
	public List<Vehicle> searchCar(String make, String model) throws CarDekhoSystemException
	{
		// Query
		String searchQuery = "SELECT * FROM Vehicle where make='"+make+"' AND model='"+model+"'";
		// To store the list 
		List<Vehicle> searchList = new ArrayList<Vehicle>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Vehicle vehicle = null;
		try 
		{
			// Connection is setup
			connection = ConnectionFactory.getConnection();
			// statement is intalized
			statement = connection.createStatement();
			resultSet = statement.executeQuery(searchQuery);
			// Iterating the result set
			while(resultSet.next()) 
			{
				vehicle = new Car();
				vehicle.setId(resultSet.getInt("id"));
				vehicle.setMake(resultSet.getString("make"));
				vehicle.setModel(resultSet.getString("model"));
				vehicle.setEngineCC(resultSet.getString("engine_cc"));
				vehicle.setFuelCapacity(resultSet.getString("fuel_capacity"));
				vehicle.setMileage(resultSet.getString("mileage"));
				vehicle.setPrice(resultSet.getInt("price"));
				vehicle.setRoadTax(resultSet.getInt("road_tax"));
				vehicle.setCreatedBy(resultSet.getString("created_by"));
				vehicle.setCreatedTime(resultSet.getDate("created_time"));
				vehicle.setLastModifiedTime(resultSet.getDate("last_modified_time"));
				vehicle.setImagePath(resultSet.getString("image_path"));
				searchList.add(vehicle);
			}
			return searchList;
			
		} 
		catch(CarDekhoSystemException e) 
		{
			try
			{
				connection.rollback();
			} 
			catch (SQLException e1) 
			{
				System.out.println("Could not rollback.");
			}
			throw e;
			
		}
		// Sql statement Exception
		catch (SQLException e) 
		{
			try
			{
				connection.rollback();
			} 
			catch (SQLException e1) 
			{
				System.out.println("Could not rollback.");
			}
			throw new CarDekhoSystemException("Could not Show Result, [" + e.getMessage() + "]");
		} 
		finally 
		{
			if(statement != null)
			{
				try
				{
					statement.close();
				} 
				catch (SQLException e)
				{
					System.out.println("Could not close Statement, [" + e.getMessage() + "]");
				}
			}
			// Closing the Connection
			ConnectionFactory.closeConnection(connection);
		}
	}
}
