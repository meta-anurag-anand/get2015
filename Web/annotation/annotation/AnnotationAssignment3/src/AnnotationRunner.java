/**
 * Name: AnnotationRunner
 * @author Anurag
 * Since: 16 October,2015
 * Description: Defines the function with annotaion
 **/
public class AnnotationRunner
{
	// Annotation for method1
	@CanRun
	public static void method1()
	{
		System.out.println("Executing method-1");
	}
	// Method 2 without annotation
	public static void method2()
	{
		System.out.println("Executing method-2");
	}
	// Method 3 with annotation
	@CanRun
	public static void method3()
	{
		System.out.println("Executing method-3");
	}
	// Method4  without annotation
	public static void method4()
	{
		System.out.println("Executing method-4");
	}
	// Method 5 with annotation
	@CanRun
	public static void method5()
	{
		System.out.println("Executing method-5");
	}
	
}
