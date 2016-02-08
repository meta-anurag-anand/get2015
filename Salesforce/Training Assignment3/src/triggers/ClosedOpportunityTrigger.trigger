/*
 * Name: ClosedOpportunityTrigger
 * author: Anurag
 * Since: 25 January,2016
 * Description: Populates the close Date with today Date
 */
trigger ClosedOpportunityTrigger on Opportunity (before update) 
{
	Set<String> validOppStageNameSet = new Set<String>{'Closed Won', 'Closed Lost'};
	for(Opportunity opp : Trigger.new) {
		if( validOppStageNameSet.contains(opp.StageName)
				&& !validOppStageNameSet.contains(Trigger.oldMap.get(opp.Id).StageName)
				&& Trigger.oldMap.get(opp.Id).StageName != opp.StageName
				) {
			opp.CloseDate = Date.today();
		}
	}
}