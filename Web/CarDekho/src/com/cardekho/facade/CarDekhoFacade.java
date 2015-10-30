package com.cardekho.facade;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.db.helper.LoginDBHelper;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.db.helper.VehicleDBHelper;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;

/**
 * Name: carDekhoFacade
 * @author Anurag
 * Since: 29 October,2015
 * Description: Connection to the Database and service
 **/
public class CarDekhoFacade
{
	/**
	 * Name: createCar
	 * @param connection
	 * @param car
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarDekhoAlreadyExistsException
	 * Description: Creates The car using facade 
	 **/
	public Car createCar(Connection connection, Car car) throws CarDekhoSystemException, CarDekhoAlreadyExistsException
	{
		Car carFromDB = null;
		// Db helper is called
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			// CarDbHelper is Called
			carDBHelper.create(car,connection);
		
		}
		catch (CarDekhoSystemException e)
		{
			System.out.println("Exception while creating car" + e.getMessage());
			throw e;
		}
		return carFromDB;
	}
	/**
	 * Name:validateLogin
	 * @param request
	 * @return
	 * @throws CarDekhoSystemException
	 **/
	public User validateLogin(HttpServletRequest request) throws CarDekhoSystemException 
	{
		User admin = new User();
		LoginDBHelper validate = new LoginDBHelper();
		try
		{
			// Function is Called
			if (validate.validateLogin(request) != null) 
			{
				// Request Is passed
				admin = validate.validateLogin(request);
			} 
			else
			{
				admin = null;
			}
		} 
		catch (CarDekhoSystemException e) 
		{
			System.out.println("Exception during validation " + e.getMessage());
		}
		return admin;
	}
	/**
	 * Name: searchCar
	 * @param make
	 * @param model
	 * @return
	 * Description: Searches the car
	 **/
	public List<Vehicle> searchCar(String make, String model)
	{
		//ReturnValue is called
		List<Vehicle> returnValue =null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try
		{
			// Search Car is Called
			returnValue=searchDBHelper.searchCar(make, model);
		}
		catch(CarDekhoSystemException e)
		{
			System.out.println("Exception during search " + e.getMessage());
		}
		return returnValue;
	}
}
