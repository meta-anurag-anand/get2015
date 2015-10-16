package com.helper;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import com.modal.Employee;
/**
 * Name:EmployeeListMain
 * @author Anurag
 * Since: 15 October,2015
 * Description: Sets the Value 
 **/
public class EmployeeListMain 
{
	// Map to store the Data
	public static ConcurrentHashMap<Integer, Employee> employeeMap = new ConcurrentHashMap<Integer, Employee>();
	// Count to check the Value
	static int count =1;
	/**
	 * Name : getAllEmployees
	 * @return
	 * Description: To store the Value
	 **/
	public static ConcurrentHashMap<Integer, Employee> getAllEmployees()
	{
		// Checking if running for the First time
		if(count==1)
		{
		employeeMap.put(1, new Employee("Anurag", 21, 1, new Date()));
		employeeMap.put(2, new Employee("Gaurav", 21, 2, new Date()));
		employeeMap.put(3, new Employee("SHISHIR", 21, 3, new Date()));
		employeeMap.put(4, new Employee("Sanjay", 21, 4, new Date()));
		employeeMap.put(5, new Employee("Ankur", 21, 5, new Date()));
		count++;
		}
		return employeeMap;
	}
}
