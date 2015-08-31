import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: PriorityQueueTest
 * @author Anurag
 * Since: 26 August,2015
 * Description: checks the value returned is correct or not
 **/
public class PriorityQueueTest
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
		PriorityQueue obj = new PriorityQueue(20);
		Task obje=null;
		obj.insert(4);
		assertEquals(1,obj.size());
	}

}
