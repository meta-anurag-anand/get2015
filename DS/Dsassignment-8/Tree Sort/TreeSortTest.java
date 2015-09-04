import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Name: TreeSortTest
 * @author Anurag
 * Since: 4 September,2015
 * Description: Tests the value returned by the Tree Sort
 **/
public class TreeSortTest
{
	/**
	 * Name: testInsertNode
	 * Description: Checks the value returned by tree sort
	 **/
	@Test
	public void testInsertNode() 
	{
		TreeSort obj = new TreeSort();
		Node<Integer> root = null;
		// Inserting values
		root = obj.insertNode(root, new Node<Integer>(7));
		root = obj.insertNode(root, new Node<Integer>(3));
		root = obj.insertNode(root, new Node<Integer>(5));
		assertEquals("357", obj.inOrder(root));
	}
	/**
	 * Name: testInsertNull
	 * Description: Checks the value returned by tree sort when inserted nothing
	 **/
	@Test
	public void testInsertNull()
	{
		TreeSort object = new TreeSort();
		Node<Integer> root = null;
		assertEquals("", object.inOrder(root));
	}
	/**
	 * Name: testInsertNegative
	 * Description: Checks the value returned by tree sort  when value inserted is negative values
	 **/
	@Test
	public void testInsertNegative() 
	{
		TreeSort obj = new TreeSort();
		Node<Integer> root = null;
		// Inserting negative values
		root = obj.insertNode(root, new Node<Integer>(-7));
		root = obj.insertNode(root, new Node<Integer>(3));
		root = obj.insertNode(root, new Node<Integer>(-5));
		assertEquals("-7-53", obj.inOrder(root));
	}

}
