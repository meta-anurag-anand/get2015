package oopsSession1;

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
public class MatrixTest 
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
	public void testAddElements() {
	    Matrix matrix=new Matrix(4,4);
	    matrix.addElements(1, 1, 2);
	    assertEquals(2,matrix.data[1][1] );
	    matrix.addElements(0, 0, 5);
	    assertEquals(5,matrix.data[0][0] );
	    matrix.addElements(3, 1, 2);
	    assertEquals(2,matrix.data[3][1] );
	}
	/**
	 * Name:test
	 * Description: checks the value returned through transpose
	 **/
	@Test
	public void testTranspose() 
	{
		Matrix matrixTestObj = new Matrix(3,3);
		matrixTestObj.addElements(0, 0, 5);
		matrixTestObj.addElements(0, 1, 2);
		matrixTestObj.addElements(0, 2, 3);
		matrixTestObj.addElements(1, 0, 9);
		matrixTestObj.addElements(1, 1, 8);
		matrixTestObj.addElements(1, 2, 7);
		matrixTestObj.addElements(2, 0, 6);
		matrixTestObj.addElements(2, 1, 3);
		matrixTestObj.addElements(2, 2, 1);
		Matrix actual = matrixTestObj.transpose();
		Matrix expected = new Matrix(3, 3);
		expected.addElements(0, 0, 5);
		expected.addElements(0, 1, 9);
		expected.addElements(0, 2, 6);
		expected.addElements(1, 0, 2);
		expected.addElements(1, 1, 8);
		expected.addElements(1, 2, 3);
		expected.addElements(2, 0, 3);
		expected.addElements(2, 1, 7);
		expected.addElements(2, 2, 1);
		for(int i = 0; i < matrixTestObj.getNoRows(); i++)
		{
			for(int j = 0; j < matrixTestObj.getNoCols(); j++)
			{
				assertEquals("", expected.getElement(i, j), actual.getElement(i, j));
			}
		}
	}
}

	



