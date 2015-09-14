import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Name: Sort
 * @author Anurag
 * Since: 3 September,2015
 * Description: Sorting functions are Present 
 **/
public class Sort
{
	/**
	 * Name: radixSort
	 * @param input
	 * @return
	 * Description: Radix sort is performed
	 **/
	public int[] radixSort(int[] input)
	{
		// List to store the value
		List<Integer>[] bucket = new ArrayList[10];
		for (int i = 0; i < bucket.length; i++) 
		{
			// Adding value to the bucket
			bucket[i] = new ArrayList<Integer>();
		}
		boolean maxLength = false;
		int tmp = -1, placement = 1;
		while (!maxLength)
		{
			maxLength = true;
			// Alloting the value to the list
			for (Integer i : input)
			{
				tmp = i / placement;
				bucket[tmp % 10].add(i);
				if (maxLength && tmp > 0)
				{
					maxLength = false;
				}
			}
			int count = 0;
			// Loop to increase the value of list
			for (int loopCount = 0; loopCount < 10; loopCount++)
			{
				// Increasing the frequency
				for (Integer i : bucket[loopCount]) 
				{
					input[count++] = i;
				}
				bucket[loopCount].clear();
			}
			// Value to be placed
			placement *= 10;
		}
		return input;
	}
	/**
	 * Name: countingSort
	 * @param elements
	 * @return
	 * Description: Counting sort is done
	 **/
	public int[] countingSort(int[] elements)
	{
		// finding the largest value
		int largest = 0;
		// Length of the array
		int arrayLength = elements.length;
		for (int number : elements) 
		{
			if (number > largest)
				largest = number;
		}
		// Array is made for the largest Value
		int[] bucket = new int[largest + 1];
		int bucketLength = bucket.length;
		// Increasing the value of the array
		for (int count = 0; count < arrayLength; count++) 
		{
			bucket[elements[count]] = bucket[elements[count]] + 1;
		}
		// Alloting back the value to the array
		for (int count = 0, j = 0; count < bucketLength;)
		{
			if (bucket[count] != 0)
			{
				elements[j] = count;
				j++;
				bucket[count] = bucket[count] - 1;
			}
			else
			{
				count++;
			}
		}
		return elements;
	}
	/**
	 * Name: bubbleSort
	 * @param input
	 * @return
	 * Description: Bubble Sort is done 
	 **/
	public  int[] bubbleSort(int[] input)
	{
		System.out.println("Bubble sort");
		// Traversing the value
		for (int i = 0; i < input.length; i++)
		{
			for (int j = 0; j < input.length - i - 1; j++)
			{
				// Swapping the value 
				if (input[j] > input[j + 1])
				{
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}
	/**
	 * Name: quickSort
	 * @param input
	 * @return
	 * Description: Quicksort is done
	 **/
	public int[] quickSort(int[] input) 
	{
		// Checking if the input is null or not
		if (input == null || input.length == 0)
		{
			return input;
		}
		// Calling the QuickSort
		quicksort(input, 0, input.length - 1);
		return input;
	}
	/**
	 * Name:quickSort
	 * @param input
	 * @param lowerBound
	 * @param upperBound
	 * Description: Does the Partion and performs quicksort
	 **/
	private void quicksort(int[] input, int lowerBound, int upperBound)
	{
		// Creating the copies of lowerbound and Upperbound
		int i = lowerBound, j = upperBound;
		// Pivot is Selected i.e first element of the list
		int pivot = input[lowerBound];
		// Right Traversl
		while (i <= j)
		{
			while (input[i] < pivot)
			{
				i++;
			}
			// Left traversal
			while (input[j] > pivot) 
			{
				j--;
			}
			// Swapping the value
			if (i <= j) 
			{
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		// Partioning the list
		if (lowerBound < j)
		{
			quicksort(input, lowerBound, j);
		}
		if (i < upperBound)
		{
			quicksort(input, i, upperBound);
		}
	}
}
