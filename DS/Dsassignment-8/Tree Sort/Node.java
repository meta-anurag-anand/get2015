/**
 * Name:Node 
 * @author Anurag
 * since: 3 September,2015
 * @param <E>
 * Description: Generic type node
 **/
public class Node<E>
{
	// Node to point left
	Node<E> left;
	// Node to point right
	Node<E> right;
	// Value of Node
	E value;
	/**
	 * Constructor
	 **/
	public Node()
	{
		left = null;
		right = null;
		value = null;
	}
	/**
	 * Name: Node
	 * @param key
	 * Description: Values of key elements assigned
	 */
	public Node(E key)
	{
		left = null;
		right = null;
		value = key;
	}
	// getter of Node left
	public Node<E> getLeft()
	{
		return left;
	}
	// Sets the value
	public void setLeft(Node<E> left)
	{
		this.left = left;
	}
	// Getter of Node right
	public Node<E> getRight() 
	{
		return right;
	}
	// Sets the value
	public void setRight(Node<E> right)
	{
		this.right = right;
	}
	// Returning the value
	public E getValue()
	{
		return value;
	}
	// Sets the value
	public void setValue(E value) 
	{
		this.value = value;
	}
}
