package com.metacampus.vehiclemanagement.model;
/**
 * Name: Car
 * @author anurag
 * Since:  14 September
 * Description: Description of bikes
 **/
public class Car extends Vehicle 
{
	// specifications of  car
	private int numberOfAirbags;
	// To store seats
	private int numberOfSeats;
	// Returns number of airbags in a car
	public int getNumberOfAirbags()
	{
		return numberOfAirbags;
	}
	//  Sets number of airbags in car
	public void setNumberOfAirbags(int numberOfAirbags)
	{
		this.numberOfAirbags = numberOfAirbags;
	}
	//  Returns number of seats in a car 
	public int getNumberOfSeats() 
	{
		return numberOfSeats;
	}
	// sets number of seats in a car
	public void setNumberOfSeats(int numberOfSeats) 
	{
		this.numberOfSeats = numberOfSeats;
	}
	// Tostring method
	public String toString() 
	{
		return super.toString()+",Number of Airbags: "+
		getNumberOfAirbags()+",Number of Seats: "+getNumberOfSeats();
	}
}
