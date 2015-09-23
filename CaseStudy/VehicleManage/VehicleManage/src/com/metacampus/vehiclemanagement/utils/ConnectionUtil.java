package com.metacampus.vehiclemanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.metacampus.vehiclemanagement.xml.ConnectionItems;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;

/**
 * Name: ConnectionUtil
 * @author Anurag
 * Since: 21 September,2015
 * Description: Credentials Passed
 **/
public class ConnectionUtil
{
	private static String DB_URL;
	private static String USER;
	private static String PASSWORD;
	/**
	 * Name: getConnection
	 * @return
	 * Description: Gets the Connection
	 **/
	public static Connection getConnection()
	{
		// Connection Establish
		Connection con = null;
		ConnectionItems connectionItem = new ConnectionItems();
		ReadConnectionXml read = new ReadConnectionXml();
		connectionItem = read.readConfig("connection.xml");
		// Url Entry
		DB_URL = connectionItem.geturl();
		// User name
		USER = connectionItem.getUsername();
		// Password
		PASSWORD = connectionItem.getPassword();
		// register driver 
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		// open connection 
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return con;
	}
}
