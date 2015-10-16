package com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
 * Name: ViewDetails
 * @author Anurag
 * Description: Shows the Details
 */
public class ViewDetails extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    // Default constructor. 
    public ViewDetails() 
    {
    }

    /**
     * Name: doGet
     * Description: Gets the data and sends to the Required page
     **/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Gets the id aND update the Value
		int id = Integer.parseInt(request.getParameter("id"));
		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();
		// Traverse the Value
		for (Integer i : employeeMapNew.keySet()) 
		{
			employeeList.add(employeeMapNew.get(i));
		}
		// Setting the value
		request.setAttribute("employeeDetails", employeeList.get(id));
		getServletContext().getRequestDispatcher("/view/ViewDetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
