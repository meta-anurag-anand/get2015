import java.util.Scanner;

/**
 * Name: InfixToPostfix
 * @author Anurag 
 * Since: 26 August,2015
 *  Description: Converts infix to postfix
 **/
public class InfixToPostfix 
{
	/**
	 * Name: isOperator
	 * @param c
	 * @return
	 * Description: Checks the character is operator
	 **/
	private boolean isOperator(char c)
	{
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
			return true;
		return false;
	}
	/**
	 * Name: checkPrecedence
	 * @param c1
	 * @param c2
	 * @return
	 * Description: checks the precedence
	 **/
	private boolean checkPrecedence(char c1, char c2)
	{
		if ((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
		{
			return true;
		}
		else if ((c2 == '*' || c2 == '/')&& (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
		{
			return true;
		}
		else if ((c2 == '^')&& (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Name: convert
	 * @param infix
	 * @return
	 * Description: Converts infix expression to postfix
	 **/
	public String convert(String infix)
	{
		// equivalent postfix is empty initially
		String postfix = "";
		// stack to hold symbols
		Stack<Character> s = new Stack<>(); 
		// symbol to denote end of stack
		s.push('#'); 
		for (int i = 0; i < infix.length(); i++)
		{
			// symbol to be processed
			char inputSymbol = infix.charAt(i); 
			if (isOperator(inputSymbol))
			{ 
				while (checkPrecedence(inputSymbol, s.peek()))
				{
					postfix += s.pop();
				}
				s.push(inputSymbol);
			} 
			else if (inputSymbol == '(')
			{
				// push if left parenthesis
				s.push(inputSymbol);
			}
			else if (inputSymbol == ')')
			{
				// repeatedly pops if right parenthesis until left parenthesis
				// is found
				while (s.peek() != '(')
				{
					postfix += s.pop();
				}
				s.pop();
			} 
			else
			{
				postfix += inputSymbol;
			}
		}
		// pops all elements of stack left
		while (s.peek() != '#')// peek
		{
			postfix += s.pop();
		}
		return postfix;
	}

   /**
    * Name: main
    * @param args
    * Description: user Interface
    **/
	public static void main(String[] args)
	{
		InfixToPostfix obj = new InfixToPostfix();
		Scanner sc = new Scanner(System.in);
		System.out.print("Infix : \t");
		String infix = sc.next();
		System.out.print("Postfix : \t" + obj.convert(infix));
	}
}