/**
 * Name: Interface
 * @author Anurag
 * Since: 5 October,2015
 * Description: UserInterface
 **/
public class Interface
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String[] args)
	{
		System.out.println("N*N Sliding Puzzle\n");
		char choice;
		// user Choice
		do {
			int input[] = InputValidator.getArrayInput("Enter 8 sliding puzzle : ");
			Puzzle puzzle = new Puzzle(input);
			System.out.println("Given puzzle:\n" + puzzle.state.toString());
			// Check if the puzzle is solvable.
			if (!puzzle.isSolvable())
			{
				System.out.println("Given puzzle:\n\nis NOT solvable!\n"
						+ puzzle.state.toString());
				System.exit(0);
			}
			// Solve the puzzle.
			puzzle.solve();
			choice = InputValidator.getCharacterInput("Do you want to continue press y otherwise n");
		} while (choice == 'y' || choice == 'Y');
	}
}
