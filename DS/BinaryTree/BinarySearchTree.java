import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
/**
 * Name: BinarySearchTree
 * @author anurag
 * Since: 28 August,2015
 * Description: Implementing binary tree
 **/
public class BinarySearchTree
{
	/**
	 * Name: insertNode
	 * @param currentParent
	 * @param newNode
	 * @return
	 * Description: inserts node at the their respective location
	 **/
	public static Node<Integer> insertNode(Node currentParent, Node newNode)
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
		} else if ((Integer) newNode.value < (Integer) currentParent.value) 
		{
			currentParent.left = insertNode(currentParent.left, newNode);
		}
		return currentParent;
	}
	/**
	 * Name: preOrder
	 * @param root
	 * Description: Pre order Traversal is done
	 **/
	public static void preOrder(Node root)
	{
		if (root != null)
		{
			System.out.println(root.getValue());
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	/**
	 * Name: main
	 * @param args
	 * Description: Calls the function to perform operation
	 **/
	public static void main(String args[])
	{
		System.out.println(" Pre Order Traversal");
		Node<Integer> root = getResources();
		preOrder(root);
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
			// value of the node
			int value = scan.nextInt();
			root = insertNode(root, new Node<Integer>(value));
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
		return root;
	}
}
