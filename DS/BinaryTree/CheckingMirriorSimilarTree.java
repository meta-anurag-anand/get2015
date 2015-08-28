
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * Name: CheckingMirriorSimilarTree
 * @author abhishek
 * Since: 28 August,2015
 * Description: Checks if two tree are same or not
 **/
public class CheckingMirriorSimilarTree
{
	// First list of first tree
	static String firstList = "";
	// Second list of second tree
	static String secondList = "";
	/**
	 * Name: postOrder
	 * @param root
	 * @return
	 * Description: post order  traversing is implemented
	 **/
	public static String postOrder(Node root)
	{
		if (root != null)
		{
			secondList = secondList + root.getValue();
			postOrder(root.right);
			postOrder(root.left);
			
			
		}
		return secondList;
	}
	/**
	 * Name: preOrder
	 * @param root
	 * @return
	 * Description: pre order  traversing is implemented
	 **/
	public static String preOrder(Node root) 
	{
		if (root != null)
		{
			firstList = firstList + root.getValue();
			preOrder(root.left);
			preOrder(root.right);
		}
		return firstList;
	}
	/**
	 * Name: getResourcesMirror 
	 * @return
	 * Description: gets the resources required for matching
	 **/
	public static Node<Integer> getResourcesMirror()
	{
		// takes the option
		String option = null;
		Scanner scan = new Scanner(System.in);
		// Default node 
		Node<Integer> root = null;
		DataInputStream abc = new DataInputStream(System.in);
		do
		{
			System.out.println("Enter the  value");
			while (!scan.hasNextInt()) 
			{
				System.out.println("That's not a number!");
				scan.next();
			}
			int value = scan.nextInt();
			// Object is created
			BinarySearchTree obj = new BinarySearchTree();
			root = insertNodeMirror(root, new Node<Integer>(value));
			System.out.println("Enter y to continue and other letter to exit");
			try
			{
				option = abc.readLine();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (option.equalsIgnoreCase("y"));
		return root;
	}
	/**
	 * Name: insertNodeMirrior
	 * @param currentParent
	 * @param newNode
	 * @return
	 * description: Inserting the value at fixed position
	 **/
	public static Node<Integer> insertNodeMirror(Node currentParent,Node newNode)
	{
		// if null
		if (currentParent == null)
		{
			return newNode;
		}
		// sets the value
		else if ((Integer) newNode.value <= (Integer) currentParent.value) 
		{
			currentParent.right = insertNodeMirror(currentParent.right, newNode);
		}
		else if ((Integer) newNode.value > (Integer) currentParent.value)
		{
			currentParent.left = insertNodeMirror(currentParent.left, newNode);
		}
		return currentParent;
	}
	/**
	 * Name: checkingMirriorTree
	 * @return
	 * Description: matching two string to Check whtether they are mirrior or not
	 **/
	private boolean checkingMirrorTree() 
	{
		boolean flag=false;
		System.out.println("Enter the first tree ");
        BinarySearchTree obj = new BinarySearchTree();
		Node<Integer> root = obj.getResources();
		preOrder(root);
		String firstListValue = firstList;
		System.out.println(firstList);
		System.out.println("Enter the Second tree ");
		Node<Integer> second = getResourcesMirror();
		String secondList2 = postOrder(second);
		String secondListValue = secondList2;
		System.out.println(secondList2);
		if (Integer.parseInt(firstListValue) == Integer.parseInt(secondList2)) 
		{
			flag=true;
		} 
		else
		{
			flag=false;
		}
        return flag;
	}
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String args[])
	{
		// calling the function
		CheckingMirriorSimilarTree obj = new CheckingMirriorSimilarTree();
		boolean result=obj.checkingMirrorTree();
		// checking for value 
		if(result)
		{
			System.out.println("Mirror image is present");
		}
		else
		{
			System.out.println("Mirror image is not  present");
		}
	}

}
