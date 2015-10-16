/**
 * Name: Employee
 * @author Anurag
 * Since: 16 October,2015
 * Description: Employee Details
 **/
public class Employee
{
	// To Store Employee Name
	String employeeName;
	// To Store Employee Id
	int employee_id;
	// To Store Employee  Email Id
	String email_id;
	// To Store Employee Date Of Birth
	String date_Of_Birth ;
	// To Store Employee Date Of Joining
	String date_Of_Joining;
	// To Store Employee ctc Per Annum
	int ctcPerAnnum;
	// Parametrized Constructor
	public Employee(String employeeName, int employee_id, String email_id,String date_Of_Joining)
	{
		super();
		this.employeeName = employeeName;
		this.employee_id = employee_id;
		this.email_id = email_id;
		this.date_Of_Joining = date_Of_Joining;
		
	}
	// Constructor
	public Employee()
	{
		this.ctcPerAnnum=18000;
		this.date_Of_Birth="";
		this.date_Of_Joining="";
		
	}
	// getter Of employee Name
	public String getEmployeeName()
	{
		return employeeName;
	}
	// setter Of Employee Name
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	// Getter Of employee Id
	public int getEmployee_id()
	{
		return employee_id;
	}
	// Setter Of Employee Id
	public void setEmployee_id(int employee_id) 
	{
		this.employee_id = employee_id;
	}
	// Getter Of Email Id
	public String getEmail_id() 
	{
		return email_id;
	}
	// Setter of email Id
	public void setEmail_id(String email_id)
	{
		this.email_id = email_id;
	}
	// Getter Of Date Of Birth
	public String getDate_Of_Birth() 
	{
		return date_Of_Birth;
	}
	// Sets The Date OF birth
	public void setDate_Of_Birth(String date_Of_Birth)
	{
		this.date_Of_Birth = date_Of_Birth;
	}
	// Gets DAte of Joinig
	public String getDate_Of_Joining()
	{
		return date_Of_Joining;
	}
	// Sets The  Date Of joining
	public void setDate_Of_Joining(String date_Of_Joining) 
	{
		this.date_Of_Joining = date_Of_Joining;
	}
	// Gets The Ctc Per Annum
	public int getCtcPerAnnum()
	{
		return ctcPerAnnum;
	}
	// Sets The Ctc Per Annum
	public void setCtcPerAnnum(int ctcPerAnnum) 
	{
		this.ctcPerAnnum = ctcPerAnnum;
	}

}
