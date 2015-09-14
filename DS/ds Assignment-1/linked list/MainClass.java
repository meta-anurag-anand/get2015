import java.util.Scanner;
/**
 * Name: MainClass
 * @author anurag
 * Since: 25 August,2015
 *
 */
public class MainClass 
{
	/**
	 * Name: Main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String args[])
	{
		Node<Integer> newNode = new Node<Integer>();
		System.out.println("-------LINKED LIST PROBLEM--------");
		System.out.println("How many nodes you want to create in a linked list");
		// To store the no of valuers
		int noOfLinkedList, data = 0;
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		noOfLinkedList = scanner.nextInt();
		// Entering the value of Node
		for (int i = 0; i < noOfLinkedList; i++)
		{
			System.out.println("Enter new node value");
			while (!scanner.hasNextInt()) 
			{
		        System.out.println("That's not a number!");
		        scanner.next(); // this is important!
		    }
			data = scanner.nextInt();
			newNode.addElement(data);
		}
		newNode.display();
		System.out.println("Enter position where you want to add the new node");
		// Position where to delete
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		int pos = scanner.nextInt();
		// Enter the value
		System.out.println("Enter new node value");
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		data = scanner.nextInt();
		// Calling the Position
		newNode.addAtPostion(pos, data);
		newNode.display();
		// Value to be Deleted
		System.out.println("Enter value which you want to delete");
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		int deleteValue = scanner.nextInt();
		if (newNode.deleteByValue(deleteValue)) 
		{
			System.out.println(deleteValue + " deleted from linked list");
		} 
		else
		{
			System.out.println("no such type of number Exist");
		}
		newNode.display();
		System.out.println("");
		//  Enter the Index to be deleted
		System.out.println("Enter index from where you want to delete an item");
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		pos = scanner.nextInt();
		// Data deleted from index
		System.out.println("data deleted from index " + pos);
		if (newNode.deleteByIndex(pos)) 
		{
			while (!scanner.hasNextInt())
			{
	            System.out.println("That's not a number!");
	            scanner.next(); 
	        }
			System.out.println("data deleted from index " + pos);
		}
		newNode.display();
		// Geting value from a position
		System.out.println("Enter pos from where you want to retrieve the data");
		while (!scanner.hasNextInt())
		{
            System.out.println("That's not a number!");
            scanner.next(); 
        }
		pos = scanner.nextInt();
		System.out.println(newNode.getitem(pos));
		// Poistion to Be checked
		newNode.reverseLinkedList();
		System.out.println("Reversed list is :");
		newNode.display();
		newNode.sortList();
		System.out.println("Sorted list is :");
		newNode.display();
	}
}
