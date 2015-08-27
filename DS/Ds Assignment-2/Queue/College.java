class College 
{
	// To store Name
	private String name;
	// To store Seats Available
	private int noOfSeatsAvailable;
	// Constructor
	public College(String name, int noOfSeatsAvailable)
	{
		this.name = name;
		this.noOfSeatsAvailable = noOfSeatsAvailable;
	}
	// gets the value
	public String getName()
	{
		return name;
	}
	// Sets the value
	public void setName(String name)
	{
		this.name = name;
	}
	// gets the value
	public int getNoOfSeatsAvailable()
	{
		return noOfSeatsAvailable;
	}
	// Sets the value
	public void setNoOfSeatsAvailable(int noOfSeatsAvailable)
	{
		this.noOfSeatsAvailable = noOfSeatsAvailable;
	}

}
