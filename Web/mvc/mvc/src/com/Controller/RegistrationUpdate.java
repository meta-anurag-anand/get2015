package com.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeListMain;
import com.modal.Employee;
/**
 * Name: RegistrationUpdate
 * @author Anurag
 * Since: 15 October,2015
 * Description: Update the Value of the Employee 
 **/
public class RegistrationUpdate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	// Constructor
    public RegistrationUpdate() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * Name: doGet
     * Description: Gets the information and sends back to the Requires Field
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		// Gets The Information from html
		// Gets name
		String name= request.getParameter("employeeName");
		// Gets Id
		int id = Integer.parseInt(request.getParameter("id"));
		// Gets Age
		int age = Integer.parseInt(request.getParameter("age"));
		// Checking the Value in the Map
		if (employeeMapNew.containsKey(id))
		{
			employeeMapNew.replace(id, employeeMapNew.get(id), employeeMapNew.get(id).replaceEmployee(name, age, id));
		} 
		// Else updating the value
		else
		{
			employeeMapNew.put(id, new Employee(name, age, id, new Date()));
		}
		// Request Dispatcher Called
		RequestDispatcher requestDispacher = request.getRequestDispatcher("EmployeeDataFetchAndSend");
		requestDispacher.forward(request, response);
	}

	// Gets the request and sends the response
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
