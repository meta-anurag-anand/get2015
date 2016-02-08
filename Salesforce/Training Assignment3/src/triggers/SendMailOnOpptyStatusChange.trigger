/**
 * Name: SendMailOnOpptyStatusChange
 * Since: 2 February,2016
 * Author: Anurag
 * Description: Sends Email to the Owner When Status is Changed
 */
trigger SendMailOnOpptyStatusChange on Opportunity (after update) {
   
   // Gets the Id Of the Template
   Id templateId = [Select id from EmailTemplate where name = 'Oppty Status Change Mail'].Id;
   
   // Getting the Old Value and the New Value of the Stage  
   for (Opportunity opp : Trigger.New) {
       opportunity oldOpp = trigger.oldmap.get(opp.Id);
       
       
       // Checks the Condition for the Stage Name
       if (oldOpp.StageName != opp.StageName) {
           Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
           
           // Setting the Parameters for the Email
           mail.setTargetObjectId(opp.OwnerId);
           mail.setTemplateId(templateId);
           mail.setSaveAsActivity(false);
           Messaging.SendEmailResult[] result = Messaging.sendEmail(new Messaging.SingleEmailMessage[] {mail});
       }
   }
}