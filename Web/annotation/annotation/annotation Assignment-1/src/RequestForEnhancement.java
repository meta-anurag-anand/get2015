import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Name: RequestForEnhancement
 * @author Anurag
 * Since: 16 October,2015
 * Description: Annotations are created
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement
{
	// To store id
    int id();
    // To store Synposis
    String synopsis();
    // To store Engineer
    String engineer() default "[unassigned]";
    // To store Date
    String date() default "[unknown]";
}
