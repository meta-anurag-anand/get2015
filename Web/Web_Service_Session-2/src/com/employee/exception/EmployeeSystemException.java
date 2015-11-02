package com.employee.exception;
/**
 * Name: EmployeeSystemException
 * @author Anurag
 * Since: 2 November,2015
 * Description: Employee System Exception is Handeled 
 **/
public class EmployeeSystemException extends EmployeeException 
{
	public EmployeeSystemException(String message)
	{
		super(message);
	}

	public EmployeeSystemException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	
}
