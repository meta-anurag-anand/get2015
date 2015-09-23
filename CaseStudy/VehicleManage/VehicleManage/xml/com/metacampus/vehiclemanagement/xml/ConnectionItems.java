package com.metacampus.vehiclemanagement.xml;

public class ConnectionItems 
{
	// url of the database
	private String url;
	// driver 
	private String driver;
	// Username
	private String username;
	// Password
	private String password;
	// getter of url
	public String geturl() 
	{
		return url;
	}
	// set the url
	public void setUrl(String url)
	{
		this.url = url;
	}
	// gets the driver
	public String getDriver()
	{
		return driver;
	}
	// sets the Driver
	public void setDriver(String driver) 
	{
		this.driver = driver;
	}
	// Gets Username
	public String getUsername()
	{
		return username;
	}
	// Sets the username
	public void setUsername(String username) 
	{
		this.username = username;
	}
	// Gets the password
	public String getPassword()
	{
		return password;
	}
	// Sets the password
	public void setPassword(String password)
	{
		this.password = password;
	}
	// To string method to ovveride
	@Override
	public String toString()
	{
		return "[url=" + url + ", driver=" + driver + ", username=" + username
				+ ", password=" + password + "]";
	}
}
