/**
 * Name:SendEmailToLoanApplicant
 * Author: Anurag
 * Since: 2 February,2016
 * Description: Sends Email to the Loan Applicant When status is Updated
 */
trigger SendEmailToLoanApplicant on Loan__c (before update) {
	
	// Creating the list To store The object whose status have been Updated
    List<Loan__c> loanStatusUpdateList = new List<Loan__c>();
    for(Loan__c loan : Trigger.new) {
        if((loan.Status__c == 'Approve' || loan.Status__c == 'Rejected')) {
            loanStatusUpdateList.add(loan);
        }
    }
    // Checking the Size of the List
    if(loanStatusUpdateList.size() > 0) {
        try{
        	
        	// Craeting the object Email Message
            Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
            
            // Traversing over the List of loan status Update
            for(Loan__c loan : loanStatusUpdateList) {
            	
            	// Address of the Reciever
                String[] recieverAddress = new List<String>() ;
                
                // Adding the Email to the List and setting the Required Field
                recieverAddress.add(loan.Applicant_Email__c);
        		email.setSenderDisplayName(loan.Manager__c);  
                Id toId =  loan.Id;
                email.setToAddresses(recieverAddress);
                
                // Setting the Email Body
                email.plainTextBody = 'Hii  ' + loan.Applicant_Name__c + ' Your Status for Loan is '+loan.Status__c;
                
                // Sending the Email
                Messaging.SendEmail(New Messaging.SingleEmailMessage[] {email});
            }
        }catch(Exception e) {
            System.debug(e);
        }
    }
}