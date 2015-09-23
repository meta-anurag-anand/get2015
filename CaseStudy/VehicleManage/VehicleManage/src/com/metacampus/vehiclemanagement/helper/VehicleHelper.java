package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
/**
 * Name: VehicleHelper
 * @author anurag
 * Since: 14 September,2015
 * Descriprtion: Create the object
 *
 **/
public class VehicleHelper 
{
	/**
	 * Name: createObject
	 * @param make : Company Name
	 * @param model : Model Name
	 * @param engineCC : Engine CC
	 * @param fuelCapacity : Fuel Capacity
	 * @param mileage : Mileage 
	 * @return Vehicle Object
	 * Description: creates the object of vehicle
	 **/
	public static Vehicle createObject(String make, String model, String engineCC, String fuelCapacity, String mileage, int price, int roadTax)
	{
		// object of vehicle
		Vehicle vehicle = new Vehicle();
		// updating the details
		update(make, model, engineCC, fuelCapacity, mileage, price, roadTax, vehicle);
		return vehicle;
	}
	
	/**
	 * Name: update 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param vehicle
	 * Description: Update the details of  model
	 **/
	private static void update(String make, String model,String engineCC,String fuelCapacity, String mileage, int price, int roadTax,Vehicle vehicle)
	{
		// calling the functions of vehicle
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineCC(engineCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMileage(mileage);
		vehicle.setPrice(price);
		vehicle.setRoadTax(roadTax);
	}
	
	/** 
	 * Name: create Object of bike
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param numberOfGears
	 * @param typeOfSeat
	 * @return Bike Object
	 * Description: create object of bike
	 **/
	public static Bike createObject( String vehicleType,String make, String model,String engineCC, String fuelCapacity,String mileage,int price, int roadTax, String selfStart, int helmetPrice) 
	{
		// updating details of bike
		Bike bike = new Bike();
		update(make, model, engineCC, fuelCapacity, mileage, price, roadTax, bike);
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		return bike;
	}
	
	/**
	 * Name: createObject
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param numberOfAirbags
	 * @param numberOfSeats
	 * @return Car Object
	 * Description: create object of the car 
	 **/
	public static Car createObject(String vehicleType,String make, String model,String engineCC, String fuelCapacity,String mileage, int price, int roadTax, String aC, String powerSteering, String accessoryKit)
	{
		// updating the details
		Car car = new Car();
		update(make, model, engineCC, fuelCapacity, mileage, price, roadTax, car);
		// updating the carQuality
		car.setAC(aC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;
	}

}
