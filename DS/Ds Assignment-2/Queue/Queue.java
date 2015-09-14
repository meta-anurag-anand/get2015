/**
 * Name: Queue
 * @author anurag
 * Since:26 August,2015
 * Description: Queue implementation
 **/
public class Queue
{
	// points to first element
	private int front;
	// point to last
	private int end;
	// Defaults Size
	private int size;
	// Object of Queue
	private Object queue[];
	
	// getter of End
	public int getEnd() 
	{
		return end;
	}
	// setter of End
	public void setEnd(int end) 
	{
		this.end = end;
	}
   // getter of size
	public int getSize()
	{
		return size;
	}
	// setter of size
	public void setSize(int size)
	{
		this.size = size;
	}
	// getter of Queue
	public Object[] getQueue()
	{
		return queue;
	}
	// setter of Queue
	public void setQueue(Object[] queue)
	{
		this.queue = queue;
	}
	// setter of front
	public void setFront(int front)
	{
		this.front = front;
	}
	/**
	 * Name: Queue
	 * @param size
	 * Description: Constructor of Queue
	 **/
	public Queue(int size)
	{
		front = -1;
		end = -1;
		this.size = size;
		queue = new Object[size];

	}
	/**
	 * Name: enqueue
	 * @param item
	 * Description: enters the value
	 **/
	public void enqueue(Object item)
	{
		// Checks the size
		if (end >= size - 1)
		{
			System.out.println("Queue is full");
			return;
		} 
		else if (front == -1 && end == -1) 
		{
			front = 0;
		}
		end = end + 1;
		queue[end] = item;
	}
	/**
	 *Name: dequeue 
	 * @return
	 * Description: deletes the value
	 **/
	public Object dequeue() 
	{
		Object item = new Object();
		if (front == -1)
		{
			System.out.println("Queue is empty");
			return null;

		} 
		else
		{
			item = queue[front];

		}
		if (front == end)
		{
			front = -1;
			end = -1;

		} 
		else
			front = front + 1;
		return item;
	}
	/**
	 * Name: makeEmpty()
	 * Description: Empty the Queue
	 **/
	public void makeEmpty()
	{
		front = -1;
		end = -1;

	}
	/**
	 * Name: getFront
	 * @return
	 * Description: Gets the Front Element
	 **/
	public Object getFront() 
	{
		Object object = new Object();
		if (end == -1) 
		{
			System.out.println("Queue is empty");
			return null;
		} 
		else
		{
			object = queue[end];
		}
		return object;
	}
}