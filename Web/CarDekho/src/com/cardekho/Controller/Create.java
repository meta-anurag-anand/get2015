package com.cardekho.Controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.model.Car;
import com.cardekho.service.CarDekhoService;
/**
 * Name: Create
 * @author Anurag
 * Since: 26 October,2015
 * Description: Creates the Database
 **/
@WebServlet("/Create")
public class Create extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Request DIspatcher is called and Response is forwarded
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Checking the Session for null
		if(request.getSession(false).getAttribute("user") == null)
		{
			// Dispatches the Request
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
		// Where to forward if not null
		String forwardUrl = "create.jsp";
		Car car = createCar(request);
		request.setAttribute("car", car);
		// Dvhelper is called
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			// Gets The Parameter of Car
			if(request.getParameter("type").equals("create"))
			{
				
				Car createdcar= CarDekhoService.createCar(car);
				System.out.println("created");
				// Msg is sent
				request.setAttribute("msg", "Car created successfully");
			}
			// If update Button is clicked
			else if(request.getParameter("type").equals("update"))
			{
				carDBHelper.updateByModel(car, Integer.parseInt(request.getParameter("id")));
				request.setAttribute("msg", "Car Updated successfully");
			}
			
		} 
		catch (CarDekhoSystemException e)
		{
			request.setAttribute("msg", e.getMessage());
		} catch (CarDekhoAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Request Dispatcher is called
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}
	/**
	 * Name: Createcar
	 * @param request
	 * @return
	 * Description: Creating the Car with the specifications
	 **/
	private Car createCar(HttpServletRequest request)
	{
		Car car = new Car();
		// Make of the Car
		car.setMake(request.getParameter("make"));
		// Model of the Car
		car.setModel(request.getParameter("model"));
		// cc of the Car
		car.setEngineCC(request.getParameter("engineCC"));
		// FuelCapacity of the Car
		car.setFuelCapacity(request.getParameter("fuelCapacity"));
		// Mileage of the Car
		car.setMileage(request.getParameter("mileage"));
		// Price of the Car
		car.setPrice(Integer.parseInt(request.getParameter("price")));
		// Road Tax of the Car
		car.setRoadTax(Integer.parseInt(request.getParameter("roadTax")));
		// Ac of the Car
		car.setAC(request.getParameter("ac"));
		// Power Steering of the Car
		car.setPowerSteering(request.getParameter("powerSteering"));
		// Accesory Kit of the Car
		car.setAccessoryKit(request.getParameter("accessoryKit"));
		car.setCreatedBy((String)request.getSession().getAttribute("user"));
		// If create the Called
		if(((String)request.getParameter("type")).equals("create"))
		{
			car.setCreatedTime(Calendar.getInstance().getTime());
		}
		car.setLastModifiedTime(Calendar.getInstance().getTime());
		car.setImagePath(request.getParameter("carimage"));
		return car;
	}
}
