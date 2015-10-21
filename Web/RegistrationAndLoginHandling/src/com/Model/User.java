package com.Model;
/**
 * Name:User
 * @author Anurag
 * Since: 20 October,2015
 * Description: User information of the User
 **/
public class User
{
	// UserId of the User
	private String userid;
	// Password of the User
	private String password;
	// Email of the User
	private String email;
	// Gets the Email
	public String getEmail() 
	{
		return email;
	}
	// Sets the Email
	public void setEmail(String email) 
	{
		this.email = email;
	}
	// Gets the UserId
	public String getUserid() 
	{
		return userid;
	}
	// sets the UserId
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}
	// Gets the Password
	public String getPassword() 
	{
		return password;
	}
	// sets The Password
	public void setPassword(String password)
	{
		this.password = password;
	}
}
