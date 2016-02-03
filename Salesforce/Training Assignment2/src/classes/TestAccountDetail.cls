/**
 * Name:TestAccountDetail
 * Since: 2 February,2016
 * Author: Anurag
 * Description: Test the classes on which search option is Provided
 */
@isTest
public class TestAccountDetail {
    /*
     * Name: TestSearchRecordsIfBlank
     * Description: Searches The Record And return total Size Of the Account 
     * Param:
     * Return:
     */
    public static testMethod void TestsearchRecordsIfBlank(){
        
    	SearchRecords AcDetail=new SearchRecords();
    	
    	// AccountList To store The Account Details when no text is inputed
    	List<Account> accountList=[SELECT id,name,billingcity,billingCountry,billingState FROM Account LIMIT 100];
     	AcDetail.searchRecords();
     	System.assertEquals(accountList.size(), AcDetail.createAccountList.size());
    }
    
    /**
     * Name: TestsearchRecordsIfNOtBlank
     * Description: Searches the Record if the Fields are not Blank
     * Param:
     * Return:
     */
    public static testMethod void TestsearchRecordsIfNOtBlank(){  
        // Setting the billcountry value
        String billCountry ='%US%';
     	SearchRecords AcDetail=new SearchRecords();
        // Getting the Account list which is meeting the Criteria
     	List<Account> accountList=[SELECT id,name,billingcity,billingCountry,billingState FROM Account 
                                   WHERE billingCountry LIKE :billCountry];
        // Searches the Record
     	AcDetail.searchRecords();
     	System.assertEquals(accountList.size(), AcDetail.createAccountList.size());
    }
    
}