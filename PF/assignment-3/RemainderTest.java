import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: RemainderTest
 * @author anurag
 * since:10 August,2015
 * Descripion: checks the value if returned correct or not
 */

public class RemainderTest
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
    * Description:returns the value of remainder for specific case
    */
	@Test
	public void test() 
	{
		Remainder rm=new Remainder();
		assertEquals(0,rm.rem(2, 1));
	}
	/**
	    * Name:test1
	    * Description:returns the value of remainder for specific case
	    */
	@Test
	public void test1() 
	{
		Remainder rm=new Remainder();
		assertEquals(-1,rm.rem(2, 0));
	}
	/**
	    * Name:test2
	    * Description:returns the value of remainder for specific case
	    */
	@Test
	public void test2() 
	{
		Remainder rm=new Remainder();
		assertEquals(1,rm.rem(100, 3));
	}

}
