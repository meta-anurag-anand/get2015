import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * Name: Hashing
 * @author anurag
 * Since: 30 August,2015
 * Descriprtion: Allotment of Rooms are done
 **/
public class Hashing
{
	/**
	 * Name: allotment
	 * Description:  Thrugh hashing rooms are alloted on basis of age
	 **/
	public static void allotment()
	{
		try 
		{
			Scanner scan = new Scanner(System.in);
			// To store name
			String name;
			// To store age, loop Count
			int age, i, count = 1;
			// To store roomnumber
			int roomNumber;
			boolean flag = true;
			// To store hashCode
			int hashCode;
			Enumeration<Integer> roomNumbers;
			DataInputStream abc=new DataInputStream(System.in);
			// Number Of Rooms
			int numberOfRooms;
			int choice;
			// HashTable to map
			Hashtable<Integer, String> rooms = new Hashtable<Integer, String>();
			do
			{
				System.out.println("Enter Number of rooms: (must be prime number)");
				//  Validation Check
				while (!scan.hasNextInt())
				{
					System.out.println("Please Enter Integer Number");
					scan.next();
				}
				numberOfRooms = scan.nextInt();
				// Prime number is checked
				while(!isPrimeNumber(numberOfRooms))
				{
					System.out.println("Enter prime number");
					numberOfRooms=scan.nextInt();
				}
				
			} while (numberOfRooms <= 0);
			// Intializing all rooms to null
			for (i = 0; i < numberOfRooms; i++)
			{
				rooms.put(i, "");
			}
			// Menu
			do
			{
				flag = true;
				System.out.println("1. Show  Booked Status of rooms");
				System.out.println("2. Allot room to a guest based on age");
				System.out.println("3. Exit");
				System.out.println("Enter your choice: ");
				do
				{
					System.out.println("(Please Enter Positive integer Number)");
					while (!scan.hasNextInt())
					{
						System.out.println("Please Enter Integer Number");
						scan.next();
					}
					choice = scan.nextInt();
				} while (choice <= 0 || choice >= 4);

				switch (choice)
				{
				// For the Status
				case 1:
					System.out.println("Status of  Alloted rooms is: ");
					roomNumbers = rooms.keys();
					while (roomNumbers.hasMoreElements()) 
					{
						roomNumber = roomNumbers.nextElement();
						System.out.println("Room " + (roomNumber) + " : "+ rooms.get(roomNumber));
					}
					break;
					// Alloting the rooms
				case 2:
					System.out.println("Enter name of guest: ");
					name = abc.readLine();
					System.out.println("Enter age of the guest: ");
					do 
					{
						System.out.println("(Please Enter Positive integer Number greater than 18)");
						while (!scan.hasNextInt())
						{
							System.out.println("Please Enter Integer Number");
							scan.next();
						}
						age = scan.nextInt();
					} while (age <= 18);
					//  Getting the hashcode
					hashCode = age % numberOfRooms;
					// Alloting the rooms
					for (i = hashCode; i <= (numberOfRooms - 1);)
					{
						if (rooms.get(i).equals(""))
						{
							rooms.put(i, name);
							System.out.println("Room number " + i + " is alloted to " + name);
							flag = false;
							break;
						} 
						else 
						{
							i += 3;
						}
					}
					i = 0;
					// if not alloted then switch to this loop
					while (flag) 
					{
						for (int j = i; j <= (numberOfRooms - 1); j++)
						{
							if (rooms.get(j).equals(""))
							{
								rooms.put(j, name);
								System.out.println("Room number " + j + " is alloted to " + name);
								flag = false;
								break;
							}
							else
							{
								j += 3;
							}
						}
						i++;
					}
					count++;
					break;
					// Exiting the System
				case 3:
					System.out.println("System will Exit");
					System.exit(0);
					break;

				default:
					System.out.println("Enter correct Choice");
				}
			} while (count < numberOfRooms);
			// printing all Rooms
			System.out.println("All Rooms are full now");
			System.out.println("Status of rooms is: ");
			roomNumbers = rooms.keys();
			while (roomNumbers.hasMoreElements())
			{
				roomNumber = roomNumbers.nextElement();
				System.out.println("Room " + (roomNumber + 1) + " : " + rooms.get(roomNumber));
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Name: isprimeNumber
	 * @param number
	 * @return
	 * Description: Checks prime number or not
	 **/
	 public static boolean isPrimeNumber(int number){
         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	
}
