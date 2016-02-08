/**
 * Name: TestDeleteNotallowedForFemaleStudent
 * Author: Anurag
 * Since: 2 February,2015
 * Description: Test the trigger not allowing to delete class if female student > 1
 */
@isTest
public class TestClassTrigger {
	/**
	 * Name:TestForDeleteClassNotAllowed_FemaleStudentGt1
	 * Description: Test the Trigger for female student greater than one
	 * Param:
	 * return:
	 */
	public static testMethod void  TestForDeleteClassNotAllowed_FemaleStudentGt1(){   
		
		// Creating a new object of class
		class__c cls = new class__c(Name__c = 'secondary',MaxSize__c=5,MyCount__c=0);
		// inserting cls
		insert cls;
		
		// Creating new Student 
		student__c newStudent1=new student__c(LastName__C ='xyz',Class__c = cls.id,Sex__c = 'Female'); 
		student__c newStudent2=new student__c(LastName__C ='abc',Class__c = cls.id,Sex__c = 'Female'); 
		
		// Inserting the student
		insert newStudent1;
		insert newStudent2;
		
		Test.startTest();
		try{
			delete cls;
		}
		catch(Exception e){ 
			system.debug('error in  line'+e.getLineNumber()+'due to'+e.getMessage());
		}
		Test.stopTest();



	}
}