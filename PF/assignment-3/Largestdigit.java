import java.util.Scanner;
/**
 * Name:LargestDigit
 * @author anurag
 * since:10 August,2015
 * Description:finds the largest digit among the numbers
 */

public class Largestdigit 
{
	/**
	 * Name:largestdigit
	 * @param number
	 * @return the largest digit
	 * desc: returns the the largest digit
	 */
 public static int largestdigit(int number)
 {
	 
	 if(number < 1)
		 return 0;
	 int max = number % 10;// extracting the number
	 return max < largestdigit(number/10) ? largestdigit(number/10) : max;// ternary operator finding the maximum recursively
 }
 public static void main(String args[])
 {
	 Scanner sc= new Scanner(System.in);
	 int number=sc.nextInt();
	 
	 int result= largestdigit(number);
	 System.out.println(result);
 }
}
