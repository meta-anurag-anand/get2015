package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.model.Car;
/**
 * Name: UpdateCar
 * @author Anurag
 * Since: 26 October,2015
 * Description: Updates the Car Details
 **/
@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCar()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher ;
		// Checkig the Session
		if(request.getSession(false).getAttribute("user") == null)
		{
			requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
		// Getting the id of the car
		int id = Integer.parseInt(request.getParameter("id"));
		CarDBHelper carDBHelper = new CarDBHelper();
		try
		{
			// gettig the Car Helper
			Car car = carDBHelper.getCarDetails(id);
			// Setting the Attribute
			request.setAttribute("Vehicle", car);
			// Setting the Id
			request.setAttribute("id", id);
			// Getting the Dispatcher
			requestDispatcher = request.getRequestDispatcher("Create");
			requestDispatcher.forward(request, response); 
		} 
		catch (CarDekhoSystemException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
