package com.modal;

import java.util.Date;
/**
 * Name: Employee
 * @author Anurag
 * Since: 15 October,2015
 * Description: Employee Details
 **/
public class Employee
{
	
	// To store name
	private String name = "";
	// To store age
	private int age;
	// To Store EmployeeId
	private int employeeID;
	// To store Date
	private java.util.Date lastUpdated;
	// To store Date of Registration
	private final java.util.Date dateOfRegistration = new Date();
	// Constructor
	public Employee(String name, int age, int employeeID, java.util.Date lastUpdated) 
	{
		super();
		this.name = name;
		this.age = age;
		this.employeeID = employeeID;
		this.lastUpdated = lastUpdated;
	}
	/**
	 * Name:replaceEmployee
	 * @param name
	 * @param age
	 * @param employeeID
	 * @return
	 * Description: To store The Data after being replaced
	 */
	public Employee replaceEmployee(String name, int age, int employeeID)
	{
		this.name = name;
		this.age = age;
		this.employeeID = employeeID;
		this.lastUpdated = new Date();
		
		return this;
	}
	// gets the Date
	public java.util.Date getLastUpdated() 
	{
		return lastUpdated;
	}
	// sets the Date
	public void setLastUpdated(java.util.Date lastUpdated) 
	{
		this.lastUpdated = lastUpdated;
	}
	// To string method Overrided
	@Override
	public String toString() 
	{
		
		return "Employee Name: " + name + "\nEmployee ID: " + employeeID + "\nAge: " + age 
				+ "\nDate of Registration: " + dateOfRegistration + "\n Last Updated: " + lastUpdated;
	}
	// Gets the Name
	public String getName()
	{
		return name;
	}
	// Sets the Name
	public void setName(String name) 
	{
		this.name = name;
	}
	// Gets the Age
	public int getAge() 
	{
		return age;
	}
	// Sets the Age
	public void setAge(int age)
	{
		this.age = age;
	}
	// Gets The Employee Id
	public int getEmployeeID()
	{
		return employeeID;
	}
	// Sets the Employee Id
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}
	// Gets The Date
	public java.util.Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	
}
