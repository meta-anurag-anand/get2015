import java.util.Arrays;
/**
 * Name:ArrayListSecond
 * @author anurag
 * Since: 25 August,2015
 * DEscription: Creates Array list Second
 **/
public class ArrayListSecond
{
	// default size of array list
	public static int defaultSize = 10;
	// Starting size of array 
	public static int size = 0;
	// object created of data
	public static Object newData[] = new Object[defaultSize];
	// Index position
	int index = 0;
	/**
	 * Name:addElements
	 * @param value
	 * Description:  This method is used to add elements in list
	 **/
	public static void addElements(Object value)
	{
		if (size == newData.length) 
		{
			increaseCapacity();
		}
		newData[size] = value;
		size++;
	}
	/**
	 * Name: increaseCapacity
	 * Description: increases the capacity
	 **/
	public static void increaseCapacity()
	{
		int newsize = newData.length * 2;
		newData = Arrays.copyOf(newData, newsize);
	}
	/**
	 * Name: size
	 * @return
	 * Description: returns the size
	 **/
	public int size() 
	{
		return size;
	}
}
