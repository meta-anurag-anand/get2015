import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 * Name: AvoidDuplicateEntry
 * @author Anurag
 * Since: 1 September,2015
 * Description: Avoids Duplicate entry of records
 **/
public class AvoidDupliacteEntry 
{
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String args[]) 
	{
		// To store the set
		Set<Employee> set = new HashSet<Employee>();
		// To store the choice
		String choice = "";
		Scanner scan = new Scanner(System.in);
		DataInputStream abc = new DataInputStream(System.in);
		System.out.println("!!! Duplicate Record Removals!!!");
		System.out.println("Enter the records ");
		try
		{
			do 
			{
				// Storing the previous size of set
				int prevSize = set.size();
				System.out.println("Enter the EmployeeID");
				// Storing the employee id
				while (!scan.hasNextInt()) 
				{
					System.out.println("Please Enter Integer Only");
					scan.next();
				}
				int employeeId = scan.nextInt();
				System.out.println("Enter the name");
				// Storing the employee name
				String employeeName = abc.readLine();
				System.out.println("Enter the address");
				// Storing the employee address
				String employeeAddress = abc.readLine();
				// Adding the value to set
				set.add(new Employee(employeeId, employeeName, employeeAddress));
				if (prevSize == set.size())
				{
					System.out.println("User Information already entered");
				}
				System.out.println("Enter y to add more records and press other key to exit");
				// Input of choice
				choice = abc.readLine();
			} while (choice.equalsIgnoreCase("y"));
			// Printing the set
			System.out.println(set);
		}
		catch (Exception e)
		{
			System.out.println(set);
		}
	}
}
