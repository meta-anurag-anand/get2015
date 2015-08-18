import java.util.Scanner;
/**
 * Name: CheckSorting
 * Author Anurag
 * Since: August 8,2015
 * Description: finds the array if sorted or not
 **/
public class CheckSorting
{
	/**
	 * Namee: sortedOrNot
	 * @param array : inputed array
	 * @return 0 if not sorted 1=ascending, 2= descending;
	 **/
	static int sortedOrNot (int array[])
	{   // value to be checked
		int ascMark=1,descMark=1,retValue = 0;
		for(int forCount=0; forCount<array.length-1;forCount++)
		{  
			// Checking for ascending array
			if(array[forCount]<array[forCount+1])
			{
			}
			else
			{
				ascMark=0;
				break ;
			}
		}
		for(int forCount=0; forCount<array.length-1;forCount++)
		{
			//Checking for descending array
			if(array[forCount]>array[forCount+1])
			{
			}
			else
			{
				descMark=0;
				break ;
			}
		}
		if(ascMark==0 && descMark==0)
			// returns 0 if not sorted
			retValue=0;
		else if(ascMark==1)
			// returns 1 if in ascending 
			retValue=1;
		else if(descMark==1)
			// returns 2 if in descending
			retValue=2;
		return retValue;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Takes the size of array
		System.out.println("Enter the size of array");
		int arraySize = input.nextInt();
		int []array = new int[arraySize];
		// Takes the input
		System.out.println("Enter the elements of the array");
	    for (int loopCount = 0 ; loopCount < arraySize; loopCount++ ) 
	     {
	    	array[loopCount] = input.nextInt();
	     }
		System.out.print(sortedOrNot(array));
	}

}



