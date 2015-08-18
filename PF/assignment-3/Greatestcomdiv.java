import java.util.Scanner;
/**
 * Name:GreatestComdiv
 * @author anurag
 * since: 10 august 2015
 * Description:finds the greatest commom divisior
 */
public class Greatestcomdiv 
{ 
	/**
	 * Name:
	 * @param number1 : the number inputed
	 * @param number2 : second number inputed
	 * @return gcd is returned
	 */
	public static int gcd(int number1, int number2) 
	{
		if (number1 > 0 && number2 > 0)
		{
			if (number1 % number2 == 0)// if value of 1 is multiple of 2
				return number2;
			else
				return gcd(number2, number1 % number2);
		} else
		{
			return -1;
		}
	}

	public static void main(String args[])
	{
		//initalization part
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number");
		int number1 = sc.nextInt();
		System.out.print("enter the second number");
		int number2 = sc.nextInt();
		int result = gcd(number1, number2);
		if (result > 0)
			System.out.print("gcd is=" + result);
		else
			System.out.print("not possible");
	}

}
