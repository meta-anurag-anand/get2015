import java.util.Scanner;
/**
 * Name: Utility
 * @author Anurag
 * Since: 6 October,2015
 * Description: Takes the Value and provides the Information
 **/
public class InputValidator
{
	/**
	 * Name: getIntegerValue
	 * @param message
	 * @return
	 * Descriptrion: provides Integer value and checks till value entered is not integer
	 **/
	public static int getIntegerValue(String message)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if(isNumeric(inputStr) && (Integer.parseInt(inputStr)>0))
			{
				number=Integer.parseInt(inputStr);
				return number;
			}
			else
			{
				System.out.println("Enter positive integer value");
			}
		}while(true);
	}
	
	/**
	 * Name: isNumeric
	 * @param input
	 * @return
	 * Description: Checks whether the value is numeric or not
	 **/
	private static boolean isNumeric(String input) 
	{
		try 
		{
			Integer.parseInt(input);
		} 
		catch (NumberFormatException e) 
		{
			return false;
		}
		return true;	
	}
	
	/**
	 * Name: getStringInput
	 * @param message
	 * @return
	 * Description: Method to get String input from user
	 **/
	public static String getStringInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}
	/**
	 * Name: getCharacterInput
	 * @param message
	 * @return
	 * Description: Checks the choice of the User whether want to continue or not
	 **/
	public static char getCharacterInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		char input = sc.next().charAt(0);
		if((input == 'y' || input == 'Y') || (input == 'n' || input == 'N'))
		{
			return input;
		}
		else
		{	
			return getCharacterInput(message);
		}
	}
	
	/**
	 * Name: getArrayInput
	 * @param message
	 * @return
	 * Description:  Method to get array input
	 **/
	public static int[] getArrayInput(String message)
	{
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		int array[] = new int[9];
		for(int i = 0; i < (array.length-1) ; i++)
		{
			array[i] = sc.nextInt();
		}
		return array;
	}
	
}
