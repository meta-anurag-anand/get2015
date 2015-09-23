package com.metacampus.vehiclemanagement.model;
/**
 * Name: Car
 * @author anurag
 * Since:  14 September
 * Description: Description of bikes
 **/
public class Car extends Vehicle 
{
	private String AC;
	private String powerSteering;
	private String accessoryKit;
	
	// Returns boolean value for car
	
	public String getAC() 
	{
		return AC;
	}

	// Sets the value of ac
	public void setAC(String aC) 
	{
		AC = aC;
	}
	// Gets  the presence of power Steering
	public String getPowerSteering()
	{
		return powerSteering;
	}

	// Sets powerSteering availability of a car
	public void setPowerSteering(String powerSteering)
	{
		this.powerSteering = powerSteering;
	}

	// Gets accessoryKit is available in car or not
	 
	public String getAccessoryKit()
	{
		return accessoryKit;
	}

	// Set accessoryKit availability of a car

	public void setAccessoryKit(String accessoryKit)
	{
		this.accessoryKit = accessoryKit;
	}
	
	// Override toString function
	@Override
	public String toString() 
	{
		return super.toString()+",AC: "+getAC()+",Power Steering: "+getPowerSteering()+",Accessory Kit: "+getAccessoryKit();
	}

	// Calculate  the OnRoadPrice
	@Override
	public int calculateOnRoadPrice()
	{
		return super.calculateOnRoadPrice();
	}
}
