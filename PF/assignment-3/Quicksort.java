import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * Name: QuickSort
 * @author Anurag
 * Since: 10 August,2015
 * Description: This class sorts the array
 */

class QuickSort
{
/**
 * Name:Partition
 * @param numbers:input array
 * @param lowerbound:starting index of array
 * @param upperbound:
 * @return
 * Description:This function checks the exact place of the values
 */
	public static int Partition(int[] numbers, int lowerbound, int upperbound)
	{
		int pivot = numbers[lowerbound];
		while (true)
		{
			while (numbers[lowerbound] < pivot)
				lowerbound++;

			while (numbers[upperbound] > pivot)
				upperbound--;

			if (lowerbound < upperbound)
			{
				int temporary = numbers[upperbound];
				numbers[upperbound] = numbers[lowerbound];
				numbers[lowerbound] = temporary;
			}
			else
			{
				return upperbound;
			}
		}
	}
	/**
	 * 
	 * @param input:array to be inputed
	 * @param lowerbound:starting index of the array
	 * @param upperbound:last index of the array
	 */

	public static void QuickSort_Recursive(int[] input, int lowerbound, int upperbound)
	{
		
		if(lowerbound < upperbound)// base condition
		{
			int pivot = Partition(input, lowerbound, upperbound);

			if(pivot > 1)// if pivot is greater
				QuickSort_Recursive(input, lowerbound, pivot - 1);

			if(pivot + 1 < upperbound)//pivot is less than upper bound
				QuickSort_Recursive(input, pivot + 1, upperbound);
		}

	}
	/**
	 * Name:final_print
	 * @param input:input array from user
	 * @return output array or the final aaray
	 */
	public static int[] final_print(int[] input)
	{

		QuickSort_Recursive(input, 0, input.length-1);// call of the recursive function
		return input;

	}

	public static void main(String[] args)
	{ 
        //intilization part
		System.out.print("enter the no of values  ");
		Scanner sc=new Scanner(System.in);
		int noofelements= sc.nextInt();
		int input[]= new int[noofelements];
		int output[]=new int[noofelements];
		for(int i=0;i<noofelements;i++)
		{
			input[i]=sc.nextInt();
		}
		output=final_print(input);
		System.out.println("QuickSort By Recursive Method");
        //output printing
		for (int i = 0; i < noofelements; i++)
			System.out.println(output[i]);

		System.out.println();

	}
}
