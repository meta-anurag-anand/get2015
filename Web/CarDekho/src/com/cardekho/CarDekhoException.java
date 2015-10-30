package com.cardekho;

public class CarDekhoException extends Exception {
	// Constructor To return message
	public CarDekhoException(String message) 
	{
		super(message);
	}
	// To Store The Message 
	public CarDekhoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
