package com.metacampus.vehiclemanagement.model;
/**
 * Name: Bike
 * @author anurag
 * Since:  14 September
 * Description: Description of bikes
 **/
public class Bike extends Vehicle 
{
	// To store number of seats 
	private String selfStart;
	// To store the typeOfSeat
	private int helmetPrice;
	
	// Method to get Number of gears of a bike 
	public String getSelfStart()
	{
		return selfStart;
	}

	// Getter of self start
	public void setSelfStart(String selfStart)
	{
		this.selfStart = selfStart;
	}
	// Method to get helmet price of a bike
	public int getHelmetPrice()
	{
		return helmetPrice;
	}

	// Method to set helmet price of a bike
	public void setHelmetPrice(int helmetPrice)
	{
		this.helmetPrice = helmetPrice;
	}

	// Tostring method is overriden
	public String toString() 
	{
		return super.toString()+",Helmet Price: "+getHelmetPrice()+",Self Start: "+getSelfStart();
	}

	// Method to calculate on road price of a bike 
	@Override
	public int calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}	
}
