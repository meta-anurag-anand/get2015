import java.util.Arrays;
/**
 * Name: ArrayListNew
 * @author anurag
 * Since: 25 August,2015
 * Description: Creating Operations of array list
 **/
public class ArrayListNew
{
	// default size of array
	public static int defaultSize = 10;
	//Intial size 
	public static int size=0;
	// creating objects
	public static Object data[] = new Object[defaultSize];
	// Index of value
	public static int index;
	/**
	 * Name: addElements
	 * @param value
	 * Description: add Elements
	 **/
	public  void addElemnets(Object value)
	{
		if(size == data.length )
		{
			increaseCapacity();
		}
		data[size++] = value;
	}
	/**
	 * Name: merge
	 * Description: merges two list
	 **/
	public void mergeList()
	{
		if((ArrayListSecond.size + size) >= data.length )
		{
			increaseCapacity();
		}
		for(int i = 0; i < ArrayListSecond.size;i++)
		{
			add(ArrayListSecond.newData[i]) ;	
		}		
		System.out.println("both list merged");
	}
	public static void increaseCapacity()
	{
		int newsize = data.length * 2;
		data = Arrays.copyOf(data, newsize);
	}
	/**
	 * Name: get
	 * @param i
	 * @return
	 * Description: This method is used to retrieve the element at particular position
	 **/
	public Object get(int i)
	{
		if(index==-1)
		{
			return 0;
		}
		else
		return data[i];	
	}
	/**
	 * Name: reverse
	 * Description: This method print the reverse of the list
	 **/
	public  static void reverse()
	{
		if(data == null || data.length <= 1)
		{
	        System.out.println("either list is empty or have one element");
	        }       
	        
	        for (int i = 0; i < data.length / 2; i++) 
		{
	        Object temp = data[i]; // swap numbers
	        data[i] = data[data.length - 1 - i];
	        data[data.length - 1 - i] = temp;
	        }
	        System.out.println("Array is reversed  " );	        
	}
	/**
	 * Name: addElementPosition
	 * @param position index value
	 * @param value input value
	 * Description: This method is used to add element at particular index
	 **/
	 public static void addElementPosition(int position, Object value)
	 {
			// TODO Auto-generated method stub
		int flag=0;	
		size++;
		if(position < size)
		{
			flag=1;
		}
		if(flag==1)
		{
			int index1=-1;
			Object myStore1[]=new Object[data.length-position];
			
			if(size<defaultSize)
			{
				for(int j=position;j<size;j++)
				{
					index1++;
					myStore1[index1]=data[j];	
				}				
				data[position]=value;
				for(int k=0;k<index1;k++)
				{
				position++;
				data[position]=myStore1[k];
				}
				index++;
			}
			else
			{
				for(int j=position;j<size;j++)
				{
					index1++;
					myStore1[index1]=data[j];	
				}
				increaseCapacity();	
				data[position]=value;
				for(int k=0;k<index1;k++)
				{
					position++;
					data[position]=myStore1[k];
				}
				index++;
			}
		}
		else
		{
			System.out.println("Array index out of bound");
			size--;
		}
	}	 
	 /**
	  * Name: retrieveFirstOccuerence
	  * @param position 
	  * @param value 
	  * @return returns the index value
	  * Description: This method is retrieve the first occuerence of the value at the given position
	  **/
	public static int retrieveFirstOccuerence(int position,Object value)
	{
		int index1 = 0,flag=-1;
		position++;
		for(int i=position; i < size; i++)
		{
		    if(data[i]==value)
		    {
		    	flag=0;
		    	index1=i;
		    	break;
		    }
		}
		if(flag==0)
		{
			return index1;
		}
		else
		{
			return flag;
		}
	}
	/**
	 * Name: retrieveFirstIndexOfParticularItem
	 * @param value scan value from user whom occurence is to be find
	 * @return return the index of value at first occcurence 
	 * Description: This method is used to retrieve the first coming index in the array list
	 **/
	 public static int retrieveFirstIndexOfParticularItem(Object value)
	 {
		int index2 = 0,flag = -1;
		for(int i = 0; i < size; i++)
		{
			if(data[i]==value)
			{
				flag=1;
				index2=i;
				break;
			}
		}
		if(flag==1)
		{
			return index2;
		}
		else
		{
			return flag;
		}
	}	 
	 /**
	  * Name:remove
	  * @param position 
	  * Description: This method is used to remove element at particular position
	  **/
	 public static void removePosition(int position)
	 {
		if(position >= size)
		{
			System.out.println("Array index out of bound");
		}
		else
		{
	        for(int i = position+1; i < size; i++)
	        {
	        	data[i-1] = data[i];
	        	
	        }
	        size--;
	        index--;
	        System.out.println("Item deleted from index "+ position);
		}
	}
	 /**
	  * Name: removeValue
	  * @param value value given by user
	  * Description: This method removes the user input value
	  **/
	 public static void removeValue(Object value)
	 {
		int flag = 0;
		int index2 = 0;
		for(int i = 0; i < size;i++)
		{
			if(data[i]==value)
			{
				flag=1;
				index2=i;
				break;
			}
		}
		if(flag == 1)
		{
			for(int i = index2+1; i < size; i++) 
			{
			    data[i-1] = data[i];
			}
			size--;
			index--;
			System.out.println(value+" deleted");
		}
		else
		{
			System.out.println(value+" not exist in list");
		}
	}
	 /**
	  * Name: removeAll
	  * Description: his method removes the whole list
	  **/
	 public static void removeAll() 
	 {
		int flag=0;
		if(size>0)
		{
			 flag=1;
			 
		}
		if(flag==1)
		{
			size=0;
			index=-1;
			System.out.println("All elements are removed from list");
		}
		else
		{
			System.out.println("list is already empty");
		}
	}
	 /**
	  * Name: Show
	  * Description: shows the value
	  **/
	public static void show()
	{
		for(int i = 0; i < size; i++)
		{
			System.out.println(data[i]);
		} 
	}
}
