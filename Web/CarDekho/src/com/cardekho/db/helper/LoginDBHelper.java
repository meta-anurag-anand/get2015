package com.cardekho.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.ConnectionFactory;
import com.cardekho.model.User;
/**
 * Name: LoginDBHelper
 * @author Anurag
 * Since: 26 October,2015
 * Description: Used in the Login 
 **/
public class LoginDBHelper
{
	/**
	 * Name: ValidateLogin
	 * @param request
	 * @return
	 * @throws CarDekhoSystemException
	 * Description: Validates the Login Of the User
	 **/
	public User validateLogin(HttpServletRequest request) throws CarDekhoSystemException
	{
		// Getting the UserNAme
		String username = request.getParameter("username");
		// Getting the Password
		String password = request.getParameter("password");
		// Connection is set the null
		Connection connection = null;
		Statement statement = null;
		// Validating the Query
		String validateQuery = "SELECT * from login where username='"+username+"'";
		ResultSet resultSet = null;
		try 
		{
			// Getting the Connection
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(validateQuery);;
			if(resultSet.next())
			{
				// Checking the Password
				if(password.equals(resultSet.getString("password")))
				{
					// sets the Password
					User admin = new User();
					admin.setUsername(username);
					admin.setPassword(password);
					admin.setName(resultSet.getString("name"));
					admin.setEmail(resultSet.getString("email"));
					return admin;
				}
				// Error Message
				else 
				{
					request.setAttribute("msg", "Password Incorrect");
					return null;
				}
			}
			else 
			{
				request.setAttribute("msg", "Username not Correct");
				return null;
			}
		}
		catch(CarDekhoSystemException e)
		{
			try 
			{
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} 
		// Sql Exception
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
			throw new CarDekhoSystemException("Could not Login, [" + e.getMessage() + "]");
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
			ConnectionFactory.closeConnection(connection);
		}
	}
}
