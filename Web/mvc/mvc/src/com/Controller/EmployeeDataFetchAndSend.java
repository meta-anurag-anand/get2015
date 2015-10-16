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
 * Name: EmployeeDataFetchAndSend
 * @author Anurag
 * Since: 15 October,2015
 * Description: Fetches the Data And Send to the View
 **/
public class EmployeeDataFetchAndSend extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	// Constructor
	public EmployeeDataFetchAndSend()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Name:doGet
	 * Description: Http Request and response is send to the View And retrives the Value
	 **/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Hash Map is defined
		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();
		// Lopp to add values to list
		for (Integer i : employeeMapNew.keySet())
		{
			employeeList.add(employeeMapNew.get(i));
		}
		// Sets the attribute to the Request
		request.setAttribute("employeeList",employeeList);
		getServletContext().getRequestDispatcher("/view/EmployeeListPage.jsp").forward(request, response);
	}
	/**
	 * Name: doPost
	 * Description:post the Requests 
	 **/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);

	}

}
