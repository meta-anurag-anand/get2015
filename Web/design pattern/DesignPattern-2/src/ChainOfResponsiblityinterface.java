import java.util.Scanner;
/**
 * Name: ChainOfResponsiblityInterface
 * @author Anurag
 * Since: 22 October,2015
 * Description: User Interface
 **/
public class ChainOfResponsiblityinterface
{
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String[] args) 
	{
		// Intializing the Accessor
		Approver anurag = new Mentor();
		Approver anand = new SeniorMentor();
		Approver abhishek = new HrManager();
		anurag.SetSuccessor(anand);
		anand.SetSuccessor(abhishek);
		System.out.println("Leave Application");
		System.out.println("Enter no Of days For Leave");
		int n = new Scanner(System.in).nextInt();
		anurag.ProcessRequest(n);
	}
}
