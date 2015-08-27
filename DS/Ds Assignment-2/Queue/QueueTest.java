import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: QueueTest
 * @author Anurag
 * Since: 26 August,2015
 * Description: checks the value returned is correct or not
 **/
public class QueueTest
{  /**
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
	 * Name:testQueue
	 * Description: checks the value returned
	 **/
	@Test
	public void testQueue() 
	{
		Queue obj = new Queue(100);
		obj.enqueue("anurag");
		obj.enqueue("anand");
		assertEquals("anurag",obj.dequeue());
		
	}
	/**
	 * Name:testValidation
	 * Description: checks the value returned
	 **/
	@Test
	public void testValidation()
	{
		CounselingSystem obj = new CounselingSystem();
		int expected = 4;
		 assertEquals(expected,obj.betweenExclusive(4));
	}

}
