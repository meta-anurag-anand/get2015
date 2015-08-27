import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
/**
 * Name: CounselingSystem
 * @author anurag
 * Since: 26 August,2015
 * Description: Allots the seats 
 **/
public class CounselingSystem
{
	// To store the students List
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	// To Store College List
	private static ArrayList<College> collegeList = new ArrayList<College>();
	// Hash MAp to store the alloted  list
	private static HashMap<String, String> finalallotment = new HashMap<String, String>();
	private static Queue studentQueue;
	static Scanner scan = new Scanner(System.in);
	/**
	 * Name:getResources
	 * @throws IOException
	 * Description: Gets the resources required
	 **/
	public void getResources() throws IOException
	{
		System.out.println("Enter the no Of students ");
		while (!scan.hasNextInt()) 
		{
			System.out.println("That's not a number!");
			scan.next();
		}
		int n = scan.nextInt();
		addStudents(n);
		collegeList.add(new College("college1", 5));
		collegeList.add(new College("college2", 5));
		collegeList.add(new College("college3", 5));
		collegeList.add(new College("college4", 5));
		collegeList.add(new College("college5", 5));
	}
	/**
	 * Name: addStudents
	 * @param noOfStudents
	 * @return
	 * @throws IOException
	 * Description: adds  students to the list
	 */
	public ArrayList<Student> addStudents(int noOfStudents) throws IOException 
	{
		DataInputStream abc = new DataInputStream(System.in);
		for (int i = 1; i <= noOfStudents; i++) 
		{
			System.out.println("Enter the name");
			// To store the name
			String name = abc.readLine();
			// Validation
			if (!validateFirstName(name))
			{
				System.out.println("UserName Should be in alphabets");
				name = abc.readLine();
			} 
			else 
			{
			}
			studentList.add(new Student(name, i));
		}
		return studentList;
	}
	/**
	 * Name: validateFirstName
	 * @param firstName
	 * @return
	 * Description: validates the name
	 **/
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[a-zA-Z]*");
	}
	/**
	 * Name: enqueueStudents
	 * Description: Stotres in Enqueue
	 **/
	protected void enqueueStudents()
	{
		studentQueue = new Queue(100);
		// Storing in StudentQueue
		for (int count = 1; count <= studentList.size(); count++) 
		{
			for (Student student : studentList) 
			{
				if (student.getRank() == count)
				{
					studentQueue.enqueue(student);
				}
			}
		}
	}
	/**
	 * Name: printCollegeList
	 * Description:Prints the details of college list
	 */
	protected static void printCollegeList() 
	{
		int i = 1;
		System.out.println("COLLEGE NAME"+"  "+"Avaliablity");
		// prints the list
		for (College college : collegeList)
		{
			System.out.println(i + "   " + college.getName() + " "+ college.getNoOfSeatsAvailable());
			i++;
		}
	}
	/**
	 * Name:councelingProcess
	 * Description: Does the whole Counceling of Students and does the mapping
	 */
	protected void councelingProcess() 
	{
		while (true)
		{
			Student student = (Student) studentQueue.dequeue();
			if (student != null)
			{
				// Getting The details
				System.out.println("Welcome " + student.getName()+ " with your rank " + student.getRank());
				System.out.println("Enter your choice");
				printCollegeList();
				// Validation
				while (!scan.hasNextInt())
				{
					System.out.println("That's not a number!");
					scan.next();
				}
				int choice = betweenExclusive(scan.nextInt());
				// College Lists
				College college = collegeList.get(choice - 1);
				if (college.getNoOfSeatsAvailable() > 0)
				{
					college.setNoOfSeatsAvailable(college.getNoOfSeatsAvailable() - 1);
					// mapping to hash map
					finalallotment.put(student.getName(), college.getName());
					System.out.println(" you have been alloted the college: "+ college.getName());
				} 
				else
				{
					System.out.println("not available you are transfer to next round");
					//studentQueue.enqueue(student);
				}

			} 
			else 
			{
				break;
			}
		}
	}
	/**
	 * Name: Main function
	 * @param args
	 * @throws IOException
	 * Description: UserInterface
	 */
	public static void main(String args[]) throws IOException 
	{
		// Calling The menu
		System.out.println("Councelling Manangement System");
		Menu obj = new Menu();
		obj.menuDisplay();
	}
	/**
	 * Name: displayList
	 * Description: Displays the list of alloted candidates
	 */
	public static void displayList() 
	{
		if (finalallotment.size() != 0)
		{
			System.out.println("Name Of Candidate" + "\t" + "College Name");
			for (Entry<String, String> m : finalallotment.entrySet())
			{
				System.out.println(m.getKey() + "\t\t\t" + m.getValue());
			}
		} 
		// null list
		else
		{
			System.out.println(" No Allotments till now");
		}
	}
	/**
	 * Name betweenExclusive
	 * @param x
	 * @return
	 * Description: Validation to check between Two Numbers
	 */
	public static int betweenExclusive(int x)
	{
		if (x > 0 && x < 6)
		{
			return x;
		}
		else 
		{	
			// Recursive call
			System.out.print("enter the value in range");
			while (!scan.hasNextInt())
			{
				System.out.println("That's not a number!");
				scan.next();
			}
			return betweenExclusive(scan.nextInt());
		}
	}
}
