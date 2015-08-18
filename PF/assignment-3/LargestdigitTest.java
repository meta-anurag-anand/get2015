import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name:LargestDigitTest
 * @author anurag
 * since:10 August,2015
 * Description:checks if the result is correct or not
 */


public class LargestdigitTest
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
	 * Description: checks for the given value and return the highest value 
	 */
	@Test
	public void test() 
	{
		Largestdigit obj=new Largestdigit();
		assertEquals("matched",2,obj.largestdigit(2));
	}
	/**
	 * Name: test1
	 * Description: checks for the given value and return the highest value 
	 */
	@Test
	public void test1() 
	{
		Largestdigit obj=new Largestdigit();
		assertEquals("matched",9,obj.largestdigit(1257369));
	}
	/**
	 * Name: test2
	 * Description: checks for the given value and return the highest value 
	 */
	@Test
	public void test2() 
	{
		Largestdigit obj=new Largestdigit();
		assertEquals("matched",4,obj.largestdigit(444));
	}

}
