import java.util.Scanner;
/**
 * Name:Remainder
 * @author anurag
 * Since: 10 august,2015
 * Description: to find the remainder
 */
public class Remainder 
{
	public static void main(String args[]) 
	{
		//intialization part 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the dividend");
		int dividend = sc.nextInt();
		System.out.print("enter the divisor");
		int divisor = sc.nextInt();
		int remainder = rem(dividend, divisor);
		if (remainder >= 0)
			System.out.print("remainder=" + rem(dividend, divisor));//calls the function
		else
			System.out.print("not possible");
	}
    /**
     * Name :
     * @param dividend: number to be divided 
     * @param divisor: to divide the number
     * @return remainder
     * description: returns the remainder 
     */
	public static int rem(int dividend, int divisor) {
		if (dividend >= 0 && divisor > 0) {
			if (dividend >= divisor)
				return rem(dividend - divisor, divisor);// subtracts the divisor from dividend and the returns the value
			else
				return dividend;
		} else 
			return -1;
		
	}

}
