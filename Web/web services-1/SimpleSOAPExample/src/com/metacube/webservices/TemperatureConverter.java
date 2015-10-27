package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Name: TemperatureConverter
 * @author Anurag
 * Since: 26 October,2015
 * Description: WebServices function
 **/
@WebService
public class TemperatureConverter 
{
	/**
	 * Name: convert
	 * @param farenheit
	 * @return
	 * Description: Converting the Temprature into Celsius 
	 **/
	@WebMethod
	public double convert(double farenheit) 
	{
		// Returning the Temperature
		return (farenheit - 32) * 5/9;
	
	}

}