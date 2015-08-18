import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name:QuickSortTest
 * @author Anurag
 * since:10 August,2015
 * Description:Authenticate the values
 */

public class QuickSortTest
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception
	{
	}
    /**
     * Name:test
     * Description: checks for the give output 
     */
	@Test
	public void test()
	{
		QuickSort obj=new QuickSort();
		int[] input={2,5,8,9,10, 77, 55, 11};
		int[] output={2,5,8,9,10,11,55,77};
		assertArrayEquals("matched",output,obj.final_print(input));
	}
	/**
	 * Name:test1
	 * Description:checks for the null input
	 */
	@Test
	public void test1() 
	{
		QuickSort obj=new QuickSort();
		int[] input={};
		int[] output={};
		assertArrayEquals("matched",output,obj.final_print(input));
	}

}
