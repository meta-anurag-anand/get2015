import java.lang.reflect.Method;
/**
 * Name: TestAnnotationParser
 * @author Anurag
 * Since: 16 October,2015
 * Description: Checks the VAlue and parses the Annotation
 **/
public class TestAnnotationParser
{
	/**
	 * Name: main
	 * @param args
	 * @throws Exception
	 * Description: User Interface
	 **/
	public static void main(String[] args) throws Exception 
	{
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(AnnotationRunner.class);
	}
	/**
	 * Name:parse
	 * @param tempClass
	 * @throws Exception
	 * Description: Parses the whole file and updates the value
	 **/
	public void parse(Class<?> tempClass) throws Exception 
	{
		// Array of methods to get the annotations
		Method[] methods = tempClass.getMethods();
		for (Method method : methods)
		{
			if (method.isAnnotationPresent(CanRun.class))
			{
				CanRun test = method.getAnnotation(CanRun.class);
				// try to invoke the method with param
				method.invoke(AnnotationRunner.class.newInstance());
			}
		}
	}

}
