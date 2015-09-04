import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;
/**
 * Name: SortTest
 * @author Anurag
 * Since: 4 September,2015
 * Description: Checks the value returned by the function
 **/
public class SortTest
{
	/**
	 * Name: testBubbleSort
	 * Description: Checks the value returned by the bubble sort
	 **/
	@Test
	public void testBubbleSortBest()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1, 2, 3, 4, 5 };
		//  Expected value
		int expected[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected, sorting.bubbleSort(input));
	}
	/**
	 * Name: testBubbleSortAverage
	 * Description: Checks the value returned by the bubble sort.
	 **/
	@Test
	public void testBubbleSortAverage()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1, 4, 3, 5, 2 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected, sorting.bubbleSort(input));
	}
	/**
	 * Name: testBubbleSortWorst
	 * Description: Checks the value returned by the bubble sort
	 **/
	@Test
	public void testBubbleSortWorst()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 5, 4, 3, 2, 1 };
	    //  Expected value		
		int expected[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected, sorting.bubbleSort(input));
	}
	/**
	 * Name: testQuickSortWorst
	 * Description: Checks the value returned by the Quick sort
	 **/
	@Test
	public void testQuicksortWorst() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1, 1, 2, 2, 5 };
	    //  Expected value
		int expected[] = { 1, 1, 2, 2, 5 };
		assertArrayEquals(expected, sorting.quickSort(input));
	}
	/**
	 * Name:testQuickSortBest
	 * Description: Checks the value returned by the Quick sort
	 **/
	@Test
	public void testQuicksortBest()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1, 2, 3, 4, 5 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected, sorting.quickSort(input));
	}
	/**
	 * Name:testQuickSortAverage
	 * Description: Checks the value returned by the Quick sort
	 **/
	@Test
	public void testQuicksortAverage()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 4, 5, 1, 2, 3 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expected, sorting.quickSort(input));
	}
	/**
	 * Name:testRadixSortBest
	 * Description: Checks the value returned by the Radix sort
	 **/
	@Test
	public void testRadixSortBest() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 100, 101, 201, 456, 1000 };
	    //  Expected value
		int expected[] = { 100, 101, 201, 456, 1000 };
		assertArrayEquals(expected, sorting.radixSort(input));
	}
	/**
	 * Name:testRadixSortAverage
	 * Description: Checks the value returned by the Radix sort
	 **/
	@Test
	public void testRadixSortAverage() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 101, 100, 456, 201, 1000 };
	    //  Expected value
		int expected[] = { 100, 101, 201, 456, 1000 };
		assertArrayEquals(expected, sorting.radixSort(input));

	}
	/**
	 * Name:testRadixSortWorst
	 * Description: Checks the value returned by the Radix sort
	 **/
	@Test
	public void testRadixSortWorst() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1000, 456, 201, 101, 100 };
	    //  Expected value
		int expected[] = { 100, 101, 201, 456, 1000 };
		assertArrayEquals(expected, sorting.radixSort(input));
	}
	/**
	 * Name:testCountingSortBest
	 * Description: Checks the value returned by the Counting sort
	 **/
	@Test
	public void testCountingSortBest() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 1, 2, 3, 20, 99 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 20, 99 };
		assertArrayEquals(expected, sorting.countingSort(input));
	}
	/**
	 * Name:testCountingSortAverage
	 * Description: Checks the value returned by the Counting sort
	 **/
	@Test
	public void testCountingSortAverage() 
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 3, 2, 99, 20, 1 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 20, 99 };
		assertArrayEquals(expected, sorting.countingSort(input));
	}
	/**
	 * Name:testCountingSortWorst
	 * Description: Checks the value returned by the Counting sort
	 **/
	@Test
	public void testCountingSortWorst()
	{
		Sort sorting = new Sort();
		// Input to the Function
		int input[] = { 99, 20, 3, 2, 1 };
	    //  Expected value
		int expected[] = { 1, 2, 3, 20, 99 };
		assertArrayEquals(expected, sorting.countingSort(input));
	}
}
