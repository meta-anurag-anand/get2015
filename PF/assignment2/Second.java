import java.util.Scanner;
/**
 * Author Anurag
 *Since:August 8,2015
 *Name:space
 *Description: it prints a pattern when provide with the no of input size 
 */

public class Second
{
	/**
	  * Name:space
	  * @param n: total no of rows
	  * @return returns string of spaces
	  * description: It returns the space as per requirement
	  */
	
		
	public static String space(int n)
	{
		
	 
	    String space= new String();
	    for(int i=0;i<n;i++)
	    {
	        space=space+" ";
	    }
	    return space;
	}
	
	public static String numbers(int n)
	{ /**
		  * Name:numbers
		  * @param n: total no of rows
		  * @return prints number as string
		  * description: prints the element of the row
		  */
	    String numbers=new String();
	    for(int i=1;i<=n;i++)
	    {
	        numbers=numbers+i;
	    }
	    return numbers;
	  
	}
	/**
	  * Name:final_pattern
	  * @param n: the size of the upper triangle
	  * @return complete pattern
	  * description:prints the complete triangle
	  */
	public static String[] final_pattern(int n)
	{String [] finalprint= new String[n];
	   int a=0;
	    for(int i=n;i>=1;i--)
	    {
	   
	    finalprint[a]=space(a)+numbers( i);
	   a++;
	}
	return finalprint;
	
	
	}
	
	
	public static void main(String args[]){
		String[] finaltriangle=new String[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int number=sc.nextInt();
		finaltriangle=final_pattern(number);
		System.out.println("pattern");
		for(int i=0;i<finaltriangle.length;i++)
		{
			System.out.println(finaltriangle[i]);
		}
	}
}