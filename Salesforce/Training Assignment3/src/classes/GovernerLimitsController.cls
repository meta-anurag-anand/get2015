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
	public double dmlQueryUsedPercentage {get ;set ;}
	
	/**
	 * Name:GovernerLimitsControllerConstructor
	 * Description: Sets the variable to zero
	 * return
	 * param 
	 */
	public GovernerLimitsController(ApexPages.StandardController con) {
		dmlQueryUsedPercentage = 0;
	}
	
	/**
	 * Name: updateNoOfQuery
	 * Description: Fetches the List and updates the Query
	 * return: 
	 * param:
	 */
	public void updateNoOfQuery() { 
		accountList = [select Id,Name from Account limit 10];
		update accountList;
		double QueriesRunned =limits.getQueries();
		double QueriesLimit=Limits.getLimitDMLStatements();
		dmlQueryUsedPercentage=(QueriesRunned*100)/QueriesLimit;
	}
}



 