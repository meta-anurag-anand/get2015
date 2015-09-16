package Jdbc1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 * Name: TitleInterfcae
 * @author Anurag
 * Since: 16 September,2015
 * Description: Interface of the Database updation
 **/
public class TitleInterface 
{
	/**
	 * Name: main
	 * @param args
	 * Description: user Interface
	 **/
	public static void main(String[] args) 
	{
		System.out.println("Database Connectivity to fetch data");
		DataInputStream obj = new DataInputStream(System.in);
		// Option to store the choice
		String option= "";
		do
		{
			try
			{
				// Calling the Action
				action();
				System.out.println("Enter y to continue other value to exit");
				// Taking the Choice
				option= obj.readLine();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}while(option.equalsIgnoreCase("y"));
	}
	
	/**
	 * Name: action
	 * @throws IOException
	 * Description: performs the action when called by the user
	 **/
	public static void action() throws IOException 
	{
		// Menu printing
		Scanner sc = new Scanner(System.in);
		DataInputStream abc= new DataInputStream(System.in);
		System.out.print("\nPress 1: To find the books by authors name \nPress 2: To insert the value in the book Issue table \npress 3: TO delete books which has not been issued in 1 year \npress 4: To exit\n");
		System.out.println("Enter the Choice");
		// taking the Choice
		int option = sc.nextInt();
		switch (option) 
		{
		// To Find the Books
		case 1:
			String authorName;
			System.out.print("\n Enter Author Name : ");
			authorName = sc.next();
			// List of the titles
			ArrayList<Helper> titleList = Helper.getBooksByAuthorName(authorName);
			Iterator<Helper> iterator = titleList.iterator();
			// Checking the List
			if (titleList.size() == 0) 
			{
				System.out.println("No such Records Present");
			} 
			else 
			{
				// Printing the Books
				System.out.println("\n Books are :");
				while (iterator.hasNext())
				{
					// Calling the Iterator
					System.out.println(iterator.next().getTitleName() + " ");
				}
			}
			break;
			// To Insert the Values
		case 2:
			// To store the Book Name
			String bookName;
			System.out.println("\n\n Updating the Table");
			System.out.print("\n Enter title of Book : ");
			bookName = abc.readLine();
			// Counting the Books and checking if updated or not
			int flag = Helper.bookIssueByBookName(bookName);
			if (flag == 0) 
			{
				System.out.println("\n Book can't be issued ");
			} 
			else 
			{
				System.out.println("\n Book has issued");
			}
			break;
			// Deleting the books not issue in 1 year
		case 3:
			System.out.println("\n Delete all those books which were not issued in last 1 year");
			// Calling the function
			int deletedBooks = Helper.deleteBooksLaterThan1Year();
			if (deletedBooks == 0)
			{
				System.out.println("\n No such books");
			} 
			else 
			{
				// printing the Deleted value
				System.out.println("\n Number of books is deleted are : "+ deletedBooks);
			}
			break;
			// System exit
		case 4:
			System.out.println(" System exiting");
			System.exit(1);
			break;
		default:
			System.out.println("No such option");
		}
	}
}
