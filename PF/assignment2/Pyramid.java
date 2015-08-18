import java.util.*;
/**
 * Author Anurag
 *Since:August 8,2015
 *Name:Pyramid
 *Description: it prints a pattern when provide with the no of input size in upward and downward pattern
 */

public class Pyramid 
{
	 /**
	  * Name:space
	  * @param row: which row to be printed
	  * @param n: total no of rows
	  * @return returns string of spaces
	  * description: It returns the space as per requirment
	  */
 public static String space(int row,int n)
 {
    String space = new String();
    for(int i = n;i > row;i--)
    {
        space = space + " ";
    }
    return space;
 }
 /**
  * Name:numbers
  * @param row: which row to be printed
  * @param n: total no of rows
  * @return prints number as string
  * description: prints the element of the row
  */
 public static String numbers(int row,int n)
 {
    String number=new String();
    for(int i=1;i<=row;i++)
    {
        number=number+i;
    }
    for(int i=row-1;i>=1;i--)
    {
        number=number+i;
    }
    return number;
 }
 /**
  * Name:final_triangle
  * @param n: the size of the upper triangle
  * @return complete pattern
  * description:prints the complete triangle
  */
  public static String[] final_triangle(int n)
 { 
	
	int a=0;
    String [] finalprint= new String[(2*n)-1];// array for full traingle
    for(int i=1;i<=n;i++)
    {
      finalprint[a]=""+space(i,n)+numbers(i, n);// concats the space and the numbers
       a++;
    }

   for(int i=(n-1);i>=1;i--)// for second half of the triangle
   {
   finalprint[a]=""+space(i,n)+numbers(i, n);// concats the space and the numbers
   a++;
   }

   return finalprint;


 }
 public static void main(String args[]) 
 {
 String[] finaltriangle=new String[20];
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size");
 int number=sc.nextInt();
 finaltriangle=final_triangle(number);
 System.out.println("pyramid pattern");
	for(int i=0;i<finaltriangle.length;i++)
	{
		System.out.println(finaltriangle[i]);// printing of the triangle
	}
 }
}