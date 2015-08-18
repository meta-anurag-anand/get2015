package session4;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: permutationTest
 * @author Anurag
 * Since: 12 August,2015
 * Description: checks the value returned is correct or not
 **/
public class PermutationTest 
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
	public void permutationTest1()
	{
		Permutation permutationObj1 = new Permutation();
		List<String> resultString = permutationObj1.permuteString("", "abcd");
		List<String> expectedString1 = Arrays.asList("abcd","abdc","acbd","acdb","adbc","adcb","bacd","badc","bcad","bcda","bdac","bdca","cabd","cadb","cbad","cbda","cdab","cdba","dabc","dacb","dbac","dbca","dcab","dcba");
		assertEquals(expectedString1,resultString);
	}

}
