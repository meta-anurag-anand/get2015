import java.util.Scanner;
/**
 * Name: removeDuplicate
 * @author anurag
 * Since: 5 August,2015
 * Description: Removes the element from repeated array 
 **/
public class removeDuplicate
{
	/**
	 * Name: main
	 * @param args: Command line argument
	 * @return
	 * Description: Takes the input
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// Takes the size
		int size;
		System.out.println("Enter size of array : ");
		size=sc.nextInt();
		// Inputted array
		int[] array=new int[size];
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		// Printing the array
		int[] uniqueArray;
		removeDuplicate Ob1=new removeDuplicate();
		uniqueArray=Ob1.removeDuplicate(array);
		for(int i=0;i<uniqueArray.length;i++)
		{
			System.out.println(uniqueArray[i]);
		}
		sc.close();
	}
	/**
	 * Name: removeDuplicate
	 * @param input: Array that is inputed
	 * @return: array that is sorted
	 * Description: Removes the duplicate elements of the array
	 **/
	public int[] removeDuplicate(int input[])
	{  
		// length to be Covered
		int n=input.length-1;
		int i,j,k;
		// Complete Traversal
		for(i=0;i<n;i++)
		{
			// Comparing the value
			for(j=i+1;j<=n;j++)
			{
				// Matches the input
				if(input[i]==input[j])
				{
					//Changes the Position
					for(k=j;k<n;k++)
					{
						input[k]=input[k+1];
					}
					n--;
					j--;
				}
			}
		}
		// Storing the value
		int output[]=new int[n+1];
		for(i=0;i<=n;i++)
		{
			output[i]=input[i];
		}
		return output;
	}
}
