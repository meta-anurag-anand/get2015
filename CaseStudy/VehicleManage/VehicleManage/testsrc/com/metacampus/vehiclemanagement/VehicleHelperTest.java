package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;
import org.junit.Test;
import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
/**
 * Name: VehicleHelperTest
 * @author Anurag
 * Description: Checks the value which will be stored in database
 **/
public class VehicleHelperTest 
{
	/**
	 * Name: testCreateCar
	 * Description: create the car object and allots the value 
	 **/
	@Test
	public void testCreateCar()
	{
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertEquals("Hyundai", carObj.getMake());
	}
	/**
	 * Name: testCreateCarNullTest
	 * Description: create the car object and allots the value 
	 **/
	@Test 
	public void testCreateCarNullTest() 
	{
		Car carObj = VehicleHelper.createObject("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertNotNull(carObj);
	}
	/**
	 * Name: testCreateBike
	 * Description: create the car object and allots the value 
	 **/
	@Test
	public void testCreateBike()
	{
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertEquals("180 CC",  bikeObj.getEngineCC());
	}
	/**
	 * Name: testCreateBikeNullTest
	 * Description: create the car object and allots the value 
	 **/
	@Test
	public void testCreateBikeNullTest() 
	{
		Bike bikeObj = VehicleHelper.createObject("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertNotNull(bikeObj);
	}

}
