package com.DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.ConnectionUtil;
import com.Model.User;
/**
 * Name: UserTableQuery
 * @author Anurag
 * Since: 20, October 2015
 * Description: Fires the Query and finds the Value
 **/
public class UserTableQuery
{
	/**
	 * Name:insertInfo
	 * @param user
	 * @return
	 * Description: Inserts the Value to the database
	 **/
	public static boolean insertInfo(User user)
	{
		// Flag for checking the Value
		boolean flag = true;
		// Intializing the Connection
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		// Query 
		String query = "INSERT INTO userdetail VALUES(?,?,?)";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try
		{
			// Sending the Value
			ps = con.prepareStatement(query);
			ps.setString(1, user.getUserid());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();

		}
		catch (SQLException e) 
		{
			flag = false;

		}
		// Final block executed
		finally
		{
			try 
			{
				if (con != null)
				{
					con.close();
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return flag;
	}
	/**
	 * Name: IsValidUser
	 * @param user
	 * @return
	 * Description: Validates the user
	 **/
	public static boolean isValidUser(User user) 
	{
		boolean flag = false;
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "SELECT userid FROM userdetail WHERE userid=? and password=?";
		ResultSet rs = null;
		PreparedStatement ps = null;
		// Opens the Connection and returns the avlue
		try 
		{
			ps = con.prepareStatement(query);
			ps.setString(1, user.getUserid());
			ps.setString(2, user.getPassword());
			rs = ps.executeQuery();
			if (rs.next())
			{
				flag = true;
			}
			else 
			{
				flag = false;
			}
		}

		catch (SQLException e)
		{
			// TODO Auto-generated catch block

		} 
		finally
		{
			// Close the Conncetion
			try
			{

				if (con != null) 
				{
					con.close();
				}

			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return flag;
	}

}
