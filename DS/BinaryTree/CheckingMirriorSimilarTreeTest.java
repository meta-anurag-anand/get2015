import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: CheckingMirriorSimilarTreeTest
 * @author Anurag
 * Since: 27 August,2015
 * Description: checks the value returned is correct or not
 **/
public class CheckingMirriorSimilarTreeTest
{  /**
	* creates the object once
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
	 * Name:testPreOrder
	 * Description: checks the value returned
	 **/
	@Test
	public void testPreOrder()
	{ 
		Node<Integer> root=null;
		CheckingMirriorSimilarTree obj= new CheckingMirriorSimilarTree();
		root=obj.insertNodeMirror(root, new Node<Integer>(5));
		root=obj.insertNodeMirror(root, new Node<Integer>(4));
		root=obj.insertNodeMirror(root, new Node<Integer>(1));
		root=obj.insertNodeMirror(root, new Node<Integer>(3));
		String result=obj.preOrder(root);
		assertEquals("5413",result);
	}
}
