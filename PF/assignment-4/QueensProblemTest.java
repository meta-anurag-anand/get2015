package session4;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: QueensProblemTest
 * @author Anurag
 * Since: 12 August,2015
 * Description: Checks the test case of queens problem
 **/
public class QueensProblemTest 
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
		Queens testObject1 = new Queens(4);
		int expected[][] = {{'0','0','1','0'}, {'1','0','0','0'}, {'0','0','0','1'}, {'0','1','0','0'}};
		int actual[][] = testObject1.callplaceNqueens();
		QueensProblemTest test = new QueensProblemTest();
		int result=test.compare(expected, actual);
		assertEquals("", 1,result);
	}
	/**
	 * Name:Compare
	 * @param expected :output expected
	 * @param actual :value returned
	 * @return int 
	 **/
	public int compare(int[][] expected, int[][] actual)
	{
		int result=1;
		int length = expected.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(expected[i][j]!=actual[i][j])
				{
					result = 0;
					System.out.print(actual[i][j]+"\t");
					return result;
					}
			}
			System.out.println();
		}
		return result;
	}

}
