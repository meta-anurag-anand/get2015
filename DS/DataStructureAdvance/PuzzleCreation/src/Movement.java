/**
 * Name: Movement
 * @author Anurag
 * Since: 5 October,2015
 * Description: The movement of the Numbers in the grid of n*n
 **/
public class Movement 
{
	/**
	 * Name: up
	 * @param state
	 * @return
	 * Description: Moves the number above from the current position
	 **/
	public static State up(State state) 
	{
		if (state.blankIndex > 2) 
		{
			return new State(state, state.blankIndex - 3);
		}
		return null;
	}
	/**
	 * Name: down
	 * @param state
	 * @return
	 * Description: Returns a new state with the blank space swapped with the tile below it.
	 **/
	public static State down(State state)
	{
		if (state.blankIndex < 6)
		{
			return new State(state, state.blankIndex + 3);
		}
		return null;
	}
	/**
	 * Name: left
	 * @param state
	 * @return
	 * Description: Swapped with the tile left to it
	 **/
	public static State left(State state) 
	{
		if (state.blankIndex % 3 > 0) 
		{
			return new State(state, state.blankIndex - 1);
		}

		return null;
	}
	/**
	 * Name: right
	 * @param state
	 * @return
	 * Description: Swapped withtile on the right
	 **/
	public static State right(State state)
	{
		if (state.blankIndex % 3 < 2) 
		{
			return new State(state, state.blankIndex + 1);
		}
		return null;
	}
}