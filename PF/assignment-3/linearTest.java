import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name:linearTest
 * @author anurag
 * since:10 August,2015
 * Description:finds the number among the array
 */


public class linearTest 
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
	linear obj=new linear();
	int []input={2,5,8,9,10, 55, 77};
	assertEquals(" not matched",-1,obj.linear(input, 88, 0));
	}
	/**
	 * Name: test1
	 * Description: checks for the given value and checks if  value is found or not 
	 */
	@Test
	public void test1() 
	{
	linear obj=new linear();
	int []input={2,5,8,9,10, 55, 77,11};
	assertEquals(" not matched",1,obj.linear(input, 77, 0));
	}

}
