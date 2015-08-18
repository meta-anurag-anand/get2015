import java.util.Scanner;
/**
 * Name: BinarySearch
 * @author anurag
 *since:10 August2015
 *Description: it searches for the required value
 */

public class BinarySearch
{
	/**
	 * Name: binary_search
	 * @param input: array inputed
	 * @param lowerbound:lower level of the array
	 * @param upperbound: highest level of the array
	 * @param valueToSearch: value to be searched
	 * @return 1 if matched else 0
	 */

	public static int binary_search(int []input, int lowerbound,int upperbound,int valueToSearch )
	{
		if(lowerbound==upperbound)
		{
			if(input[lowerbound]==valueToSearch)// checks for the value when one element is present
			{
				return 1;
			}
			else
				return 0;
		}
		else
		{
			int midvalue=(lowerbound+upperbound)/2;// calculate the mid value
			if(input[midvalue]==valueToSearch)
				return 1;
			else if(input[midvalue]>valueToSearch) // if the value is smaller than mid value
			{
				return binary_search(input, lowerbound,midvalue-1, valueToSearch);
			}
			else
				return binary_search(input, midvalue+1, upperbound, valueToSearch);
				
			
		}
	}
	public static void main(String args[])
	{   // intialization part
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter the no of elements");
	    int noofelements=sc.nextInt();
		int[] input=new int[noofelements];
		System.out.println("enter the values");
		for(int i=0;i<noofelements;i++){
			input[i]=sc.nextInt();
		}
		System.out.print("enter the value to be searched");
		int search= sc.nextInt();
		int result=binary_search(input, 0,input.length-1,search);
		if(result==0)
			System.out.println("not found");
		else
			System.out.println("found");
	}
}
