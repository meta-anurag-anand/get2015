/**
 * Name: AnnotationInterface
 * @author Anurag
 * Since: 16 October,2015
 * Description: UserIntercae
 */
public class AnnotationInterface 
{
	/**
	 * Name:main
	 * @param args
	 * @throws Exception
	 * Description: UserInterface
	 */
	 public static void main(String[] args) throws Exception
	 {
		 // Calling the Function
	      TestAnnotationParser parser = new TestAnnotationParser();
	      parser.parse(Employee.class);
	   }
}
