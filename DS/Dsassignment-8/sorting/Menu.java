import java.io.DataInputStream;
import java.util.Scanner;
/**
 * Name: Menu
 * @author Anurag
 * Since: 3 September,2015
 * Description: Displays the menu
 **/
public class Menu
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String args[])
	{
		Menu menu = new Menu();
		menu.menuDisplay();
	}
	/**
	 * Name: menuDisplay
	 * Description: Displays the menu of the Sorting
	 **/
	public void menuDisplay()
	{
		Scanner scan = new Scanner(System.in);
		DataInputStream abc = new DataInputStream(System.in);
		// Choice of user
		int choice = 0;
		// No of elements
		int noOfElements = 0;
		// Input Array
		int[] input = null;
		// Option to continue or exit
		String option = "";
		System.out.println("Sorting Of Given Input");
		try
		{
			do
			{
				System.out.println("Press 1 For creating the Unsorted list");
				System.out.println("Press 2 For Sorting using the Linear Techinque");
				System.out.println("Press 3 For Sorting the Comparison Technique");
				System.out.println("Press 4 To Display the list");
				System.out.println("Press 5 To exit ");
				System.out.println("Enter the Choice");
				choice = scan.nextInt();

				switch (choice) 
				{
					//Creation of list 
					case 1:
						System.out.println("Enter number of integer elements");
						noOfElements = scan.nextInt();
						input = new int[noOfElements];
						System.out.println("\nEnter " + noOfElements+ " integer elements");
						for (int i = 0; i < noOfElements; i++) 
						{
							while (!scan.hasNextInt()) 
							{
								System.out.println("Please Enter Integer Only");
								scan.next();
							}
							// Storing the result
							input[i] = scan.nextInt();
						}
						break;
					case 2:
						// Linear Sorting
						Sort sort = new Sort();
						if (noOfElements <= 10) 
						{
							// Bubble sorting
							sort.bubbleSort(input);
						} else
						{
							// QuickSorting
							sort.quickSort(input);
						}
						break;
					case 3:
						// Comparison Sorting
						Sort obj = new Sort();
						int largest = -1;
						// Checking the Sorting
						for (int number : input) 
						{
							if (number > largest)
							{
								largest = number;
							}
						}
						if (largest < 99) 
						{
							// Calling the Counting Sort
							obj.countingSort(input);
						} 
						else
						{
							// Radix Sort
							obj.radixSort(input);
						}
						break;
					case 4:
						// Printing the Sorted Array
						System.out.println("Sorted Array");
						for (int i = 0; i < input.length; i++)
						{
							System.out.print(input[i] + "\t");
						}
						System.out.println();
						break;
					case 5:
						// Exiting thr System
						System.out.println("System is Exiting");
						System.exit(1);
	
					default:
						System.out.println("Wrong Input");
				}
				System.out.println("Enter y to continue and other letter to exist");
				option = abc.readLine();
			} while (option.equalsIgnoreCase("Y"));
		}
		catch (Exception e)
		{
			System.out.println("Enter the value in Correct Format");
		}

	}
}