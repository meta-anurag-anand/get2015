import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * Name: Frequency
 * @author anurag
 * Since: 31 August,2015
 * Description: Finds the frequency of the letter in the word
 **/
public class Frequency
{
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface and Finding Frequency
	 **/
	public static void main(String args[])
	{
		// To store the value in the set
		Set<Character> set = new HashSet<Character>();
		// Hash map to store the occurrence and position
		HashMap<String, String> frequency = new HashMap<String, String>();
		System.out.println("FINDING FREQUENCY");
		System.out.println("Enter  the word to find the frequency");
		// Input through Commandline argument
		String input = args[0];
		// Setting the value to the set
		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			set.add(ch);
		}
		// iterating through the loop
		Iterator itr = set.iterator();
		while (itr.hasNext()) 
		{
			String count = "";
			String SetElement = itr.next().toString();
			for (int j = 0; j < input.length(); j++)
			{
				// Comparing the value
				if (SetElement.equalsIgnoreCase(input.substring(j, j + 1)))
				{
					if (count == "") 
					{
						count += j;
					}
					else
					{
						count = count + "," + j;
					}
				}
			}
			// puting the value
			frequency.put(SetElement, count);
		}
		// printing the value
		for (Map.Entry<String, String> entry : frequency.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
