Feature: Edit Lead
Scenario Outline: PostiveFlow
Given Open the chrome browser3
Given Load the URL3 as <Url>
Given Enter the username3 as <Username>
Given Enter the password3 as <Password>
When Enter the login button
When Click on CRMSFA
When Click on Leads3 button
When Click on Find Leads button
Given Enter the First name in the field as <Firstname>
When Click on Find Leads button1
When Select the first row of first data
Then Get the title name and verify
When Click on the Edit button
Then Clear the Company Name filed
Given Enter the updated company name as <CompanyName>
When Click on submit button2
Then Verify the updated company name is displayed are not


Examples:
|Url|Username|Password|Firstname|CompanyName|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'Demo'|'TCS'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|'Priya'|'Accenture'|