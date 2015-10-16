package com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeListMain;
import com.modal.Employee;
/**
 * Name: Registration Page
 * @author Anurag
 * Since: 15 October,2015
 * Description: Registers THe user
 **/
@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    // Default constructor. 
    public RegistrationPage() 
    {
        // TODO Auto-generated constructor stub
    }

	// Description: @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Id to select which details to print
		int id = Integer.parseInt(request.getParameter("id"));
		int value = 0;
		//  Calling the Map
		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();
		for (Integer i : employeeMapNew.keySet())
		{
			employeeList.add(employeeMapNew.get(i));
			value = i;
		}
		//  redirecting to a new page
		if(id == -1)
		{
			request.setAttribute("newUser", (value+1));
			getServletContext().getRequestDispatcher("/view/RegistrationPage.jsp").forward(request, response);
		} 
		// Fetching the Data and printing it
		else 
		{
			request.setAttribute("employeeDetails", employeeList.get(id));
			getServletContext().getRequestDispatcher("/view/RegistrationPage.jsp").forward(request, response);
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
