package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.LoginDBHelper;
import com.cardekho.model.User;
import com.cardekho.service.CarDekhoService;
/**
 * Name: LoginServlet
 * @author Anurag
 * Since: 26 October,2015
 * Description: Login Servlet Is called
 **/
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Gets the Session And clears the Cache
		if(request.getSession(false) != null)
		{
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Cache-Control", "no-store");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			request.getSession(false).invalidate();
		}
		// Request Dispatcher is called
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		LoginDBHelper loginDBHelper = new LoginDBHelper();
		try
		{
			// Validation is Called
			User admin = CarDekhoService.validateLogin(request);
			// Checking the Value
			if(admin == null) 
			{
				requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.forward(request, response);
			}
			// Checking the Session
			else 
			{
				// Setting the Session
				HttpSession session = request.getSession();
				// Getting the Name
				session.setAttribute("user",admin.getName());
				request.setAttribute("admin", admin);
				requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
			}
		} 
		catch (CarDekhoSystemException | CarDekhoAlreadyExistsException e)
		{
			e.printStackTrace();
		}
	}
}
