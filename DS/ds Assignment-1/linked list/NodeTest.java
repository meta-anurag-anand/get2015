import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Name: NodeTest
 * @author Anurag
 * Since: 26 August,2015
 * Description: checks the value returned is correct or not
 **/
public class NodeTest 
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
	 * Name:testMyList
	 * Description: checks the value returned
	 **/
	@Test
	public void testMyList()
	{
		Node<Integer> list = new Node<Integer>();
	    list.addElement(1);
	    list.addElement(2);
	    list.addElement(3);
	    list.addElement(3);
	    list.addElement(4);
	    int result=list.getitem(4);
	    assertEquals(3,result);  
	}
	/**
	 * Name:testMyListReverse
	 * Description: checks the value returned
	 **/ 
	@Test
	public void testMyListReverse()
	{
	    Node<Integer> list =new  Node<Integer>();
	    list.addElement(1);
	    list.addElement(2);
	    list.addElement(3);
	    list.addElement(4);
	    list.reverseLinkedList();
	    int result=list.getitem(4);
	    assertEquals(1,result);
	}
	/**
	 * Name:testMyListFirstOccurrence
	 * Description: checks the value returned
	 **/
	@Test
	public void testMyListFirstOccurrence() 
	{
		Node<Integer> list =new  Node<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addAtPostion(5, 5);
		int result=list.getitem(5);
		assertEquals(5,result);
	}
	/**
	 * Name:testdeleteByValue
	 * Description: checks the value returned
	 **/
	@Test
	public void testdeleteByValue()
	{
		Node<Integer> list =new  Node<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.deleteByValue(3);
		int result=list.getitem(3);
		assertEquals(4,result);
	}
	/**
	 * Name:testdeleteByIndex
	 * Description: checks the value returned
	 **/
	@Test
	public void testdeleteByIndex()
	{
		Node<Integer> list =new  Node<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.deleteByIndex(3);
		int result=list.getitem(3);
		assertEquals(4,result);
	}
}
