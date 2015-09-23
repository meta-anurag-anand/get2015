package com.metacampus.vehiclemanagement.xml;

import java.util.List;

import com.metacampus.vehiclemanagement.model.Vehicle;
/**
 * Name: XmlInterface 
 * @author Anurag
 * Since: 22 September,2015
 * Description: Reads the value and returns the value
 **/
public class XmlInterface
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 */
	public static void main(String args[])
	{
		// Reads the File and prints the value
		ReadVehicleData read = new ReadVehicleData();
		// Retrieving values from list
		List<Vehicle> readConfig = read.readData("VehicleData.xml");
		for (Vehicle item : readConfig) 
		{
			System.out.println(item);
		}
	}
}