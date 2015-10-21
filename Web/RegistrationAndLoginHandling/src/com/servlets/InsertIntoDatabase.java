package com.servlets;

import java.io.IOException;


import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.DatabaseHelper.UserTableQuery;
import com.Model.User;
/**
 * Name:InSertIntoDatabse
 * @author Anurag
 * Since: 20 October,2015
 * Description: Inserts the Value
 **/
public class InsertIntoDatabase extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertIntoDatabase()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		//  To Store UserID 
		String userid = request.getParameter("userid");
		// To Store Email
		String email = request.getParameter("email");
		// To Store Passowrd
		String password = request.getParameter("pwd");
		User user=new User();
		user.setUserid(userid);
		user.setEmail(email);
		user.setPassword(password);
		boolean flag=UserTableQuery.insertInfo(user);
		// If true sends to the Profilepage
		if(flag)
		{
			response.sendRedirect("profile.jsp");
		}
		else
		{
			
			response.sendRedirect("index.jsp?message="+ URLEncoder.encode("User name Already Exist, Try Another", "UTF-8"));
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
	}
}
