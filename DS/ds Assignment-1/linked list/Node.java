/**
 * Name: Node
 * @author Anurag
 * Since: 25 August,2015
 * @param <T>
 **/
public class Node<T> 
{
	// data held by the node
	T nodeValue;
	// Start node in the list
	Node<T> start;
	// next node in the list
	Node<T> next;
	// default constructor with no initial value
	public Node()
	{
		nodeValue = null;
		next = null;
	}
	// initialize nodeValue to item and set next to null
	public Node(T item) 
	{
		nodeValue = item;
		next = null;
	}
	/**
	 * Name: addElement
	 * @param element
	 * @return
	 * Description: Adds the element to Linked List
	 **/
	boolean addElement(T element)
	{
        // New node to accept value
		Node<T> newNode = new Node<T>(element);
		// To point values
		Node<T> current = new Node<T>();
		if (start == null) 
		{
			start = newNode;
			return true;
		}
		else 
		{
			// Adds after the first node
			current = start;
			while (current.next != null) 
			{
				current = current.next;
			}
			current.next = newNode;
		}
		return true;
	}
    /**
     * Name: display
     * @return
     * Description: display the Linked List
     **/
	boolean display() 
	{
		Node<T> current = new Node<T>();
		current = start;
		System.out.println("Singly Linked List:");
		// Validation check
		while (current != null) 
		{
			System.out.print(current.nodeValue + "-> ");
			current = current.next;
		}
		System.out.println();
		return true;
	}
	/**
	 * Name: addAtPosition
	 * @param position
	 * @param value
	 * @return
	 */
	boolean addAtPostion(int position, T value) 
	{
		// New node
		Node<T> newNode = new Node<T>(value);
		//  To point the value
		Node<T> current = new Node<T>();
		current = start;
		int count = 1;
		
		if (position == 1)
		{
			newNode.next = current;
			start = newNode;
		}

		else
		{
			count = 2;
			while (current != null) 
			{
				if (count == position)
				{
					newNode.next = current.next;
					current.next = newNode;
				}
				count++;
				current = current.next;
			}
			if (count < position)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Name: deleteByValue
	 * @param value
	 * @return
	 * Description: Deleting the value by finding the position
	 **/
	boolean deleteByValue(T value) 
	{
		int flag = 0;
		Node<T> current = start;
		if (current == null)
			return false;
		// Traversing
		while (current != null) 
		{
			if (current.nodeValue == value)
			{
				start = current.next;
				return true;
			}
			if (current.next != null) {
				if (current.next.nodeValue == value) {
					current.next = current.next.next;
					flag = 1;
					return true;
				}
			}
			current = current.next;
		}
		//check the current value
		if ((flag == 0) && (current == null))
		{
			return false;
		}

		return false;
	}
	/**
	 * Name: deleteByIndex
	 * @param position
	 * @return
	 * Description: Deleting the value at index
	 */
	boolean deleteByIndex(int position)
	{
		Node<T> current = new Node<T>();
		current = start;
		int count = 1;
		if (position == 1) 
		{
			// newNode1.next=current;
			// start=newNode1;
			start = current.next;
			// current = start;
		} 
		else
		{
			count = 2;
			while (current != null) 
			{
				if (count == position) 
				{
					current.next = current.next.next;
				}
				count++;
				current = current.next;
			}
			if (count < position) 
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Name: getItem
	 * @param position
	 * @return
	 * Description: Get value at the position
	 */
	T getitem(int position) {
		Node<T> current = new Node<T>();
		current = start;
		int count = 1;
		while (current != null) {
			if (count == position) {
				return current.nodeValue;

			}
			count++;
			current = current.next;
		}
		return null;
	}
	
	/**
	 * Name: reverseLinkedList
	 * Description: Reverse the linked list
	 */
	public void reverseLinkedList() {
		if (start == null || start.next == null)
			return;
		Node<T> Second = start.next;
		// store third node before we change
		Node<T> Third = Second.next;
		// Second's next pointer
		Second.next = start; // second now points to head
		// change head pointer to NULL
		start.next = null; 
		if (Third == null)
		{
			return;
		}
		Node<T> CurrentNode = Third;
		Node<T> PreviousNode = Second;
		while (CurrentNode != null)
		{
			Node<T> NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		start = PreviousNode; // reset the head node
		Node<T> current = start;

	}
	/**
	 * Name: sortList
	 * @return
	 * Description: Sorts the value of the linked List
	 */
    public boolean sortList() 
    {
		if (start == null || start.next == null)
		{
			return true;
		}
		Node<T> newHead = new Node<T>(start.nodeValue);
		Node<T> pointer = start.next;
		// loop through each element in the list
		while (pointer != null) 
		{
			// insert this element to the new list
			Node<T> innerPointer = newHead;
			Node<T> next = pointer.next;
			if ((int) pointer.nodeValue <= (int) newHead.nodeValue)
			{
				Node<T> oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} 
			else 
			{
				while (innerPointer.next != null)
				{
					if ((int) pointer.nodeValue > (int) innerPointer.nodeValue&& (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) 
					{
						Node<T> oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
					innerPointer = innerPointer.next;
				}
				if (innerPointer.next == null&& (int) pointer.nodeValue > (int) innerPointer.nodeValue)
				{
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
			pointer = next;
	    }
	    start = newHead;
	    return true;
    }
}
