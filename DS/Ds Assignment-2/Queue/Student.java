/**
 * Name: Student
 * @author anurag
 * Since: 26 August,2015
 * Description: Creates the student details
 **/
class Student
{
	// To Store Name
	private String name;
	// To store Rank
	private int rank;
	// Constructor
	public Student(String name, int rank) 
	{
		this.name = name;
		this.rank = rank;
	}
	// Sets the value
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
	public int getRank()
	{
		return rank;
	}
	// gets the value
	public void setRank(int rank)
	{
		this.rank = rank;
	}
}