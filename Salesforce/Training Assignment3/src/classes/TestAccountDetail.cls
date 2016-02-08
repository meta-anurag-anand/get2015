/**
 * Name:TestAccountDetail
 * Since: 2 February,2016
 * Author: Anurag
 * Description: Test the classes on which search option is Provided
 */
  @isTest
public class TestAccountDetail {
	  /**
	   * Name: setup
	   * Description: in this The Data is created which can be used Further in testing of the Classes
	   * Param:
	   * Return:
	   */
	@testSetup static void setup(){
		List<Account> accountList = new List<Account>();
		Account test1 = new Account(name='Shishir',billingcity='xyz',billingState='CA');
		accountList.add(test1);
		insert accountList;
	}
	/**
	 * Name:testSearchRecords
	 * Description: Tests the Data for the Filters provided as here it Tests by Billing State
	 * Param:
	 * Return:
	 */
	public static testMethod void  SearchRecords_Test(){
		
		// Object of the Class is created AND Billing State is set
		SearchRecords obj = new SearchRecords();
		obj.getBillingStatestring = 'CA';
		
		// Query is put on the Created Data and  Test is done on it By comparing the Size returned and expected
		List<Account> result = [SELECT id,name,billingcity,billingCountry,billingState FROM Account where billingState = 'CA' ];
		
		// Testing of data is started here and checked
		Test.startTest();
		obj.searchRecords();
		system.assertEquals(result.size(), obj.createAccountList.size());
        Test.stopTest();
	}

}