import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: NodeTest
 * @author Anurag
 * Since: 26 August,2015
 * Description: checks the value returned is correct or not
 **/
public class InfixToPostfixTest 
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
	 * Name:test
	 * Description: checks the value returned
	 **/	
	@Test
	public void test() 
	{
		InfixToPostfix obj=new InfixToPostfix();
		String expected="ab+";
		assertEquals(expected,obj.convert("a+b"));
	}
	/**
	 * Name:test
	 * Description: checks the value returned
	 **/
	@Test
	public void testNegativeCase() 
	{
		InfixToPostfix obj=new InfixToPostfix();
		String expected=" ";
		assertEquals(expected,obj.convert(" "));
	}

}
