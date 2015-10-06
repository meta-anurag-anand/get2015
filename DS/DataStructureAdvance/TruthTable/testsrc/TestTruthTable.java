import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name:TestTruthTable
 * @author anurag
 * Since: 3 October,2015
 * Description: Checks for the Vaue returned by the test cases
 **/
public class TestTruthTable 
{
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void truthTableGeneratorTest() 
	{
		GenerateTruthTable obj1 = new GenerateTruthTable();
		int result = obj1.truthTableGenerator("a&b");
		assertEquals(1, result);
	}
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void truthTableGeneratorTestWithNull()
	{
		GenerateTruthTable obj1 = new GenerateTruthTable();
		int result = obj1.truthTableGenerator(null);
		assertEquals(0, result);
	}
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void truthTableGeneratorTestWithEmptyString() 
	{
		GenerateTruthTable obj1 = new GenerateTruthTable();
		int result = obj1.truthTableGenerator("");
		assertEquals(0, result);
	}
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void truthTableGeneratorTestWithWrongExpression()
	{
		GenerateTruthTable obj1 = new GenerateTruthTable();
		int result = obj1.truthTableGenerator("a&b&");
		assertEquals(-1, result);
	}
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void validationTestTrue() 
	{
		assertEquals(true, Validation.isExpression("a&b"));
	}
	// Checks the Value returned by the function and matches the Expected value
	@Test
	public void validationTestFalse()
	{
		assertEquals(false, Validation.isExpression("a|b~"));
	}
}
