import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: test
 * @author anurag
 * Since: 2 October,2015
 * Description: Checks the Value
 **/
public class test
{
	// Intializes the List
	List list = new List("((3,4,6),(7,9))");
	@Test
	// Matches the Value returned by the function and matches it with expected
	public void testValidationList1()
	{
		assertEquals(true, Validation.isExpression("5,4,3"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList2() 
	{
		assertEquals(true, Validation.isExpression("(5,4,3,7,1)"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList3()
	{
		assertEquals(true, Validation.isExpression("(4,(5,7))"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList4() 
	{
		assertEquals(true, Validation.isExpression("((5,4,5),3,(4,(5,7),7))"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList5() 
	{
		assertEquals(true, Validation.isExpression("()"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList7()
	{
		assertEquals(false, Validation.isExpression("(,)"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList8() 
	{
		assertEquals(false, Validation.isExpression("(,7,9,8,9,)"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList9() 
	{
		assertEquals(false, Validation.isExpression("(3,4,6)(6,9),"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testValidationList10() 
	{
		assertEquals(true, Validation.isExpression("(5)"));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testSumNegative()
	{
		assertNotEquals(28, list.sum());
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testMaxNegative() 
	{
		assertNotEquals(3, list.max());
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testSizePositive() 
	{
		assertEquals(5, list.size());
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testSizeNegative()
	{
		assertNotEquals(1, list.size());
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testFindPositive() 
	{
		assertEquals(true, list.findElement(9));
	}
	// Matches the Value returned by the function and matches it with expected
	@Test
	public void testFindNegative()
	{
		assertNotEquals(false, list.findElement(3));
	}

}
