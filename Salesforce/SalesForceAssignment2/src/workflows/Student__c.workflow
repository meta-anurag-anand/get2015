<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Record_Updated</fullName>
        <description>Record Updated</description>
        <protected>false</protected>
        <recipients>
            <field>Email__c</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Student_Record_Updated</template>
    </alerts>
    <fieldUpdates>
        <fullName>Married_Status_Confirm</fullName>
        <field>Married__c</field>
        <literalValue>1</literalValue>
        <name>Married Status Confirm</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <rules>
        <fullName>Married Status</fullName>
        <actions>
            <name>Married_Status_Confirm</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Student__c.Wife_Name__c</field>
            <operation>notEqual</operation>
            <value>Null</value>
        </criteriaItems>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Record Updated</fullName>
        <actions>
            <name>Record_Updated</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>OR( ISCHANGED( Age__c ), 
ISCHANGED( Class__c ), 

ISCHANGED( Email__c ), 
ISCHANGED( First_Name__c ), 

ISCHANGED( Married__c ), 
ISCHANGED( Sex__c )
 
)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
