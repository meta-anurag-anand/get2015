import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: HashingTest
 * @author Anurag
 * Since: 30 August,2015
 * Description: checks the value returned is correct or not
 **/
public class HashingTest
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
	 * Name:testPrime
	 * Description: checks the value returned
	 **/
	@Test
	public void testPrime() 
	{
	Hashing objHashing= new Hashing();
	
	assertEquals(true,objHashing.isPrimeNumber(17));
	}
	/**
	 * Name:testNegative
	 * Description: checks the value returned for false case
	 **/
	@Test
	public void testNegative() 
	{
	Hashing objHashing= new Hashing();
	
	assertEquals(false,objHashing.isPrimeNumber(12));
	}

}
