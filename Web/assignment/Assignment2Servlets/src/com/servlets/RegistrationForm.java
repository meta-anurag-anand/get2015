package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Name: RegistrationForm
 * @author Anurag
 * Since: 12 October,2015
 * Description: Registration form
 **/
public class RegistrationForm extends HttpServlet 
{
	/**
	 * Name: doGet
	 * @param req
	 * @param res
	 * @throws ServletException
	 * @throws IOException
	 * Description: Establishes the COnnection
	 **/
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{
		// Print Writer
		PrintWriter pw = res.getWriter();
		// String Result to store Result
		String result = "";
		boolean flag = true;
		res.setContentType("text/html");
		// Checking the First Name
		if (req.getParameter("firstName") == "")
		{
			// Storing the Result
			result += "First Name not entered<br>";
			flag = false;
		}
		// Checking the Last Name
		if (req.getParameter("lastName") == "") 
		{
			// Storing the Result
			result += "Last Name not entered<br>";
			flag = false;
		}
		// Checking the Password
		if (req.getParameter("password").length() < 8) 
		{
			// Storing the Result
			result += "Password Length should be greater than 8 <br>";
			flag = false;
		}
		// Matching the Password
		if (!req.getParameter("password").equalsIgnoreCase(req.getParameter("confirmPassword"))) 
		{
			// Storing the Result
			result += "Password doesn't match<br>";
			flag = false;
		}
		// Storing the States
		if (req.getParameter("states") == "") 
		{
			// Storing the Result
			result += "State is not entered<br>";
			flag = false;
		}
		// Storing the Cities
		if (req.getParameter("cities") == "")
		{
			// Storing the Result
			result += "Cities is not entered<br>";
			flag = false;
		}
		// Storing the Addres
		if (req.getParameter("address") == "")
		{
			// Storing the Result
			result += "Address is not entered<br>";
			flag = false;
		}
		// Age Validation
		if (req.getParameter("age") == "") 
		{
			// Storing the Result
			result += "Age is not entered<br>";
			flag = false;
		}
		if (flag == true) 
		{
			// Storing the Result
			result += "Form is validated at server side<br>";
		}
		req.setAttribute("result", result);
		// Request Dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("ValidationCheck");
		rd.forward(req, res);
	}
}
