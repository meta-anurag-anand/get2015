/*
 * Name: BillToContactController
 * author: Anurag
 * Since: 25 January,2016
 * Description: Populates the Field with manager
 */
public class BillToContactController {
    public Opportunity opportunity{get;set;}
    public Id contactId{get;set;}
    public List<Contact> contactList{get;set;}
    // Gets the Record From the Opportunity and add to the Contact List
    public BillToContactController(ApexPages.StandardController stdController) {
        this.opportunity = (Opportunity)stdController.getRecord();
        Opportunity opportunityObject=this.opportunity;
        this.contactList=[SELECT ID,Name FROM Contact where Contact.AccountID=:opportunityObject.Manager__c];
        
    }
    /*
     * Name: getItems
     * Description: Gets theItems and selects the List from it
     */
    public List<SelectOption> getItems(){
        List<SelectOption> options=new List<SelectOption>();
        for(Contact contact:contactList)
            options.add(new SelectOption(contact.Id,contact.Name));
        return options;
    }
    /*
     * Name: setManager
     * Description: Sets the manager to the Required field
     */
    public void setManager(){
        Opportunity opportunityObject = this.opportunity;
        opportunityObject.BillToContact__c = this.contactId;
        update opportunityObject;
    }
    /*
     * Name: clearManager
     * Description: Clears the Manager of the required field
     */
    public void clearManager(){
        Opportunity opportunityObject = this.opportunity;
        opportunityObject.BillToContact__c = null;
        update opportunityObject;
    }
}