package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.service.CarDekhoService;
/**
 * Name: Search
 * @author Anurag
 * Since: 26 October,2015
 * Description: Searches on the  Basis of Http
 **/
@WebServlet("/Search")
public class Search extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Request Dispatcher is called
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
		// search db is called
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try
		{
			// Populating the List
			request.setAttribute("carList", searchDBHelper.populateList());
		}
		catch (CarDekhoSystemException e) 
		{
			System.out.println("Cannot Show the list of cars ["+e.getMessage()+" ]");
		}
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// request Diaptacher is called
		RequestDispatcher requestDispatcher = null;
		// Db Helper is Called
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		// Make Model is Searched
		String makeModel = request.getParameter("selectCar");
		String make = makeModel.substring(0, makeModel.indexOf('-'));
		String model = makeModel.substring(makeModel.indexOf('-')+1, makeModel.length());
		// Seting the Vehicle List
		try 
		{
			request.setAttribute("vehicleList",  CarDekhoService.searchCar(make, model));
			requestDispatcher = request.getRequestDispatcher("searchResult.jsp");
			
		} 
		catch (CarDekhoSystemException e)
		{
			// Showing the Result
			System.out.println("Cannot Show the Result ["+e.getMessage()+" ]");
			requestDispatcher = request.getRequestDispatcher("search.jsp");
		}
		// forward the Request
		requestDispatcher.forward(request, response);
	}

}
