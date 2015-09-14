import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: BinarySearchTreeTest
 * @author Anurag
 * Since: 28 August,2015
 * Description: checks the value returned is correct or not
 **/
public class BinarySearchTreeTest
{  
	/**
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
	 * Name:testInsertNode
	 * Description: checks the value returned
	 **/
	@Test
	public void testInsertNode()
	{
		BinarySearchTree obj = new BinarySearchTree();
		CheckingMirriorSimilarTree object = new CheckingMirriorSimilarTree();
		Node<Integer> root = null;
		root = obj.insertNode(root, new Node<Integer>(7));
		root = obj.insertNode(root, new Node<Integer>(3));
		root = obj.insertNode(root, new Node<Integer>(5));
		assertEquals("735",object.preOrder(root));
	}

}
