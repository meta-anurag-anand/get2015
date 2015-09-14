import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Name: RepaeatedFrequencyTest
 * @author Anurag
 * Since: 1 September,2015 
 * Description: checks the value returned is correct or not
 **/
public class RepeatedFrequencyTest
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
	 * Name:testFrequency Description: checks the value returned
	 **/
	@Test
	public void testFrequency() 
	{
		RepeatedFrequency obj = new RepeatedFrequency();
		assertEquals(5, obj.frequency("anurag"));
		assertEquals(6, obj.frequency("Anurag"));
	}
}
