/**
 * Name:TestUpdateNotAllowedForHindiTeacher
 * author: Anurag
 * Since: 2 February,2016
 * Description: Checks the Trigger On contact For the teacher Having subject equal to Hindi
 */
@isTest
public class TestUpdateNotAllowedForHindiTeacher {

    /**
     * Name:TestContactTriggerWhenInsert
     * Description: Test the Trigger when insert of new Contact is done having subject Hindi
     * param
     * return
     */
    public static testMethod void  TestContactTriggerWhenInsert()
    { 
        // Creating a new contact with subject equal to Hindi
        contact cnt=new contact(FirstName='Anurag',LastName='Anand',Subjects__c='Hindi');
        try{
            // Inserting the Contact
        	insert cnt;
        }
    	catch(Exception e){ 
        	system.debug('error in  line'+e.getLineNumber()+'due to'+e.getMessage());
        }
        Test.stopTest();
    }
    /**
     * Name:TestContactTriggerWhenUpdate
     * Description: Checks for the Contact when Anyone wants to update With subject Hindi
     * param:
     * return
     */
    public static testMethod void  TestContactTriggerWhenUpdate(){ 
    	// Inserting a new Contact
    	contact cnt=new contact(FirstName='Anurag',LastName='Anurag',Subjects__c='English');
    	insert cnt;
        // Updating CNt Subjects To Hindi
    	cnt.Subjects__c = 'Hindi';
      	try{
        	update cnt;
   		}
    	catch(Exception e){ 
       		system.debug('error in  line'+e.getLineNumber()+'due to'+e.getMessage());
    	}
    	Test.stopTest();    
    }
}