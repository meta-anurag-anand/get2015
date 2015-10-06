/**
 * Name: Validation
 * @author anurag
 * Since: 2 October,2015
 * Description: Validation Of the STring
 **/
public class Validation 
{
	/**
	 * Name: isExpression
	 * @param expression
	 * @return
	 * Description: Checks the Expression
	 **/
	public static boolean isExpression(String expression)
	{
		// if Expression is Null
		if (expression == null)
		{
			return false;
		}
		// Array To be intialized
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
		int openCount = 0, closeCount = 0;
		int i = 0;
		// Traverses the Expression
		for (i = 0; i < (length - 1); i++) 
		{
			// Checks the Array
			if (expressionArray[i] == ')') 
			{
				// Checks The Digit
				if (Character.isDigit(expressionArray[i + 1])
						|| expressionArray[i + 1] == '(')
				{
					return false;
				}
			}
			// Checks the Array
			if (expressionArray[i] == '(') 
			{
				if (expressionArray[i + 1] == ',')
					return false;
			}

			if (Character.isDigit(expressionArray[i]))
			{
				if (expressionArray[i + 1] == '(')
				{
					return false;
				}
			}
		}
		// Checks the Expression
		if (expressionArray[0] == '&' || expressionArray[0] == '|'|| expressionArray[length - 1] == '&'|| expressionArray[length - 1] == '|'|| expressionArray[length - 1] == '~')
		{
			return false;
		}
		// Traverse the Array
		for (char c : expressionArray)
		{
			if (!(Character.isDigit(c)) && !(c == ',') && !(c == '(')&& !(c == ')')) 
			{
				return false;
			} 
			else
			{
				if (c == '(')
				{
					openCount++;
				}
				else if (c == ')')
				{
					closeCount++;
				}
			}
		}
		if (openCount == closeCount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
