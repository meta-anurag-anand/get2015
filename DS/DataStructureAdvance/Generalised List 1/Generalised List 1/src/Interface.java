import java.util.Scanner;

/**
 * Name: Interface
 * @author anurag
 * Since: 2 October, 2015
 * Description: Interface of the List
 **/
public class Interface 
{
	public static void main(String[] args) 
	{
		//Intializing the List
		List list = null;
		Scanner scanner = new Scanner(System.in);
		String input = null;
		// Intializing the Choice
		int choice = -1;
		do 
		{
			// Printing the Menu
			Interface.printMenu();
			while (!scanner.hasNextInt()) 
			{
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			// Checking the choice
			while (choice < 1 || choice > 8) 
			{
				System.out.println("Please enter valid integer!");
				choice = scanner.nextInt();
			}
			// Choice To be entered
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the Input ");
				input = scanner.next();
				break;
			case 2:
				if (input == null)
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println(Validation.isExpression(input));
				break;
			case 3:
				if (input == null)
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list = new List(input);
				break;
			case 4:
				if (input == null)
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list.traverse(list.first);
				break;
			case 5:
				if (input == null) 
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Max = " + list.max());
				break;
			case 6:
				if (input == null)
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Sum = " + list.sum());
				break;
			case 7:
				if (input == null)
				{
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Enter an element to find");
				while (!scanner.hasNextInt()) 
				{
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				int searchingElement = scanner.nextInt();
				System.out.println("Find = "+ list.findElement(searchingElement));
				break;
			case 8:
				scanner.close();
				System.exit(0);
			}
		} while (choice != 8);
	}
	/**
	 * Name: printMenu
	 * Description: Prints The Menu
	 **/
	public static void printMenu() 
	{
		System.out.println(" Enter 1 for give the input \n Enter 2 for the Check the validity of input  "
						+ "\n Enter 3 for the list Creation \n Enter 4 for the list display \n"
						+ " Enter 5 for the Maximum Number in List \n Enter 6 for the Sum Of elements \n Enter 7 to find the element in List \n Enter 8 for Exit");
	}
}
