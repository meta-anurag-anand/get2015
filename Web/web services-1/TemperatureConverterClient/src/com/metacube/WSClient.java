package com.metacube;

import java.util.Scanner;

import com.metacube.webservices.TemperatureConverter;
import com.metacube.webservices.TemperatureConverterServiceLocator;
/**
 * Name: WSClient
 * @author Anurag
 * Since: 26 October,2015
 * Description: UserInterface
 **/
public class WSClient 
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String[] args) 
	{
		// Finding the Location of the Web Services
		TemperatureConverterServiceLocator locator = new TemperatureConverterServiceLocator();
		// Getting the end point
		locator.setTemperatureConverterEndpointAddress("http://localhost:8080/SimpleSOAPExample/services/TemperatureConverter");
		try
		{
			Scanner sc= new Scanner(System.in);
			TemperatureConverter object = locator.getTemperatureConverter();
			System.out.println("Enter the Temperature to be converted to Celsius ");
			double farenhiet = sc.nextDouble();
			System.out.println("Temperature in celsius");
			System.out.println(object.convert(farenhiet));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}






