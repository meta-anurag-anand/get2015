import java.util.Scanner;
/**
 * Name: BinarySearch
 * @author anurag 
 * Since:1 September,2015
 * Description: It searches for the required value and leftmost value
 **/
public class BinarySearch
 {
	// To store the position
	int position=0;
	// Flag to check where value matched or not
	boolean flag = false;
	/**
	 * Name: binarySearch
	 * @param input: array inputed
	 * @param lowerBound:lower level of the array
	 * @param upperBound: highest level of the array
	 * @param valueToSearch: value to be searched
	 * @return position if found
	 * Description: Fimds the lefmost value
	 **/
	public  int binarySearch(int[] input, int lowerBound, int upperBound,int valueToSearch) 
	{
		// Checks condition of not matching
		if (lowerBound > upperBound)
		{
			return (position+1);
		} 
		// Single Value
		else if (lowerBound == upperBound) 
		{
			// checks for the value when one element is present
			if (input[lowerBound] == valueToSearch)
			{
				position = lowerBound;
			} 
			else if (flag == false) 
			{
				return 0;
			}
		} 
		else 
		{
			// Calculates the mid value
			int midValue = (lowerBound + upperBound) / 2;
			// Matches the value		
			if (input[midValue] == valueToSearch)
			{
				// Updating the value to  midValue
				position = midValue;
				// Updating the flag to be true
				flag = true;
				return binarySearch(input, lowerBound, midValue - 1,valueToSearch);
			} 
			// If value is less than the value of the array
			// Checks for the value if the value is greater than mid value and recursive calls are made 
			else if (input[midValue] > valueToSearch) 
			{
				return binarySearch(input, lowerBound, midValue - 1,valueToSearch);
			}
			// If value is greater than element
			//Checks for the value if the value is greater than mid value and recursive calls are made
			else
			{
				return binarySearch(input, midValue + 1, upperBound,valueToSearch);
			}
		}
		return (position + 1);
	}
	/**
	 * Name: main
	 * @param args
	 * Description: User interface
	 **/
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary Search");
		System.out.println("Enter the Value in ascending order");
		System.out.println("enter the no of elements");
		// To store no of Elements
		int noOfElements = sc.nextInt();
		// To store the value
		int[] input = new int[noOfElements];
		System.out.println("enter the values");
		for (int i = 0; i < noOfElements; i++)
		{
			// Validation
			while (!sc.hasNextInt()) 
			{
				System.out.println("Please Enter Integer Only");
				sc.next();
			}
			//  Storing the value
			input[i] = sc.nextInt();
			if(i>0&&input[i-1]>input[i])
			{
				System.out.println("Value inputted in wrong order System is closing");
				System.exit(1);
			}
		}
		System.out.print("enter the value to be searched");
		while (!sc.hasNextInt()) 
		{
			System.out.println("Please Enter Integer Only");
			sc.next();
		}
		// Value to be Searched
		int search = sc.nextInt();
		BinarySearch obj= new BinarySearch();
		//Recursive call
		int result = obj.binarySearch(input, 0, input.length - 1, search);
		if (result == -1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at :" + (result));
		}
	}
}
