package oopsSession1;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * Name: main
 * @author anurag 
 * Since: 12 August,2015 
 * Description: Adds the value to the class
 **/
public class mainInheritance
{
	/**
	 * Name: main 
	 * Description: Takes the value and calls the method
	 **/
	public static void main(String args[]) 
	{
		System.out.println("Enter the name");// input taken
		Scanner Sc = new Scanner(System.in);
		DataInputStream obj = new DataInputStream(System.in);
		String name = null;
		try 
		{
			name = obj.readLine();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("enter the id ");// id
		int id = Sc.nextInt();
		int studentid = Sc.nextInt();
		Person personobj = new Person(id, name);
		Student student = new Student(id, name, studentid);
		System.out.println(personobj);
		System.out.println(student);
	}
}
