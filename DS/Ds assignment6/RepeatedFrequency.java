import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * Name: RepeatedFrequency
 * @author Anurag
 * Since: 1 September,2015
 * Description: Checks the Repeated Frequency if present 
 **/
public class RepeatedFrequency 
{
	// HashMap to store the frequency of the inputed String
	static HashMap<String, Integer> cache = new HashMap<String, Integer>();
	/**
	 * Name: frequency
	 * @param input
	 * @return
	 * Description: Calculates the frequency of the given input
	 **/
	public static int frequency(String input)
	{
		// To store the result
		int result = 0;
		// Set to store the Unique Character
		Set<Character> set = new HashSet<Character>();
		// Matches the input
		if (cache.containsKey(input))
		{
			return cache.get(input);
		}
		// Finds the Frequency
		for (int i = 0; i < input.length(); i++) 
		{
			// Extracting the character
			char ch = input.charAt(i);
			set.add(ch);
		}
		// Stores the result
		result = set.size();
		// Puts into the cache
		cache.put(input, result);
		return result;
	}
	/**
	 * Name: main
	 * @param args
	 * @throws IOException
	 * Description: User interface
	 **/
	public static void main(String args[]) throws IOException
	{
		DataInputStream abc = new DataInputStream(System.in);
		System.out.println("!!!Frequency Finder !!! ");
		// To store the choice
		String choice = "";
		// To store the result 
		int result = 0;
		do
		{
			System.out.println("Enter the string");
			// To store the input
			String input = abc.readLine();
			// To store the result
			result = frequency(input);
			System.out.println("Frequency of the entered string is:" + result);
			System.out.println("Enter y to add more records and press other key to exit");
			// Storing the choice
			choice = abc.readLine();
		} while (choice.equalsIgnoreCase("y"));
	}
}
