/**
 * Name: MailServiceClass
 * Since:  2 February,2016
 * Author: Anurag
 * Description: Mail Service Class to handle the Attachments and other Parameters of the Email
 */
global class MailServiceClass implements Messaging.InboundEmailHandler {
   /**
    * Name: handleInboundEmail
    * Description: Handles the Attachements 
    * Param: Messaging.InboundEmail email -> contains the Attachment
             Messaging.InboundEnvelope envelope -> Conatins To and Fro of the Email
    * Return: Messaging.InboundEmailResult
    */
   global Messaging.InboundEmailResult handleInboundEmail(Messaging.InboundEmail email, Messaging.InboundEnvelope envelope) {
       
       Messaging.InboundEmailResult result = new Messaging.InboundEmailResult();
       
       // Loop to traverse Over the Attachments
       for (Messaging.Inboundemail.TextAttachment file : email.textAttachments) {
            
            // List to store The Contacs
           list<Contact> contactList=new list<Contact>();
           
           // Body To store the  content of the Body
           String fileBody = (String)file.body;
           
           
           Dom.Document doc = new Dom.Document();
           doc.load(fileBody);
           
           // For traversing the Contents Present in xml
           for(DOM.XMLNode xmlnodeobj:doc.getRootElement().getChildElements()){
            
               Contact con = new Contact();
               
               // Taking the Value From the Xml
               String firstName = xmlnodeobj.getChildElement('firstName', null).getText();
               String lastName = xmlnodeobj.getChildElement('lastName', null).getText();
               
               // Assigning to the Object
               con.firstName = firstName;
               con.lastName = lastName;
               
               // Adding to the List
               contactList.add(con);
           }
           
           // Updating th Contact List
           insert contactList;
       }
       return result;
    }
}