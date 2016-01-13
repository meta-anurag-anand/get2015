<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Birthday</fullName>
        <description>Birthday</description>
        <protected>false</protected>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>my_Templates/Birthday_Update</template>
    </alerts>
    <alerts>
        <fullName>Birthday_Update</fullName>
        <description>Birthday Update</description>
        <protected>false</protected>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>my_Templates/Birthday_Update</template>
    </alerts>
    <alerts>
        <fullName>Record_To_be_updated</fullName>
        <description>Record To be updated</description>
        <protected>false</protected>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>my_Templates/Teacher_Record_Updated</template>
    </alerts>
    <alerts>
        <fullName>dddddd</fullName>
        <description>ddd</description>
        <protected>false</protected>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>my_Templates/Birthday_Update</template>
    </alerts>
    <rules>
        <fullName>Birthday Update Rule</fullName>
        <active>true</active>
        <formula>Birthdate   - TODAY() =2</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Birthday_Update</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Contact.Birthdate</offsetFromField>
            <timeLength>-2</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Teacher Record</fullName>
        <actions>
            <name>Record_To_be_updated</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(ISCHANGED( Experience__c ), Experience__c  &gt; 5)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
