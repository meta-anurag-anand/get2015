package oopsSession1;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: MainInheritanceTest
 * @author Anurag
 * Since: 12 August,2015
 * Description: Checks the test case of queens problem
 **/
public class MainInheritancTest 
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
	 * Name:test
	 * Description: checks the value returned
	 **/
	@Test
	public void test()
	{
			Person personObj = new Person(23456789, "Amit");
			assertEquals("",23456789, personObj.getUid());
	}
	/**
	 * Name:test
	 * Description: checks the value returned
	 **/
	@Test
	public void test1()
	{
		Student StudentObj = new Student(23456789, "Amit", 101);
		assertEquals("",101, StudentObj.getStudentId());
	}
}
