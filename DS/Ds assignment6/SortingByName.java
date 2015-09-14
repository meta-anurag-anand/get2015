import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * Name: SortingByName
 * @author Anurag
 * Since: 1 September,2015
 * Description: Sorting by name of the Records
 **/
public class SortingByName extends Employee
{
	// constructor
	public SortingByName(Integer empId, String name, String address) 
	{
		super(empId, name, address);
	}
	/**
	 * Name: main 
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String args[]) 
	{
		// List of Employee class
		List<Employee> list = new ArrayList<Employee>();
		// To store the Choice
		String choice = "";
		Scanner scan = new Scanner(System.in);
		DataInputStream abc = new DataInputStream(System.in);
		System.out.println("!!!!Sorting Record By Name!!!!");
		System.out.println("Enter the records ");
		try
		{
			do 
			{
				System.out.println("Enter the EmployeeID");
				// Id for the Employee
				while (!scan.hasNextInt()) 
				{
					System.out.println("Please Enter Integer Only");
					scan.next();
				}
				int employeeId = scan.nextInt();
				System.out.println("Enter the name");
				// Employee Name
				String employeeName = abc.readLine();
				System.out.println("Enter the address");
				// Employee Address
				String employeeAddress = abc.readLine();
				list.add(new Employee(employeeId, employeeName, employeeAddress));
				// Sorting the List on the based of comparator
				Collections.sort(list, new NameComparator());
				System.out.println("Enter y to add more records and press other key to exit");
				// Entering the Choice
				choice = abc.readLine();
			} while (choice.equalsIgnoreCase("y"));
			// Printing the Sorted List
			System.out.print("Sorted List: ");
			System.out.println(list);
		} 
		catch (Exception e)
		{
			System.out.println("Error");
		}
	}
}
