Feature: Duplicate Lead
Scenario Outline: Duplicate Lead
Given Open the chrome browser5
Given Load the URL5 as <url>
Given Enter the username5 as <username>
Given Enter the password5 as <password>
When Click on the login bttn
When Click on the CRM/SFA 
When Click on the Leads_tab 
When Click on the FindLeads_tab
When Click on email tab 
When Enter the email address as <email>
When Click on find_Lead button
Then Get the text of Firstname and click on the Firstname
Given Click on Duplicate button 
Given Click on Create_Lead btn

Examples:
|url|username|password|email|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'abc@gmail.com'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|'Test'|