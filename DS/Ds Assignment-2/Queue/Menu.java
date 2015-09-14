import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * Name: Menu
 * @author anurag
 * Since: 26 August,2015
 * Description: Displays the menu
 **/
public class Menu 
{
	/**
	 * Name: menuDisplay
	 * @throws IOException
	 * Description: Displays the menu
	 **/
	public void menuDisplay() throws IOException
	{
		Scanner scan = new Scanner(System.in);
		DataInputStream obj = new DataInputStream(System.in);
		String choiceMenu = null;
		// DO while loop
		do {
			System.out.println("Enter 1 for counselling");
			System.out.println("Enter 2 for Chart");
			System.out.println("Enter 3 for exit");
			System.out.print("Enter the choice");
			// validation for choice
			while (!scan.hasNextInt())
			{
				System.out.println("That's not a number!");
				scan.next();
			}
			int choice = scan.nextInt();
			CounselingSystem collegeCounselingSystem = new CounselingSystem();
			switch (choice)
			{
			case 1:
				collegeCounselingSystem.getResources();
				collegeCounselingSystem.enqueueStudents();
				collegeCounselingSystem.councelingProcess();
				break;
			case 2:
				collegeCounselingSystem.displayList();
				break;
			case 3:
				System.out.println("SystemClosing");
				System.exit(0);
				break;
			default:
				System.out.println("wrong Input");
			}
			System.out.println("Enter y to continue and other element to exist");
			choiceMenu = obj.readLine();
		} while (choiceMenu.equalsIgnoreCase("y"));
	}
}
