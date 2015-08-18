import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Author Anurag
 *Since:August 8,2015
 *Name:SecondTest
 *Description: Test for the pattern
 */


public class SecondTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Name:test
	 * description:checks for the string
	 */

	@Test
	public void test() {
		Second objectForNumber = new Second();
		String resultNumber = objectForNumber.numbers(5);
		assertEquals("12345",resultNumber);
	}
	/**
	 * Name:test1
	 * description: checks for the space if expected and actual is correct or not
	 */
	@Test
	public void test1(){
		Second objectForSpace = new Second();
		String resultSpace = objectForSpace.space(1);
		assertEquals(" ",resultSpace);
	}
	/**
	 * Name:test2
	 * description:checks for the pattern for the whole pattern
	 */
	@Test
	public void test2(){
		Second objectForWhole = new Second();
		String []resultPattern = objectForWhole.final_pattern(5);
		String []expected={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected,resultPattern);	
	}

}
