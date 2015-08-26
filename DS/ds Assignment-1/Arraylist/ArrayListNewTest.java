import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Name: ArrayListNewTest
 * @author Anurag
 * Since: 26 August,2015
 * Description: checks the value returned is correct or not
 **/
public class ArrayListNewTest
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
	 * Name:testMyList
	 * Description: checks the value returned
	 **/
   @Test
	public void testMyList()
	{
		ArrayListNew<Integer> list = new ArrayListNew<Integer>();
		list.addElements(1);
		list.addElements(2);
		list.addElements(3);
		list.addElements(3);
		list.addElements(4);
		assertTrue(4 == list.get(4));
		assertTrue(2 == list.get(1));
		assertTrue(3 == list.get(2));
    }
	/**
	 * Name:testMyListReverse
	 * Description: checks the value returned
	 **/
   @Test
	public void testMyListReverse()
	{
		ArrayListNew<Integer> list = new ArrayListNew<Integer>();
		list.addElements(1);
		list.addElements(2);
		list.addElements(3);
		list.addElements(4);
		list.reverse();
		assertTrue(1 == list.get(4));
		assertTrue(4 == list.get(1));
		assertTrue(3 == list.get(2));
    }
	/**
	 * Name:testMyListFirstOccurrence
	 * Description: checks the value returned
	 **/   
    @Test
	public void testMyListFirstOccurrence() 
    {
	    ArrayListNew<Integer> list = new ArrayListNew<Integer>();
	    list.addElements(1);
	    list.addElements(2);
	    list.addElements(3);
	    list.addElements(4);
	    int result;
	    result= list.retrieveFirstOccuerence(1,1)
	    assert.equals(1,result);
	}