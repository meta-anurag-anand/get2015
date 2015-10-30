package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;
/**
 * Name: CarDBHelper
 * @author Anurag
 * Since: 26 October,2015
 * Description: Database Helper to create the Car Database
 **/
public class CarDBHelper extends VehicleDBHelper
{
	// Insert Car Query
	private static String INSERT_CAR_QUERY = "INSERT INTO car (vehicle_id, ac, power_steering, accessory_kit, created_by, created_time, last_modified_time) VALUES (?, ?, ?, ?, ?, ?, ?)";
	// Car Detail Fetch Query
	private static String CAR_DETAIL_QUERY = "SELECT * FROM car WHERE vehicle_id = ?";
	// Update Car Query
	private static String UPDATE_CAR_QUERY = "UPDATE Car SET ac = ?, power_steering =?, accessory_kit = ?,last_modified_time = ? WHERE vehicle_id = ?";
	/**
	 * Name: Create Car
	 * @param car
	 * @param connection 
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Details of the car to fetch 
	 **/
	public boolean create(Car car, Connection connection) throws CarDekhoSystemException
	{
		// created 
		boolean created = false;
		// checking the connection
		if(connection != null) 
		{
			// Creating the prepared Statement
			PreparedStatement preparedStatement = null;
			try
			{
				super.create(connection, car);
				// Checking the Vehicle id
				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				// Checking the vehicle id
				if(vehicleId > 0) 
				{
					// prepared Statement Creating the Statement
					preparedStatement = connection.prepareStatement(INSERT_CAR_QUERY);
					// Setting the Vehichle Id
					preparedStatement.setInt(1, vehicleId);
					// Setting the ac
					preparedStatement.setString(2, car.getAC());
					// Setting the powerSteering
					preparedStatement.setString(3, car.getPowerSteering());
					// setting the Accessory Kit
					preparedStatement.setString(4, car.getAccessoryKit());
					// Setting the created By
					preparedStatement.setString(5, car.getCreatedBy());
					// Setting the Time
					preparedStatement.setTimestamp(6, new Timestamp(car.getCreatedTime().getTime()));
					// Setting the  Last Modified
					preparedStatement.setTimestamp(7, new Timestamp(car.getLastModifiedTime().getTime()));
					created = preparedStatement.execute();
					// Commit is done
					connection.commit();
				}
			} 
			catch(CarDekhoSystemException e) 
			{
				// Checking the Connection
				try
				{
					connection.rollback();
				} 
				catch (SQLException e1) 
				{
					// Could not RollBack is printed
					System.out.println("Could not rollback.");
				}
				throw e;
			}
			// Checking the SqlExpection
			catch (SQLException e)
			{
				try 
				{
					connection.rollback();
				} catch (SQLException e1) 
				{
					System.out.println("Could not rollback.");
				}
				throw new CarDekhoSystemException("Could not create Car, [" + e.getMessage() + "]");
			}
			finally 
			{
				// Checking the Prepared Statement
				if(preparedStatement != null)
				{
					try 
					{
						preparedStatement.close();
					} 
					catch (SQLException e)
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return created;
	}
	/**
	 * Name:UpdateByModel
	 * @param car
	 * @param id
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Updates the Database by model
	 **/
	public boolean updateByModel(Car car, int id) throws CarDekhoSystemException
	{
		boolean created = false;
		// Getting the Connection
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null) 
		{
			PreparedStatement preparedStatement = null;
			try 
			{
				System.out.println("Model1 : "+id);
				super.updateByModel(connection, car, id);
				int vehicleId = id;//getVehicleIdByModel(connection, id);
				// Updating the Model
				if(vehicleId > 0)
				{
					preparedStatement = connection.prepareStatement(UPDATE_CAR_QUERY);
					preparedStatement.setString(1, car.getAC());
					preparedStatement.setString(2, car.getPowerSteering());
					preparedStatement.setString(3, car.getAccessoryKit());
					preparedStatement.setTimestamp(4, new Timestamp(car.getLastModifiedTime().getTime()));
					preparedStatement.setInt(5, vehicleId);
					created = preparedStatement.execute();
					connection.commit();
				} 
			} 
	
			catch (SQLException e) 
			{
					try 
					{
						connection.rollback();
					} catch (SQLException e1) {
						System.out.println("Could not rollback.");
					}
					throw new CarDekhoSystemException("Could not update Car, [" + e.getMessage() + "]");
			} 
			finally
			{
					if(preparedStatement != null)
					{
						try
						{
							preparedStatement.close();
						} catch (SQLException e) {
							System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
						}
					}
					ConnectionFactory.closeConnection(connection);
				}
			}

		return false;
	}
	/**
	 * Name: getCarDetails
	 * @param id
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Getting the Car Details
	 **/
	public Car getCarDetails(int id) throws CarDekhoSystemException 
	{
		// Car object
		Car car = null;
		// Getting the Connection
		Connection connection = ConnectionFactory.getConnection();
		if(connection != null)
		{
			// Itializig the Prepared Statement
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try 
			{
				// Getting The  Connection
				car = (Car) super.getVehicleDetails(connection, id);
				int vehicleId = getVehicleIdByModel(connection, car.getModel());
				// Getting the Model
				if(vehicleId > 0)
				{
					// Getting the Car Details
					preparedStatement = connection.prepareStatement(CAR_DETAIL_QUERY);
					preparedStatement.setInt(1, vehicleId);
					resultSet = preparedStatement.executeQuery();
					// Iterating the ResultSet
					if(resultSet.next()) 
					{
						// Seting the Ac
						car.setAC(resultSet.getString("ac"));
						car.setPowerSteering(resultSet.getString("power_steering"));
						car.setAccessoryKit(resultSet.getString("accessory_kit"));
						System.out.println(car);
					}
				}
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
				} catch (SQLException e1) {
					System.out.println("Could not rollback.");
				}
				throw new CarDekhoSystemException("Could not Show Details, [" + e.getMessage() + "]");
			} 
			// Finally is set
			finally 
			{
				if(preparedStatement != null)
				{
					try 
					{
						preparedStatement.close();
					} 
					catch (SQLException e) 
					{
						System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
					}
				}
				ConnectionFactory.closeConnection(connection);
			}
		}
		return car;
	}
}
