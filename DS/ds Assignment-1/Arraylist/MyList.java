import java.util.Scanner;

/**
 * Name: MyList
 * @author Anurag
 * @since 25 August,2015
 * Description:  My list is the main class to choose what operation is to make and call methods
 **/
public class MyList
{
	public int index;
	Scanner scan = new Scanner(System.in);
	//arraylist1 object
	ArrayListNew arrayListNewObject = new ArrayListNew();
	Object value;
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String[] args)
	{
		MyList object = new MyList();
		//method calling
		object.arrayOperations();
	}
	/**
	 * Name: arrayOperations
	 * @param
	 * @return
	 * Description: Perform array Operations
	 **/
	public void arrayOperations()
	{
		int loopVar = 0;
		do 
		{
			// method show menu call
			MenuClass.showBasicMenu();
			int choice = 0;
			try 
			{
				choice = scan.nextInt();
			} 
			catch (Exception e)
			{
				System.out.println("please enter integer values only!");;
			}
			switch (choice) 
			{
				//to add elements in listNew
			case 1:
				System.out.println("how many elements you want to enter");
				int number = scan.nextInt();
				for(int i = 0; i < number; i++){
				System.out.println("enter the element");
				value = scan.nextInt();
				arrayListNewObject.addElements(value);
				}
				for(int i=0;i<arrayListNewObject.size;i++)
				{				
					System.out.println(arrayListNewObject.get(i));
				}			
				break;
				// to add element in listNew at particular position
			case 2:
				System.out.println("enter the index at which you want to store the element");
				index = scan.nextInt();
				System.out.println("enter the value");
				value = scan.nextInt();
				ArrayListNew.addElementPosition(index, value);
				for(int i=0;i<arrayListNewObject.size;i++)
				{				
					System.out.println(arrayListNewObject.get(i));
				}
				break;
				//to find index at particular position
			case 3:
				System.out.println("enter the index from where you want to retrieve the element");
				index = scan.nextInt();
				System.out.println("enter the value");
				value = scan.nextInt();
				int returnValue = ArrayListNew.retrieveFirstOccuerence(index, value);
				if(returnValue==-1)
				{
					System.out.println(value+" not found after index " + index);
				}
				else
				{
					System.out.println(value+" found at index " + returnValue);
				}
				break;
				//to find find occurence  of particulat item
			case 4:
				System.out.println("enter the value");
				value = scan.nextInt();
				returnValue = ArrayListNew.retrieveFirstIndexOfParticularItem(value);
				if(returnValue == -1)
				{
					System.out.println(value+" not found in list");
				}
				
				{
					System.out.println(value+" found at index "+returnValue);
				}
				break;
				//to delete particular index value
			case 5:
				System.out.println("enter the index from where you want to delete the element");
				index = scan.nextInt();
				ArrayListNew.remove(index);
				break;
				//to delete particular element
			case 6:
				System.out.println("enter the value");
				value = scan.nextInt();
				ArrayListNew.removeValue(value);
				break;
				//to remove whole list
			case 7:
				ArrayListNew.removeAll();
				break;
				//to print reverse the list
			case 8:
				ArrayListNew.reverse();
				break;
				//to show the whole list
			case 9:
				ArrayListNew.show();
				break;
				//to add list elements in listSecond
			case 10:
				ArrayListSecond ob = new ArrayListSecond();
				System.out.println("how many elements you want to enter");
				number = scan.nextInt();
				for(int i = 0; i < number; i++)
				{
				System.out.println("enter the value");
				value = scan.nextInt();
				ob.add(value);
				}
				break;
				//to merge both the list
			case 11:
				arrayListNewObject.merge();
				break;
			default :
				System.out.println("enter proper input");
			}
			System.out.println("\ndo you want to continue?\n1. yes\n2. no");
			try 
			{
				loopVar = scan.nextInt();
			} 
			catch (Exception e) 
			{
				System.out.println("enter valid input!");
			}
		}while(loopVar==1);
	}
}
