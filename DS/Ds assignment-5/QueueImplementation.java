import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * Name: QueueImplementation
 * @author anurag
 * Since: 31 August,2015
 * Description: Implementing the inbuilt functions of Queue
 **/
public class QueueImplementation
{	
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface and functions
	 **/
	public static void main(String args[])
	{
		// Queue collections
		Queue<Integer> queue= new LinkedList<Integer>();
		// To store choice and number
		int choice,number;
		// To store result of value got from Queue
		int result;
		Scanner scan= new Scanner(System.in);
		do
		// To Print Menu
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Add an element to queue");
			System.out.println("2. Remove an element from queue");
			System.out.println("3. Get front element of queue");
			System.out.println("4. Display the queue");
			System.out.println("5. clear the queue");
			System.out.println("6. Exit");
			do {
				// Enter the value
				System.out.println("Please Enter positive integer(less than 7)");
				while(!scan.hasNextInt())
				{
					System.out.println("Please Enter Integer Only");
					scan.next();
					}
					choice = scan.nextInt();
				} while(choice <= 0 || choice >= 7);
				// To store the Choice
				switch(choice)
				{
				// Adding the value to the Queue
					case 1:
						System.out.println("Enter a number: ");
						while(!scan.hasNextInt())
						{
							System.out.println("Please Enter Integer Only");
							scan.next();
						}
						number = scan.nextInt();
						((LinkedList<Integer>) queue).addLast(number);
						break;
						
					case 2:
						// Removing the element
						if(!queue.isEmpty())
						{
							result = queue.poll();
							System.out.println("Removed Element is: "+result);
						}
						else
						{
							System.out.println("Queue is Empty");
						}
						break;
						
					case 3:
						// Peek Element of the value
						if(!queue.isEmpty())
						{
							result = queue.peek();
							System.out.println("Front Element is: "+result);
						}
						else
						{
							System.out.println("Queue is Empty");
						}
						break;
						
					case 4:
						// Printing the Queue
						if(!queue.isEmpty()) 
						{
							Iterator<Integer> listIterator = queue.iterator();
							System.out.print("Queue is: ");
							while(listIterator.hasNext())
							{
								System.out.print(listIterator.next()+" ");
							}
							System.out.println();
						}
						else
						{
							System.out.println("Queue is Empty");
						}
						break;
						
					case 5:
						// Clearing the Queue
						queue.clear();
						break;
						
					case 6:
						// Exiting the System
						System.out.println("System Exiting");
						System.exit(0);
						break;
					default: System.out.println("Enter correct choice");
			}
		} while(true);
	}
}
