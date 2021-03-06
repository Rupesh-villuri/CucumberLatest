Feature: Create Compant in CRM

Scenario Outline: verify user able to create multiple companies

Given CRM login page launched
When provide login crdentials "rupesh.villuri@gmail.com" and "LearnAutomation"
Then user launched home page
Then provide company details "<CompanyName>" and "<Location>" and "<Status>" and Click Save

Examples:
	| CompanyName  | Location  | Status   |
	| Vizag Steels | vizag     | New      |
	| Cognizant    | Hyderabad | Inactive |
	| TCS          | Amaravati | Active   | 
	




Scenario Outline: billing amount
 Given user is on billing page    
 When user enters billing amount <billingamount>
 When user enters tax amount <taxamount>
 And user clicks on calculate button
 Then it gives the final amount <finalamount>
    Examples: 
      | billingamount| taxamount | finalamount|
      | 1000 				 | 10   		 | 1010   		|
      | 500 				 | 20  			 | 520    		|
      | 100 				 | 5.5 			 | 105.5  		|


