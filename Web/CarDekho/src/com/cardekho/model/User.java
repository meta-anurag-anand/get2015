package com.cardekho.model;
/**
 * Name: User
 * @author Anurag
 * Since: 26 October,2015
 * Description: user Information
 **/
public class User
{
	// UserName
	private String username;
	// Password
	private String password;
	// To store name
	private String name;
	// To Store email
	private String email;
	// Gets The Name
	public String getName()
	{
		return name;
	}
	// Sets The NAme
	public void setName(String name) 
	{
		this.name = name;
	}
	// Gets The Email
	public String getEmail()
	{
		return email;
	}
	//  Sets the Email
	public void setEmail(String email) 
	{
		this.email = email;
	}
	// Gets The UserNAme
	public String getUsername() 
	{
		return username;
	}
	// Sets The UserANme
	public void setUsername(String username) 
	{
		this.username = username;
	}
	// Gets The Password
	public String getPassword() 
	{
		return password;
	}
	// Sets the Password
	public void setPassword(String password)
	{
		this.password = password;
	}
}
