/*
* Name:DeleteStudentController
* Author:anurag
* Since: 29 Januray,2015
*/ 
public class DeleteStudentController {
	// List of Selected Student for delete
    public  List<Student__c> selectedstd{get;set;}
    private ApexPages.StandardSetController standardController;
    
    public DeleteStudentController(ApexPages.StandardSetController standardController)
    {
        this.standardController = standardController;
    }
    
    public void getSelectedStudents()
    {       
        selectedstd = (List<Student__c>) standardController.getSelected();
        selectedstd =[select name,id,class__r.Name from student__c where id In : selectedstd];
    }
    public PageReference deleteStudent() {
        delete selectedstd ;
        System.debug('executed');
        return standardController.cancel();
    }
    
    
}