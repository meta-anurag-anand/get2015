public class GenerateMap 
{
	 public static Map<Class__c,Set<ID>>MapofClassAndStudentId()
        {
         list<Class__c>classList=[Select c.ID From Class__c c];
        Map<Class__c, Set<ID>> mapStudentInClass = new Map<Class__c, Set<ID>>();
        for(Integer i =0;i<classList.size();i++){
           Set<ID> studentSet= new Map<Id, Student__c>([Select s.ID from Student__c s where s.Class__r.id=:classList.get(i).Id ]).keySet();

           mapStudentInClass.put(classList[i],studentSet); 
        }
         System.debug(mapStudentInClass);
        return mapStudentInClass;

    }
}