/**
 * Name:List
 * @author Anurag
 * Since:2 October,2015 
 * Description: Creates the Function and performs the 
 **/
public class List 
{
	// Node of list
	ListNode first;
	// To store the max
	private int max;
	// To store the sum
	private int sum;
	// To store size
	private int size;
	// To store index
	private int index;
	// To store the input
	private String input;
	// To store the current char
	private char currentChar = 0;

	// Default Constructor of class List 
	public List() 
	{
		first = null;
	}
	/**
	 * Name:List
	 * Description:To store the input and check it 
	 **/
	public List(String input) 
	{
		// Updating the value
		max = Integer.MIN_VALUE;
		// Intializing the value
		sum = 0;
		index = 1;
		// size will contain the number of elements in the list
		size = 0;
		this.input = input;
		first = createList();
	}

	/**
	 * Name: createList
	 * Description:Method to create generalized list
	 **/
	private ListNode createList()
	{
		// Intializing the head
		ListNode head = null;
		// Intializing the prev
		ListNode prev = null;
		int flag = 1;
		if (index < input.length()) 
		{
			currentChar = input.charAt(index);
		}
		do {
			switch (currentChar) 
			{
			case '(':
				// increasing index value 
				index++;
				// creating a new node 
				ListNode newNode = new ListNode();
				// setting the tag value to 1 of the newly created node 
				newNode.setTag(1);
				// recursively call the method to create list 
				newNode.setData(createList());
				newNode.setNext(null);
				if(head == null) 
				{
					head = newNode;
					prev = newNode;
				}
				else 
				{
					prev.setNext(newNode);
					prev = newNode;
				}
				break;

			// If current character is a digit then this case will be executed 
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				// number contains the current character in string format 
				String number = Character.toString(currentChar);
				index++;
				currentChar = input.charAt(index);
				while (currentChar >= '0' && currentChar <= '9') 
				{
					number += currentChar;
					index++;
					currentChar = input.charAt(index);
				}
				int data = Integer.parseInt(number);
				size++;
				ListNode newNode1 = new ListNode();
				newNode1.setTag(0);
				newNode1.setData(data);
				newNode1.setNext(null);
				if (head == null)
				{
					head = newNode1;
					prev = newNode1;
				}
				else 
				{
					prev.setNext(newNode1);
					prev = newNode1;
				}
				break;
			// if currentChar is ',' then this case will be executed 
			case ',':
				index++;
				currentChar = input.charAt(index);
				break;
			// if currentChar is ')' then this case will be executed 
			case ')':
				flag = 0;
				index++;
				if (index < input.length()) 
				{
					currentChar = input.charAt(index);
				}
				return head;
			default:
				flag = 0;
				break;
			}

		} while (flag != 0 || index < input.length());
		return head;
	}
	/**
	 * Name:traverse
	 * @param first
	 * Description:Traversing the list
	 **/
	public void traverse(ListNode first) 
	{
		//Iterating over the list until the list becomes null 
		while (first != null)
		{
			if (first.getTag() == 0) 
			{
				System.out.println(first.getData() + ", ");
				sum += (Integer) first.getData();
				if (max < (Integer) first.getData()) 
				{
					max = (Integer) first.getData();
				}
				first = first.getNext();
			} 
			else 
			{
				// recursive calling of traverse function
				ListNode first1 = (ListNode) first.getData();
				traverse(first1);
				first = first.getNext();
			}
		}
	}
	/**
	 * Name:findElement
	 * @param searchingElement
	 * @return
	 * Description: finds the Element
	 **/
	public boolean findElement(int searchingElement)
	{
		if(size ==0 )
		{
			System.out.println("There is no element in List");
			return false;
		} 
		return findElementInList(first, searchingElement);
	}
	/**
	 * Name:findElementInList
	 * @param first
	 * @param searchingElement
	 * @return
	 * Description: To finds the Element in the List
	 **/
	private boolean findElementInList(ListNode first,int searchingElement)
	{
		// Intializing the Value
		boolean isFound = false;
		while(first != null ) 
		{
			if(first.getTag() == 0)
			{
				// Checks the Value
				if(searchingElement == (Integer)first.getData()) 
				{
					isFound = true;
				}
				first = first.getNext();
			} 
			// If not found
			else 
			{
				ListNode first1 = (ListNode)first.getData();
				isFound = (findElementInList(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}

	/**
	 * Name: max
	 * Description: Method to get maximum element from a list
	 **/
	public int max()
	{
		if (size == 0) 
		{
			System.out.println("There is no element in List");
		}
		return max;
	}

	/**
	 * Name:sum
	 * Description: Method to get sum of elements of a list
	 **/
	public int sum() 
	{
		if (size == 0) 
		{
			System.out.println("There is no element in List");
		}
		return sum;
	}

	/**
	 * Name: size
	 * Description:Method to get size of a list
	 **/
	public int size()
	{
		return size;
	}
}
