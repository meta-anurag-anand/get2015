/* Name:TemplateController
* Since:27 January,2016
* Author:Anurag
* Description: Template Controller for Selecting The acoounts
*/
public class TemplateController {
    
    public List<Account> accountList { get; set; }
    private integer totalRecs = 0;
    private integer OffsetSize = 0;
    private integer LimitSize = 10;
    private String sortType = 'ASC';
    private String sortField = 'Name';
    
    Public TemplateController() {
        fetch();
    }
    /*
* Name: fetch
* Description: Fetches The Data From the Account
*/
    private void fetch() {
        String query = 'SELECT Name, BillingCity FROM Account ORDER BY ' + sortColumn  + ' ' + sortType + ' LIMIT ' + LimitSize + ' OFFSET ' + OffsetSize;
        accountList = Database.query(query);
        totalRecs = accountList.size();
    }
    
    public void FirstPage() {
        OffsetSize = 0;
        fetch();
    }
    
    public void previous() {
        OffsetSize = OffsetSize - LimitSize;
        fetch();
    }
    
    public void next() {
        OffsetSize = OffsetSize + LimitSize;
        fetch();
    }
    
    public void LastPage() {
        OffsetSize = totalrecs - math.mod(totalRecs, LimitSize);
        fetch();
    }
    
    public boolean getprev() {
        if(OffsetSize == 0)
            return true;
        else
            return false;
    }
    
    public boolean getnxt() {
        if((OffsetSize + LimitSize) > totalRecs)
            return true;
        else
            return false;
    }
    /*
* Name: sortColumn
* Description: Sorts the Column According to the Criteria Described
*/
    public String sortColumn {
        get { 
            return sortField; }
        set {
            // Checks the Condition and if ascending then Descending otherwise
            if (value == sortField)
                sortType = (sortType == 'ASC')? 'DESC' : 'ASC';
            else
                sortType = 'ASC';
            sortField = value;
        }
    }
    // Checks for the SortType
    public String getSortType() {
        if (sortColumn == null || sortColumn == '')
            return 'ASC';
        else
            return sortType;
    }
    
    public void setSortType(String value) {  
        sortType = value;
    }
    
    public List<Account> getAccounts() {
        return accountList;
    }
    // Sorts The Data Accordingly on refrenced Type
    public PageReference sortData() {
        accountList = Database.query('SELECT Name, BillingCity FROM Account ORDER BY ' + sortColumn  + ' ' + sortType + ' LIMIT ' + LimitSize + ' OFFSET ' + OffsetSize);
        return null;
    }
}