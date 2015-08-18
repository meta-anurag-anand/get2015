package oopsSession1;
/**
 * Name: Person
 * @author Anurag
 * Since: 12 August,2015
 * Description : Details of person 
 */
public class Person 
{
	private int uid;
	private String name;
    /**
     * Name: person constructor
     * @param uid
     * @param name
     * Description : intialize the data
     */
	public Person(int uid, String name) 
	{
		this.uid = uid;
		this.name = name;
	}
	/**
     * Name: getUid
     * @return
     * Description: takes the uid
     */
	public int getUid() 
	{
		return uid;
	}
	/**
     * Name: setUid
     * @return
     * Description: sets the uid
     */
	public void setUid(int uid) 
	{
		this.uid = uid;
	}
	/**
     * Name: getName
     * @return
     * Description: Takes the input
     */
	public String getName() 
	{
		return name;
	}
	/**
     * Name: setName
     * @return
     * Description: sets the name after taking the name
     */
	public void setName(String name) 
	{
		this.name = name;
	}
	/**
     * Name: toString
     * @return
     * Description: returns the value
     */
	public String toString() 
	{
		return "Name:" + name + ", uid:" + uid;
	}
}