package oopsSession1;
/**
 * Name:Circle
 * @author Anurag
 * Since: 12 August,2015
 * Description: circle class implements the shape
 */
public class Circle implements Shape
{   
    private int radius;
    /**
     * Name:Circle
     * @param radius :radius of the circle
     */
	public Circle(int radius)
	{
		this.radius = radius;
	}
	/**
	 * Name: draw
	 * Description: prints the mesage
	 */
	public void draw()
	{ 
    System.out.println("Function To Draw Circle");
	}
	/**
	 * Name getArea
	 * Description: returns the radius
	 */
	public double getArea()
	{
		return (22/7)*(radius*radius);
		
	}
	
	
}