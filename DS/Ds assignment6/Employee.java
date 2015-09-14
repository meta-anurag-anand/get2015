import java.util.Comparator;
/**
 * Name: Employee
 * @author Anurag
 * Since: 1 September,2015
 * Description: Stores the information of the Employee
 **/
public class Employee implements Comparable
{
	// To store Employee Id
	private Integer empId;
	// To store name
	private String name;
	// To store address
	private String address;
	// Getter of empId
	public Integer getEmpId()
	{
		return empId;
	}
	// Setter of empId
	public void setEmpId(Integer empId) 
	{
		this.empId = empId;
	}
	// Getter of name
	public String getName()
	{
		return name;
	}
	// Setter of name
	public void setName(String name)
	{
		this.name = name;
	}
	// Setter of Address
	public String getAddress() 
	{
		return address;
	}
	// Overiding to string function
	@Override
	public String toString()
	{
		return "Student [empId=" + empId + ", name=" + name + ", address="+ address + "]";
	}
	/**
	 * Name: Employee
	 * @param empId
	 * @param name
	 * @param address
	 * Description: Constructor of Employee Class
	 **/
	public Employee(Integer empId, String name, String address)
	{
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	// Setter of address
	public void setAddress(String address) 
	{
		this.address = address;
	}
	// Overrrides the Compare to Function
	public int compareTo(Object employeeObj)
	{
		// returns after Comaring the emp id
		return this.getEmpId().compareTo(((Employee) employeeObj).getEmpId());
	}
	// Overrides the hashCode Function
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	// Overrides the equals function 
	@Override
	public boolean equals(Object obj) 
	{
		// Checks for object
		if (this == obj)
		{
			return true;
		}
		// Checks for object being null
		if (obj == null)
		{
			return false;
		}
		// MAtches the object
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Employee other = (Employee) obj;
		// Matches the EmpId
		if (empId != other.empId)
		{
			return false;
		}
		return true;
	}
	/**
	 * Name: NameComparator
	 * @author Anurag
	 * Since: 1 September,2015
	 * Description: Creates the Comparator of name
	 **/
	static class NameComparator implements Comparator 
	{
		/**
		 * Name: compare
		 * Description: Overrides  the compare function matches the nameby comapre to function
		 **/
		public int compare(Object o1, Object o2)
		{
			// Creating the Employee object
			Employee e1 = (Employee) o1;
			// Creating the Employee object
			Employee e2 = (Employee) o2;
			return e1.getName().compareTo(e2.getName());
		}
	}
}
