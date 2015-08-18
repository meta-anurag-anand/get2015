import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: GreatestcomdivTest
 * @author anurag
 *Description: checks the value if it value returned is correct or not
 */

public class GreatestcomdivTest
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
	 * Name:test
	 * Desc:checks the value if the value returned is correct or not
	 */

	@Test
	public void test()
	{
		Greatestcomdiv obj = new Greatestcomdiv();
		assertEquals(1,obj.gcd(2, 1));
	}
	/**
	 * Name:test
	 * Description:returns the value of remainder for specific case
	 */
	@Test
	public void test1() 
	{
		Greatestcomdiv obj = new Greatestcomdiv();
		assertEquals(6,obj.gcd(12, 18));
	}
	@Test
	public void test2()
	{
		Greatestcomdiv obj = new Greatestcomdiv();
		assertEquals(1,obj.gcd(100, 3));
	}

}
