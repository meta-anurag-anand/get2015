package Assignment1;
/**
 * Name:SingletonMain
 * @author Anurag
 * Since:21 October,2015
 * Description: UserInterface
 */
public class SingletonInterface
{
	/**
	 * Name:Main
	 * @param args
	 * Description: Implements The Function
	 **/
	public static void main(String[] args) 
	{
		// getting instance
		Singleton singleton = Singleton.getInstance();
		// calling singleton class function using that instance
		singleton.logException();
	}
}
