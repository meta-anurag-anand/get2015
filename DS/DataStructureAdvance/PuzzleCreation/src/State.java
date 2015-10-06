import java.util.Arrays;
/**
 * Name:state
 * @author Anurag
 * Since: 6 October,2015
 * Description: Provide the State where the tile is present
 **/
public class State 
{
  // The array representing the puzzle's state. 
  public int[] array = new int[9];
  // The index location of the blank tile in the current state. 
  public int blankIndex;
  // The number of moves since the start. 
  private int totalStartingMove;
  // The number of moves to the goal. 
  private int movesToGoal;
  private State previous;
  // Constructor to intialize the Values
  public State(int[] input)
  {
    this.array = input;
    this.blankIndex = getIndex(input, 0);
    this.previous = null;
    this.totalStartingMove = 0;
    this.movesToGoal = Puzzle.getHeuristic(this.array);
  }
  /**
   * Name:state
   * @param previous
   * @param blankIndex
   * Description: Provides State of the tiles in the block
   **/
  public State(State previous, int blankIndex) 
  {
    this.array = Arrays.copyOf(previous.array, previous.array.length);
    this.array[previous.blankIndex] = this.array[blankIndex];
    this.array[blankIndex] = 0;
    this.blankIndex = blankIndex;
    this.totalStartingMove = previous.totalStartingMove + 1;
    this.movesToGoal = Puzzle.getHeuristic(this.array);
    this.previous = previous;
  }
 /**
  * Name:getIndex
  * @param array
  * @param value
  * @return
  * Description: gets the index of the tile 
  **/
  public static int getIndex(int[] array, int value) 
  {
    for (int i = 0; i < array.length; i++)
      if (array[i] == value) return i;
    return -1;
  }
  /**
   * Name:isSolved
   * @return
   * Description: Checks whether the puzzle is solved or not
   **/
  public boolean isSolved() 
  {
    int[] p = this.array;
    for (int i = 1; i < p.length - 1; i++)
      if(p[i-1] > p[i]) return false;

    return (p[0] == 1);
  }
  /**
   * Name: toString
   * Description: To string method is revoked and called
   **/
  public String toString() 
  {
    int[] state = this.array;
    String s = "\n\n";
    for(int i = 0; i < state.length; i++)
    {
      if(i % 3 == 0 && i != 0) s += "\n";
      s += (state[i] != 0) ? String.format("%d ", state[i]) : "  ";
    }
    return s;
  }

  /**
   * Name: allSteps
   * @return String
   * Description: Represnts all the moves 
   **/
  public String allSteps() 
  {
    StringBuilder sb = new StringBuilder();
    if (this.previous != null) sb.append(previous.allSteps());
    sb.append(this.toString());
    return sb.toString();
  }
  /**
   * Name: solutionMessage
   * @return
   * Description: provides the message
   **/
  public String solutionMessage() 
  {
    StringBuilder sb = new StringBuilder();
    sb.append("Here are the steps to the goal state:");
    sb.append(this.allSteps());
    sb.append("\n\nGiven puzzle is SOLVED!");
    sb.append("\nSolution took " + this.totalStartingMove + " steps.\n");
    return sb.toString();
  }
  /**
   * Name:totalStartingMove
   * @return
   * Description: It is the amount of steps that the current state is at.
   **/
  public int totalStartingMove()
  {
    return this.totalStartingMove;
  }
  /**
   * Name: movesToGoal
   * @return
   * Description: No of moves performed to goal
   **/
  public int movesToGoal()
  {
    return this.movesToGoal;
  }
  /**
   * Name: totalMove
   * @return
   * Description: total move consist to have the complete traversal 
   **/
  public int totalMove()
  {
    return totalStartingMove() + movesToGoal();
  }
  // getter of previous
  public State getPrevious() {
    return this.previous;
  }

}
