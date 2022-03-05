Feature: Delete Lead
Scenario Outline: Delete Lead
Given Open the chrome browser4
Given Load the URL4 as <url>
Given Enter the username4 as <username>	     
Given Enter the password4 as <password>	    
When click on login btn
Then click on the CRM
When click on leads tab
When click on Find Leads tab
When Click the phone tab
When Enter the phone number as <phoneno>
When click on Find Leads button
When Get the LeadID number and Click LeadID
When Click on Delete button

Examples:
|url|username|password|phoneno|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'99'|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'1'|