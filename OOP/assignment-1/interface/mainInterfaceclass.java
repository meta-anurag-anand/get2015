package oopsSession1;
import java.util.Scanner;
/**
 * Name: Mainclass
 * @author Anurag
 * Description: calls the function and takes the input
 */
public class mainInterfaceclass 
{
	/**
	 * Name: printShape
	 * @param shape
	 * Description: prints the area of the shape
	 */
	static void printShape(Shape shape) 
	{
		System.out.println("Area is : " + shape.getArea());
	}
    /**
     * Name: main class
     * @param args
     */
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to calculate area");
		System.out.println("Enter the value of radius");
		Shape shape = new Circle(sc.nextInt());// Take the radius input
		shape.draw();
		shape.getArea();
		printShape(shape);
		System.out.println("Enter the value of side to find the area");//Take the side input 
		Shape squareobj = new Square(sc.nextInt());
		squareobj.draw();
		squareobj.getArea();
		printShape(squareobj);
	}

}