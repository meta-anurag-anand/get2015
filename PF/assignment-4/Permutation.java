package session4;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Name:Permutation
 * @author: Anurag
 * Since: 12August,2015
 * Description: To print all the combinations of string 
 **/
public class Permutation 
{
   static List<String> permutationpattern = new ArrayList<String>();
   /**
    * Name: main function
    * @param args
    * @throws IOException 
    **/
	public static void main(String args[]) throws IOException 
	{
		List<String> output = new ArrayList<String>();
		System.out.println("To find all the combinations of string");
		System.out.println("Enter the string");
		DataInputStream obj=new DataInputStream(System.in);
		String input=obj.readLine();// to take input
		output = permuteString("",input);
		for (int index = 0; index < output.size(); index++)//to print the output
			System.out.println(output.get(index));
	}
  /**
   * 
   * @param beginningString: Starting string
   * @param endingString :inputed string
   * @return string
   **/
	public static List<String> permuteString(String beginningString,String endingString) 
	{
		if (endingString.length() <= 1)
			permutationpattern.add(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++) 
			{
				try
				{
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);//extracting substring
					permuteString(beginningString + endingString.charAt(i),newString);//appending the substring
				} 
				catch (StringIndexOutOfBoundsException exception) 
				{
					exception.printStackTrace();
				}
			}
		return permutationpattern;
	}
}
