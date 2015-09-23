package com.metacampus.vehiclemanagement.printer;

import com.metacampus.vehiclemanagement.model.Vehicle;
/**
 * Name: VehicleDetailPrinter
 * @author anurag
 * Since: 14 September,2015
 * Description: Details of vehicle
 **/
public class VehicleDetailPrinter 
{
	/**
	 * Name: printVehicleDetails
	 * @param vehicle
	 * @return
	 * Description: prints the detail of vehicle through tostring method
	 **/
	public static String printVehicleDetails(Vehicle vehicle) 
	{
		return vehicle.toString();
	}

}
