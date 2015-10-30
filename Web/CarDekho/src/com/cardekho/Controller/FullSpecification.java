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
import com.cardekho.model.Vehicle;
/**
 * Name: FullSpecification
 * @author Anurag
 * Since: 26 October,2015
 * Description: Specifications of the car
 **/
@WebServlet("/FullSpecification")
public class FullSpecification extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FullSpecification()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * Name: doGet
     **/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Request Dispatcher is called
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("fullSpecification.jsp");
		// Car Db Helper Is called
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			// Vehicle Db Helper is Called
			Vehicle vehicle = carDBHelper.getCarDetails(Integer.parseInt(request.getParameter("id")));
			// Checking of the vehicle
			if(vehicle != null) 
			{
				request.setAttribute("Vehicle", vehicle);
				requestDispatcher.forward(request, response);
			}
		} 
		catch (CarDekhoSystemException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

}
