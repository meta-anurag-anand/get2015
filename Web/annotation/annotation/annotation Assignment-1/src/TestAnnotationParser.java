import java.lang.reflect.Method;
/**
 * Name: TestAnnotationParser
 * @author Anurag
 * Since: 16 October,2015
 * Description: Parsing the Data
 **/
public class TestAnnotationParser 
{
	/**
	 * Name:parse
	 * @param tempClass
	 * @throws Exception
	 * Description: Parses the Data
	 **/
	public void parse(Class<?> tempClass) throws Exception 
	{
		// array of Methods
		Method[] methods = tempClass.getMethods();
		for (Method method : methods)
		{
			// Checking for the Data
			if (method.isAnnotationPresent(RequestForEnhancement.class))
			{
				RequestForEnhancement test = method.getAnnotation(RequestForEnhancement.class);
				int info = test.id();
				String synopsis = test.synopsis();
				// Matching the Data
				if (1 == info) 
				{
					System.out.println("\n");
					System.out.println("Data About Annotations");
					method.invoke(Employee.class.newInstance(), info, synopsis,test.engineer(), test.date());
				}
			}
		}
	}
}
