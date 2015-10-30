package com.cardekho.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cardekho.CarDekhoException;
import com.cardekho.CarDekhoSystemException;
/**
 * Name: ConnectionFactory
 * @author Anurag
 * Since: 26 October,2015
 * Description: Establishes THe Connection
 **/
public class ConnectionFactory 
{
	// url of Database
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Vehicle";
	// root of database
	private static final String USER = "root";
	// password of the Database
	private static final String PASSWORD = "mysql";
	private static Connection connection = null;
	/**
	 * Name: GetConnection
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Gets the Connection and Establishes to Database
	 **/
	public static Connection getConnection() throws CarDekhoSystemException 
	{
		
		try
		{
			// Searches for Class
			Class.forName("com.mysql.jdbc.Driver");
			// Getting the Connection
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			connection.setAutoCommit(false);
		} 
		// Exception 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Could not load driver class, please add mysql jdbc driver to classpath.");
			throw new CarDekhoSystemException("Could not load driver class, please add mysql jdbc driver to classpath.", e);
		} 
		catch (SQLException e)
		{
			System.out.println("Coult not create connection with database, [" + e.getMessage() + "]");
			throw new CarDekhoSystemException("Coult not create connection with database, [" + e.getMessage() + "]", e);
		}
		return connection;
	}
	/**
	 * Name: closeConnection
	 * @param connection
	 * Description: closes the connection
	 */
	public static void closeConnection(Connection connection) 
	{
		if(connection != null) 
		{
			try 
			{
				connection.close();
			} 
			catch (SQLException e) 
			{
				System.out.println("Could not close connection due to following error, [" + e.getMessage() + "]");
			}
		}
	}
}
