import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * Name: LinkedListImplement
 * @author anurag
 * Since: 31 August,2015
 * Description: Implementing the list function
 **/
public class LinkedListImplement
{
	// Static list
	static List<Integer> list = new LinkedList<Integer>();
	/**
	 * Name: main
	 * @param args
	 * @throws IOException
	 * Description: UserInterface and list Functions
	 **/
	public static void main(String args[]) throws IOException
	{
		DataInputStream abc = new DataInputStream(System.in);
		Scanner scan = new Scanner(System.in);
		// To store the choice
		int choice;
		// Input
		String input = "";
		// Menu for user interface
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Create a  list");
			System.out.println("2. Add an element to list");
			System.out.println("3. print the list");
			System.out.println("4. Exit the System");
			while (!scan.hasNextInt()) 
			{
				System.out.println("Please Enter Integer Only");
				scan.next();
			}
			choice = scan.nextInt();
			switch (choice)
			{
			case 1:
				// Adding to the list
				System.out.println("Enter the value to add");
				int value = scan.nextInt();
				list.add(value);
				list.sort(null);
				break;
			case 2:
				// Adding the value at index
				System.out.println("Enter the value to be added");
				int element = scan.nextInt();
				checkIndex(0, element);
				break;
			case 3:
				// Printing the list
				System.out.println("list is");
				System.out.println(list);
				break;
			case 4:
				// Existing the system
				System.out.println("System exiting");
				System.exit(0);
				break;
			default:
				System.out.println("enter correct value");
			}
			System.out.println("Enter y to continue otherwise press any key");
			input = abc.readLine();
		} while (input.equalsIgnoreCase("y"));
	}
    /**
     * Name: checkIndex
     * @param index
     * @param element
     * Description: checks the position and adds the value
     **/
	public static void checkIndex(int index, int element)
	{
		// Checking the index and adding at the last
		if (index == list.size())
		{
			list.add(element);
		} 
		// Adding at the position
		else if (((int) list.get(index) < element)&& ((index + 1) <= list.size()))
		{
			checkIndex(index + 1, element);
		}
		// adding the value
		else
		{
			list.add(index, element);
		}
	}
}
