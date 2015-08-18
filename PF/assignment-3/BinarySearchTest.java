import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Name:BinarySearchTest
 * @author anurag
 * since:10 August,2015
 * Description:search the  number among the array
 */

public class BinarySearchTest
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
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}
	/**
	 * Name: test
	 * Description: checks for the given value and checks if  value is found or not 
	 */
	@Test
	public void test() 
	{
	BinarySearch obj=new BinarySearch();
	int []input={2,5,8,9,10, 55, 77};
	assertEquals(" not matched",0,obj.binary_search(input, 0, (input.length-1), 88));
	}
	/**
	 * Name: test1
	 * Description: checks for the given value and checks if  value is found or not 
	 */
	@Test
	public void test1() 
	{
	BinarySearch obj=new BinarySearch();
	int []input={2,5,8,9,10, 55, 77};
	assertEquals("  matched",1,obj.binary_search(input, 0, (input.length-1), 77));
	}

	

}
