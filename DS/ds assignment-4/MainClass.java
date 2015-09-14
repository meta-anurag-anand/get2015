import java.io.DataInputStream;
import java.util.Scanner;

/**
 * Name: MainClass
 * @author anurag
 * Since: 30 August,2015
 * Description: User Interface
 **/
public class MainClass
{
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 */
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		DataInputStream abc = new DataInputStream(System.in);
		System.out.println("Priority Queue Test\n");
		PriorityQueue pq = new PriorityQueue(20);
		// Choice Menu
		char choiceMenu;
		do {
			System.out.println("1. insert");
			System.out.println("2. Start Processing");
			System.out.println("3. check empty");
			System.out.println("4. check full");
			System.out.println("5. clear");
			// Choice of the Prority
			int choice = scan.nextInt();
			switch (choice)
			{
			case 1:
				String option = "";
				do 
				{
					System.out.println(" press 4 : Chairman \n press 3 : Professor \n press 2 : Graduate \n press 1: Under Graduate");
					// To store Priority
					int priority = scan.nextInt();
					pq.insert(priority);
					System.out.println("press y to continue and other to quit");
					try
					{
						option = abc.readLine();
					} 
					catch (Exception e) 
					{
						System.out.println("Enter the correct Format ");
					}

				} while (option.equalsIgnoreCase("y"));

			case 2:
				System.out.println("\nJob processed \n\n" + pq.remove());
				break;
			case 3:
				System.out.println("\nEmpty Status : " + pq.checkIsEmpty());
				break;
			case 4:
				System.out.println("\nFull Status : " + pq.checkIsFull());
				break;
			case 5:
				System.out.println("\nPriority Queue Cleared");
				pq.clearQueue();
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			System.out.println("\nDo you want to continue (Type y to return to  main menu or any chacater) \n");
			choiceMenu = scan.next().charAt(0);
		} while (choiceMenu == 'Y' || choiceMenu == 'y');
	}


}