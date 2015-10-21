package com.Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Name: ConnectionUtil
 * @author Anurag
 * Since: 20 October,2015
 * Description: Creates the Conncetion util
 **/
public class ConnectionUtil 
{
	// Url of database
	private static final String DB_URL = "jdbc:mysql://localhost:3306/userinfo";
	// User 
	private static final String USER = "root";
	// Password
	private static final String PASSWORD = "mysql";
	// Creating connection
	private Connection con = null;
	// Creates the Connection
	public Connection getConnection()
	{
		//register driver 
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// open connection 
		try 
		{
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
