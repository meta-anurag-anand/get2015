package com.cardekho.model;

import java.util.Date;
/**
 * Name: BaseModel
 * @author Anurag
 * Description: Meta Data content
 **/
public class BaseModel 
{
	// zto store id
	private int id;
	// To store CreatedBy
	private String createdBy;
	// To store Created Time
	private Date createdTime;
	// To Store LastModifiedTime
	private Date lastModifiedTime;
	// Gets The LAstModified
	public Date getLastModifiedTime()
	{
		return lastModifiedTime;
	}
	// Sets the LastModifiedTime
	public void setLastModifiedTime(Date lastModifiedTime)
	{
		this.lastModifiedTime = lastModifiedTime;
	}
	// Gets The Id
	public int getId()
	{
		return id;
	}
	// Sets the Id
	public void setId(int id) 
	{
		this.id = id;
	}
	//Gets the Created By
	public String getCreatedBy()
	{
		return createdBy;
	}
	// Sets the Created By
	public void setCreatedBy(String createdBy) 
	{
		this.createdBy = createdBy;
	}
	// Gets The  Created Tie
	public Date getCreatedTime() 
	{
		return createdTime;
	}
	// sets the CreateDTime
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

}