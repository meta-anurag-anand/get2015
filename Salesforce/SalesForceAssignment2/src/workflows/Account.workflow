<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Account_Updated</fullName>
        <description>Account Updated</description>
        <protected>false</protected>
        <recipients>
            <type>accountOwner</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>my_Templates/Reveneue_Update</template>
    </alerts>
    <fieldUpdates>
        <fullName>Approval_Intial</fullName>
        <field>Type</field>
        <literalValue>Pending</literalValue>
        <name>Approval Intial</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Final_Rejection_Actions</fullName>
        <field>Approval_Message__c</field>
        <literalValue>Prospect</literalValue>
        <name>Final Rejection Actions</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Status_Approved</fullName>
        <field>Approval_Message__c</field>
        <literalValue>Customer</literalValue>
        <name>Status Approved</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Status_Approved1</fullName>
        <field>Type</field>
        <literalValue>Customer</literalValue>
        <name>Status Approved1</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Status_Reject</fullName>
        <field>Type</field>
        <literalValue>Prospect</literalValue>
        <name>Status Reject</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update</fullName>
        <field>Type</field>
        <literalValue>Pending</literalValue>
        <name>Update</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>Account updated by other</fullName>
        <actions>
            <name>Account_Updated</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( OwnerId &lt;&gt; LastModifiedById, AnnualRevenue &gt; 100000)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
