import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


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

	@Test
	public void test() {
		Second objectForNumber = new Second();
		String resultNumber = objectForNumber.numbers(5);
		assertEquals("12345",resultNumber);
	}
	@Test
	public void test1(){
		Second objectForSpace = new Second();
		String resultSpace = objectForSpace.space(1);
		assertEquals(" ",resultSpace);
	}
	
	@Test
	public void test2(){
		Second objectForWhole = new Second();
		String []resultPattern = objectForWhole.fina(5);
		String []expected={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected,resultPattern);	
	}

}
