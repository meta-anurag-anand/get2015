/**
 * Name:TestVerifyDate
 * Author: Anurag
 * Since: 5 February,2015
 * Description: Test the functionCheckDate For the Dates  
 */
@isTest
public class TestVerifyDate {
	
	// Instance of date To Check the Test Cases
	public static Date day1 = Date.newInstance(2015, 1, 11);
	public static Date day2 = Date.newInstance(2015, 1, 13);
	public static Date day3 = Date.newInstance(2015, 1, 10);
	public static Date lastDayOfMonth = Date.newInstance(2015, 1, 31);

	/**
	 * Name:testCheckDate 
	 * Description: Checks for the date if second date is between 30 days then it will return second days
	 * Param:
	 * Return:
	 */
	@isTest
	static void testCheckDate() {
		
		// To check the Date is between 30 days of the Second Date
		Test.startTest();
		Date result = VerifyDate.CheckDates(day1, day2);
		System.assertEquals(day2, result);
		Test.stopTest();

	}
	/**
	 * Name:testCheckDate2 
	 * Description: Checks for the date if second date is between 30 days then it will return last day of month
	 * Param:
	 * Return:
	 */
	@isTest
	static void testCheckDate2() {
		
		// To check The Date is not Between 30 days of the Second day 
		Test.startTest();
		Date result = VerifyDate.CheckDates(day1, day3);
		System.assertEquals(lastDayOfMonth, result);
		Test.stopTest();
	}

}