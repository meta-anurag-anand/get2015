/**
 * Name:Employee
 * @author Anurag
 * Since: 16 October,2015
 * Description: Employee Class Storing info
 **/
public class Employee
{
	/**
	 * Name:Employee Details
	 * @param id
	 * @param synopsis
	 * @param engineer
	 * @param date
	 * Description: Info About Employee
	 **/
	@RequestForEnhancement(id = 1, synopsis = "Anurag")
	public static void employeeDetail(int id, String synopsis, String engineer,String date)
	{
		System.out.println("Hii" +"\nid:"+ id + "\nSynopsis:" + synopsis + "\nEngineer" + engineer
				+ "\nDate" + date);
	}

	/**
	 * Name:Employee Details
	 * @param id
	 * @param synopsis
	 * @param engineer
	 * @param date
	 * Description: Info About Employee
	 **/
	@RequestForEnhancement(id = 1, synopsis = "Anurag", engineer = "software", date = "10/14/2015")
	public static void employeeDetails(int id, String synopsis,
			String engineer, String date) {
		System.out.println("Hii" +"\nid:"+ id + "\nSynopsis:" + synopsis + "\nEngineer" + engineer
				+ "\nDate" + date);
	}

	public static void employeeDetail() {
		System.out.println("Not Annotation");
	}

}
