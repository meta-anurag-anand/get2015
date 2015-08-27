/**
 * Name: Stack<E>
 * @author Anurag
 * Since: 26 August,2015
 * @param <E>
 * Description: Generic type of stack
 */
public class Stack<E>
{
	// data held by the node
	E nodeValue;
	// next node in the list
	Stack<E> start;
	Stack<E> next;
	Stack<E> top;

	// default constructor with no initial value
	public Stack()
	{
		nodeValue = null;
		next = null;

	}

	// initialize nodeValue to item and set next to null
	public Stack(E item)
	{
		nodeValue = item;
		next = null;
	}
    /**
     * Name: push
     * @param element
     * @return
     * Description: push the element in stack
     */
	public boolean push(E element)
	{
		Stack<E> newNode = new Stack<E>(element);
		newNode.next = top;
		top = newNode;
		return true;
	}
	 /**
     * Name: pop
     * @param element
     * @return
     * Description: Pops the element in stack
     */
	public E pop() 
	{
		E result = null;
		if (top != null)
		{
			result = top.nodeValue;
			top = top.next;
		} 
		else
		{
			result = null;
		}
		return result;
	}
	 /**
     * Name: peek
     * @param element
     * @return
     * Description: peek the element from  stack
     **/
	public E peek()
	{
		return top.nodeValue;
	}

	
}
