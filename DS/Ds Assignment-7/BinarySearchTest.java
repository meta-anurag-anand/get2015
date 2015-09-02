import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: BinarySearchTest
 * @author Anurag
 * Since: 1 September,2015 
 * Description: checks the value returned is correct or not
 **/
public class BinarySearchTest
{
	/**
	 * creates the object
	 **/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}
	/**
	 * clears the test case after execution
	 * 
	 * @throws Exception
	 **/
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}
	/**
	 * creates the object
	 **/
	@Before
	public void setUp() throws Exception
	{
	}
	/**
	 * cleans the object tested
	 **/
	@After
	public void tearDown() throws Exception
	{
	}
	/**
	 * Name:test
	 * Description: checks the value returned
	 **/
	@Test
	public void test()
	{
		BinarySearch obj= new BinarySearch();
		// Inputed array
		int inputArray[] ={1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6};
		// value to Search
		int valueToSearch=5;
		// Expected value
		int expected=8;
		assertEquals(expected,obj.binarySearch(inputArray, 0, inputArray.length-1, valueToSearch));
	}
	/**
	 * Name:testNegative
	 * Description: checks the value returned for negative value
	 **/
	@Test
	public void testNegative()
	{
		BinarySearch obj= new BinarySearch();
		// Inputed array
		int inputArray[] ={1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6};
		// value to search
		int valueToSearch=10;
		// expected value
		int expected = 0;
		int result = obj.binarySearch(inputArray, 0, 15, 1543);
		assertEquals(expected,obj.binarySearch(inputArray, 0, inputArray.length-1, valueToSearch));
	}
}
