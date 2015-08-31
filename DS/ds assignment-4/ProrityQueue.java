/**
 * Name: ProrityQueue
 * @author anurag
 * Since: 30 August,2015
 * Description: Operations are performed
 **/
class PriorityQueue
{
	//  array of task
    private Task[] heap; 
    // Declare capacity of task
    private int heapSize, capacity;
 
    // Constructor
    public PriorityQueue(int capacity)
    {    
    	// Capacity is increased
        this.capacity = capacity + 1;
        heap = new Task[this.capacity];
        heapSize = 0;
    }
    /**
     * Name: ClearQueue
     * Description: clears the Queue
     **/
    public void clearQueue()
    {
        heap = new Task[capacity];
        heapSize = 0;
    }
    /**
     * Name: checkIsEmpty
     * @return
     * Description: Checks whether list is empty
     **/
    public boolean checkIsEmpty()
    {
        return heapSize == 0;
    }
    /**
     * Name: checkIsFull
     * @return
     * Description: Checks whether list is full
     **/
    public boolean checkIsFull()
    {
        return heapSize == capacity - 1;
    }
    /**
     * Name: size
     * @return
     * Description: size is returned
     **/
    public int size()
    {
        return heapSize;
    }
    /**
     * Name: insert
     * @param priority
     * Description: inserts the value in queue
     **/
    public void insert( int priority)
    {
        Task newJob = new Task( priority);
        // adds  the new job
        heap[++heapSize] = newJob;
        //
        int pos = heapSize;
        // Checks the priority
        while (pos != 1 && newJob.priority > heap[pos/2].priority)
        {
            heap[pos] = heap[pos/2];
            pos /=2;
        }
        heap[pos] = newJob;    
    }
    /**
     * Name: remove
     * Description: Removes the queue after processing the data 
     **/
    public Task remove()
    {
        int parent, child;
        Task item, temp;
        if (checkIsEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        }
        // item is added
        item = heap[1];
        temp = heap[heapSize--];
 
        parent = 1;
        child = 2;
        // Again constructs the heap
        while (child <= heapSize)
        {
            if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                child++;
            if (temp.priority >= heap[child].priority)
                break;
            // Swaps the value
            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
 
        return item;
    }
}
 