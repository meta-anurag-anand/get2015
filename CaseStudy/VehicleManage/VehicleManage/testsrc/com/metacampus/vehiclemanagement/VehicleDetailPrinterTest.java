package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;
/**
 * Name: VehicleDetailPrinterTest
 * @author Anurag
 * Description: Checks the value which will be stored in database
 **/
public class VehicleDetailPrinterTest
{
	/**
	 * Name testToStringCar
	 * Description: tests the value Stored in Car
	 **/
	@Test
	public void testToStringCar()
	{
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		String s = "Make: Hyundai,Model: Verna,Engine CC: 1200 CC,Fuel Capacity: 60 Liters,Mileage: 21 km/pl,Price: 900000,Road Tax: 78000,AC: YES,Power Steering: YES,Accessory Kit: YES";
		assertEquals(s , VehicleDetailPrinter.printVehicleDetails(carObj));
	}
	/**
	 * Name testToStringCarNullTest
	 * Description: tests the value Stored in Car
	 **/
	@Test
	public void testToStringCarNullTest() 
	{
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertNotNull(carObj);
	}
	/**
	 * Name testToStringBike
	 * Description: tests the value Stored in bike
	 **/
	@Test
	public void testToStringBike() 
	{
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		String s = "Make: TVS,Model: Apache,Engine CC: 180 CC,Fuel Capacity: 14 Liters,Mileage: 40 km/pl,Price: 80000,Road Tax: 7800,Helmet Price: 1000,Self Start: YES";
		assertEquals(s , VehicleDetailPrinter.printVehicleDetails(bikeObj));
	}
	/**
	 * Name testToStringBikeNull
	 * Description: tests the value Stored in Bike
	 **/
	@Test
	public void testToStringBikeNullTest()
	{
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertNotNull(bikeObj);
	}
	/**
	 * Name: testPrintOnRoadPriceCar
	 * Description: Tests the Value of on road price 
	 **/
	@Test
	public void testprintOnRoadPriceCar()
	{
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertEquals(978000 , VehicleDetailPrinter.printOnRoadPrice(carObj));
	}
	/**
	 * Name: testprintOnRoadPriceCar
	 * Description: checks the value for null 
	 **/
	@Test
	public void testprintOnRoadCarNullTest() {
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertNotNull(carObj);
	}
	/**
	 * Name: testPrintOnRoadPriceBike
	 * Description: Tests the Value of on road price 
	 **/
	@Test
	public void testprintOnRoadBike()
	{
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertEquals(87800 , VehicleDetailPrinter.printOnRoadPrice(bikeObj));
	}
	/**
	 * Name: testprintOnRoadPriceBike
	 * Description: checks the value for null 
	 **/
	@Test
	public void testprintOnRoadBikeNullTest() {
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertNotNull(bikeObj);
	}
}
