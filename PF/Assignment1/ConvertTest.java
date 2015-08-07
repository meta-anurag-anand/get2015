import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConvertTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 String num ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Convert tester=new Convert();
		 assertEquals("not match", 30, tester.BinaryToOctal("11000"));
	}

}
