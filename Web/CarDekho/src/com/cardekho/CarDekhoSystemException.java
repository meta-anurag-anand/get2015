package com.cardekho;

public class CarDekhoSystemException extends CarDekhoException 
{
	// Constructor Message
	public CarDekhoSystemException(String message)
	{
		super(message);
	}
	// Sets the Message
	public CarDekhoSystemException(String message, Throwable cause) 
	{
		super(message, cause);
	}
}
