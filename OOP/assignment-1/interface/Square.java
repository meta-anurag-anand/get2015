package oopsSession1;
/**
 * Name: Square
 * @author Anurag
 * Description: draws Square
 */
public class Square implements Shape 
{ 
	private int side;
	/**
	 * Name:Square
	 * @param side : Takes the input of square as side
	 */
	public Square(int side) 
	{
		this.side = side;
	}
	/**
	 * Name: draw
	 * Description: draw the circle
	 */
	public void draw() 
	{
		System.out.print("Function To Draw Circle");
	}
    /**
     * Name: area
     * Desscription: returns area
     */
	public double getArea()
	{
		return (side * side);
	}

}
