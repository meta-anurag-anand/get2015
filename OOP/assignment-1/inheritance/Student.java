package oopsSession1;
/**
 * Name:Student
 * @author Anurag
 * since:13 August,2015
 * Description: extens person class
 */
public class Student extends Person 
{
	private int studentId;
	private String[] courses;
    /**
     * 
     * @param uid : unique id
     * @param name : name of the student
     * @param studentId : id of the student
     * Description: assigns value to variable
     */
	public Student(int uid, String name, int studentId) 
	{
		super(uid, name);
		this.studentId = studentId;
	}
    /**
     * Name: getStudentId
     * @return
     * Description: returns studentid
     */
	public int getStudentId()
	{
		return studentId;
	}
    /**
     * Name: setstudentId
     * @param studentId
     * Description: sets student id
     */
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	/**
	 * Name: getCourses
	 * @return
	 * Description: returns the courses offered
	 */
	public String[] getCourses()
	{
		return courses;
	}
	/**
	 * Name: setCourses
	 * @param courses
	 */

	public void setCources(String[] courses) 
	{
		this.courses = courses;
	}
    /**
     *Name: toString
     *Description:returns the value of string
     **/
	public String toString() 
	{
		return super.toString() + ", StudentId:" + studentId;
	}
}
