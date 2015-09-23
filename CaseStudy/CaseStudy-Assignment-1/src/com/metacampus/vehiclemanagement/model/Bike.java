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
	private int numberOfGears;
	// To store the typeOfSeat
	private String typeOfSeat;
	
	// Method to get Number of gears of a bike 
	public int getNumberOfGears() 
	{
		return numberOfGears;
	}
	
	// Method to set number of gears of a bike
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	// Method to get Type of seat of a bike 
	public String getTypeOfSeat() 
	{
		return typeOfSeat;
	}
	
	// Method to set Type of seat of a bike
	public void setTypeOfSeat(String typeOfSeat)
	{
		this.typeOfSeat = typeOfSeat;
	}
	// To string method Called
	public String toString() 
	{
		return super.toString()+",Number of Gears: "+
		getNumberOfGears()+",Type of Seat: "+getTypeOfSeat();
	}

}
