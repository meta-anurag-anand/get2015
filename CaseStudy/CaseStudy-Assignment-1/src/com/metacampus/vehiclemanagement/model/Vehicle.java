package com.metacampus.vehiclemanagement.model;
/**
 * Name: Vehicle
 * @author anurag
 * Since:  14 September
 * Description: Description of bikes
 **/
public class Vehicle
{
	// To store make of vehicel
	private String make;
	// to store model
	private String model;
	// To store engine capacity
	private String engineCC;
	// To store fuel Capacity
	private String fuelCapacity;
	// To store mileage
	private String mileage;
	
	// Sets Fuel capacity of vehicle
	public void setFuelCapacity(String fuelCapacity) 
	{
		this.fuelCapacity = fuelCapacity;
	}
	
	// Sets Mileage of vehicle 
	public void setMileage(String mileage) 
	{
		this.mileage = mileage;
	}
	
	// gets company name of a vehicle 
	public String getMake() 
	{
		return make;
	}
	
	//  Sets company name of a vehicle

	public void setMake(String make)
	{
		this.make = make;
	}
	
	//  Returns model of a vehicle

	public String getModel() 
	{
		return model;
	}
	
	// Method to set model of a vehicle
	public void setModel(String model)
	{
		this.model = model;
	}
	
	// Gets Engine Cubic capacity of a vehicle

	public String getEngineCC()
	{
		return engineCC;
	}
	
	// Sets Engine cubic capacity of a vehicle
	public void setEngineCC(String engineCC) 
	{
		this.engineCC = engineCC;
	}
	
	// Gets fuel Capacity of a vehicle

	public String getFuelCapacity()
	{
		return fuelCapacity;
	}
	// Gets mileage of a vehicle
	public String getMileage()
	{
		return mileage;
	}
	
	// this method returns basic details of a vehicle using to string function	
	public String toString() 
	{
		return "Make: "+getMake()+",Model: "+getModel()+",Engine CC: "+getEngineCC()+",Fuel Capacity: "+getFuelCapacity()+",Mileage: "+getMileage();
	}
}
