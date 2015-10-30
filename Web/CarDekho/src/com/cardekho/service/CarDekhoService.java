package com.cardekho.service;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.facade.CarDekhoFacade;
import com.cardekho.model.Car;
import com.cardekho.model.User;
import com.cardekho.model.Vehicle;
/**
 * Name: CarDekhoService
 * @author Anurag
 * Since: 29 October,2015
 * Description:Creates the service Class of car
 **/
public class CarDekhoService
{
	
	/**
	 * Name: createCar
	 * @param car
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarDekhoAlreadyExistsException
	 * Description: Creates the Car using facade
	 **/
	public static Car createCar(Car car)throws CarDekhoSystemException,CarDekhoAlreadyExistsException
	{
		// Car object
		Car returnValue = null;
		// Getting the Connection
		java.sql.Connection connection = ConnectionFactory.getConnection();
		// Object of facade
		CarDekhoFacade facade = new CarDekhoFacade();
		
		try
		{
			// Calling the Method
			returnValue = facade.createCar(connection, car);
		} 
		finally 
		{
			// Closing the Connection
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}
	/**
	 * Name: validateLogin
	 * @param request
	 * @return
	 * @throws CarDekhoSystemException
	 * @throws CarDekhoAlreadyExistsException
	 **/
	public static User validateLogin(HttpServletRequest request)throws CarDekhoSystemException,CarDekhoAlreadyExistsException
	{
		
		User returnValue = null;
		java.sql.Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try 
		{
			System.out.println("user");
			// Calling the Validate Login Facade
			returnValue = facade.validateLogin(request);
		} 
		finally 
		{
			//Closing the Connetion
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}
	/**
	 * Name: searchCar
	 * @param Make
	 * @param Model
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Searches the car
	 **/
	public static List<Vehicle>  searchCar(String Make, String Model) throws CarDekhoSystemException
	{
		// List to store The value
		List<Vehicle> returnValue =null;
		java.sql.Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade facade = new CarDekhoFacade();
		try
		{
			// Calling the facade
			System.out.println("search implemented");
			returnValue = facade.searchCar(Make,Model);
		}
		finally 
		{
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}
}