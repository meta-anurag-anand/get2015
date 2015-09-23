package com.metacampus.vehiclemanagement.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.utils.ConnectionUtil;
/**
 * Name: VehicleJdbcHelper
 * @author Anurag
 * Since: 21 September,2015
 * Description: Creates the connection and pass the values to the database
 **/
public class VehicleJDBCHelper 
{
	/**
	 * Name: createConnection
	 * @param vehicle
	 * Description: Create the connection and passes the value
	 **/
	public static void createConnection(Vehicle vehicle) 
	{
		// Opening the Connection
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = null;
		try 
		{
			// Specifications of vehicle
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			String engineCC = vehicle.getEngineCC();
			String fuelCapacity = vehicle.getFuelCapacity();
			String mileage = vehicle.getMileage();
			int price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			String ac, powerSteering, accessoryKit, selfStart;
			int helmetPrice; 
			// inserting into vehicle
			String query = "INSERT INTO vehicle (make, model, engine_cc, fuel_capacity, mileage, price, road_tax) values(?,?,?,?,?,?,?)";
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, make);
			preparedStmt.setString(2, model);
			preparedStmt.setString(3, engineCC);
			preparedStmt.setString(4, fuelCapacity);
			preparedStmt.setString(5, mileage);
			preparedStmt.setInt(6, price);
			preparedStmt.setInt(7, roadTax);
			preparedStmt.execute();
			
			query = "SELECT vehicle_id FROM vehicle ORDER BY vehicle_id DESC";
			// Storing the result in result set
			ResultSet rs = preparedStmt.executeQuery(query);
			
			int vehicleId = 0;
			if(rs.next())
			{
				vehicleId = rs.getInt(1);
			}
			if(vehicle instanceof Car) {
				ac = ((Car) vehicle).getAC();
				powerSteering = ((Car) vehicle).getPowerSteering();
				accessoryKit = ((Car) vehicle).getAccessoryKit();
				query = "INSERT INTO car(ac, power_steering, accessory_kit, vehicle_id) VALUES(?,?,?,?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, ac);
				preparedStmt.setString(2, powerSteering);
				preparedStmt.setString(3, accessoryKit);
				preparedStmt.setInt(4, vehicleId);
				preparedStmt.execute();
			}
			// Inserting in bike
			else if(vehicle instanceof Bike) 
			{
				selfStart = ((Bike) vehicle).getSelfStart();
				helmetPrice = ((Bike) vehicle).getHelmetPrice();
				query = "INSERT INTO bike(self_start, helmet_price, vehicle_id) VALUES (?, ?, ?)";
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, selfStart);
				preparedStmt.setInt(2, helmetPrice);
				preparedStmt.setInt(3, vehicleId);
				preparedStmt.execute();
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Name : deleteByMake
	 * @param make
	 * @return
	 * Description: Deleting the details by make
	 **/
	public static int deleteByMake(String make) 
	{
		String query = "DELETE FROM vehicle where make = '"+make+"'";
		Connection con = ConnectionUtil.getConnection();
		try
		{
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} 
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
	/**
	 * Name: deleteByModel
	 * @param model
	 * @return
	 * Description: Deleting by Model
	 **/
	public static int deleteByModel(String model) 
	{
		// Query to delete
		String query = "DELETE FROM vehicle where model = '"+model+"'";
		Connection con = ConnectionUtil.getConnection();
		try 
		{
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	/**
	 * Name: deleteByMakeModel
	 * @param model
	 * @return
	 * Description: Deleting by Model and by model
	 **/
	public static int deleteByMakeModel(String make, String model)
	{
		String query = "DELETE FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Connection con = ConnectionUtil.getConnection();
		try
		{
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
	/**
	 * Name: searchByMakeAndModel
	 * @param make
	 * @param model
	 * @return
	 * Description: Search the details by make and model
	 **/
	public static List<Vehicle> searchByMakeAndModel(String make, String model)
	{
		// Query to search the details on the basis of make and model
		String query = "SELECT * FROM vehicle WHERE make = '"+make+"' AND model = '"+model+"'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		String engineCC, fuelCapacity, mileage, selfStart = "", ac, powerSteering, accessoryKit;
		int price, roadTax, helmetPrice= 0;
		// Opening the Connection
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehicles = null;
		try
		{
			// Stament 
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);
			vehicles = new ArrayList<Vehicle>();
			// traversing the Result Set
			while(rsVehicle.next()) 
			{
				// Intializing the values to the to object
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getString("engine_cc");
				fuelCapacity = rsVehicle.getString("fuel_capacity");
				mileage = rsVehicle.getString("mileage");
				price = rsVehicle.getInt("price");
				roadTax = rsVehicle.getInt("road_tax");
				// Getting the id
				int vehicle_id = rsVehicle.getInt("vehicle_id");
				// Query to get the vehicle by id
				query = "SELECT * FROM car WHERE vehicle_id = "+vehicle_id;
				rsSpecific = stmt2.executeQuery(query);
				if(rsSpecific.next() == false) 
				{
					// Checking vehicle
					query = "SELECT * FROM bike WHERE vehicle_id = "+vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					if(rsSpecific.next()) 
					{
						selfStart = rsSpecific.getString("self_start");
						helmetPrice = rsSpecific.getInt("helmet_price");
					}
					vehicles.add(VehicleHelper.createObject(make, model, engineCC, fuelCapacity, mileage, price, roadTax, selfStart, helmetPrice));
				}
				else
				{
					ac = rsSpecific.getString("ac");
					powerSteering = rsSpecific.getString("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehicles.add(VehicleHelper.createObject(make, model, engineCC, fuelCapacity, mileage, price, roadTax, ac, powerSteering, accessoryKit));
				}
			}
		} 
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(stmt != null)
				{
					stmt.close();
				}
				if(stmt2 != null)
				{
					stmt2.close();
				}
				if(rsSpecific != null)
				{
					rsSpecific.close();
				}
				if(rsVehicle != null)
				{
					rsVehicle.close();
				}
			} 
			catch(Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		return vehicles;
	}
	/**
	 * Name: UpdateByMake
	 * @param make
	 * @return
	 * Description: update the details by make
	 **/
	public static int updateByMake(String make) 
	{
		// query to update the price
		String query = "UPDATE vehicle SET price = price+100000 where make = '"+make+"'";
		Connection con = ConnectionUtil.getConnection();
		try 
		{
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} 
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
