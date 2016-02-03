/**
 * Name: GovernerLimitsController
 * Since: 2 February,2016
 * author: Anurag
 * Description: Sets the Dml Used And updates the no of Queries used
 */
public class GovernerLimitsController {
	// List of account
	public List<Account> accountList{ get ; set ;}
	
	// To store the DmlQueryused
	public Integer dmlQueryUsed {get ;set ;}
	
	/**
	 * Name:GovernerLimitsControllerConstructor
	 * Description: Sets the variable to zero
	 * return
	 * param 
	 */
	public GovernerLimitsController(ApexPages.StandardController con) {
		dmlQueryUsed = 0;
	}
	
	/**
	 * Name: updateNoOfQuery
	 * Description: Fetches the List and updates the Query
	 * return: 
	 * param:
	 */
	public void updateNoOfQuery() {
		// Gets the Value and sets the value into the List
		accountList = [select Id,Name from Account limit 10];
		update accountList;
		dmlQueryUsed = Limits.getQueries();
	}
}