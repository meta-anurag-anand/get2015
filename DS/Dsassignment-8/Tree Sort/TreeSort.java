import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
/**
 * Name: BinarySearchTree
 * @author Anurag
 * Since: 28 August,2015
 * Description: Implementing binary tree
 **/
public class TreeSort
{
	// List to store the value
	 String list = "";
	/**
	 * Name: insertNode
	 * @param currentParent
	 * @param newNode
	 * @return
	 * Description: inserts node at the their respective location
	 **/
	public  Node<Integer> insertNode(Node currentParent, Node newNode)
	{
		// if null or not
		if (currentParent == null) 
		{
			return newNode;
		}
		// Allots the value
		else if ((Integer) newNode.value >= (Integer) currentParent.value)
		{
			currentParent.right = insertNode(currentParent.right, newNode);
		}
		else if ((Integer) newNode.value < (Integer) currentParent.value) 
		{
			currentParent.left = insertNode(currentParent.left, newNode);
		}
		return currentParent;
	}
	/**
	 * Name: inOrder
	 * @param root
	 * Description: inorder Traversal is done
	 **/
	public  String inOrder(Node root)
	{
		if (root != null)
		{
			inOrder(root.left);
			list=list+root.getValue();
			System.out.println(root.getValue());
			inOrder(root.right);
		}
	    return list;
	}

	/**
	 * Name: main
	 * @param args
	 * Description: Calls the function to perform operation
	 **/
	public static void main(String args[])
	{
		System.out.println(" In Order Traversal");
		Node<Integer> root = getResources();
		TreeSort obj= new TreeSort();
		obj.inOrder(root);
	}
	/**
	 * Name: getResources
	 * Description: Through values it takes the input 
	 **/
	public static Node<Integer> getResources()
	{
		// To take the option
		String option = null;
		Scanner scan = new Scanner(System.in);
		// Defining root as null
		Node<Integer> root = null;
		DataInputStream abc = new DataInputStream(System.in);
		do 
		{
			// Validation
			System.out.println("Enter the  Roll Number");
			while (!scan.hasNextInt()) 
			{
				System.out.println("Please enter Ineger Value");
				scan.next();
			}
			// value of the node
			int value = scan.nextInt();
			// Creating the object
			TreeSort obj= new TreeSort();
			root = obj.insertNode(root, new Node<Integer>(value));
			System.out.println("Enter y to continue and other letter to exit");
			try
			{
				option = abc.readLine();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} while (option.equalsIgnoreCase("y"));
		scan.close();
		return root;
	}
}
