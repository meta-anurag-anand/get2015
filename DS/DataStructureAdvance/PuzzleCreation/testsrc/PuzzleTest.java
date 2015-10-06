import org.junit.*;
import static org.junit.Assert.*;

/**
 * Name: PuzzleTest
 * @author Anurag 
 * Since: 6 October,2015 
 * Description: Checks the Value returned
 **/
public class PuzzleTest
{
	/**
	 * Name:testSimpleSolve
	 * Description: Checks the Result after solving
	 **/
	@Test
	public void testSimpleSolve() 
	{
		int[] validPuzzle = { 1, 0, 2, 4, 5, 3, 7, 8, 6 };
		Puzzle puzzle = new Puzzle(validPuzzle);
		puzzle.solve();
		assertEquals("\n\n1 2 3 \n4 5 6 \n7 8   ", puzzle.state.toString());
	}
	/**
	 * Name: testSolutionMessage
	 * Description: MAtches the Pattern with the Value returned
	 **/
	@Test
	public void testSolutionMessage() 
	{
		int[] validPuzzle = { 1, 0, 2, 4, 5, 3, 7, 8, 6 };
		Puzzle puzzle = new Puzzle(validPuzzle);
		puzzle.solve();
		assertTrue(puzzle.state.solutionMessage().contains(
				"Here are the steps to the goal state:\n" + "\n" + "1   2 \n"
						+ "4 5 3 \n" + "7 8 6 \n" + "\n" + "1 2   \n"
						+ "4 5 3 \n" + "7 8 6 \n" + "\n" + "1 2 3 \n"
						+ "4 5   \n" + "7 8 6 \n" + "\n" + "1 2 3 \n"
						+ "4 5 6 \n" + "7 8   \n" + "\n"
						+ "Given puzzle is SOLVED!"));
	}
	/**
	 * Name: testHeuristicFirstCase
	 * Description: Cheks the Value
	 **/
	@Test
	public void testHeuristicFirstCase() 
	{
		int[] test1 = { 1, 4, 3, 7, 8, 5, 6, 2, 0 };
		assertEquals(10, Puzzle.getHeuristic(test1));
	}
	/**
	 * Name: testHeuristicSecondCase
	 * Description: Checks the value 
	 **/
	@Test
	public void testHeuristicSecondCase() 
	{
		int[] test2 = { 7, 0, 4, 8, 1, 6, 5, 3, 2 };
		assertEquals(17, Puzzle.getHeuristic(test2));
	}
}
