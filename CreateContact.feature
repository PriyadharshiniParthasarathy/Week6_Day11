Feature: Create Contact

Scenario Outline: Postive Flow
Given Open the chrome browser1
Given Load the URL1 as <url>
Given Enter the username1 as <username>
Given Enter the password1 as <password>
When login button1
Then Homepage1
Then Click on Contacts tab
Then Click on Create Contacts tab
Given Enter the Firstname as <firstname>
Given Enter the Lastname as <Lastname>
Given Enter the FirstNameLocal as <firstNameLocal>
Given Enter the LastNameLocal as <lastNameLocal>
Given Enter the DepartmentName as <departmentName>
Given Enter the Description as <description>
Given Enter the Email as <email>
Given Select the State
When Click on submit button


Examples:
|url|username|password|firstname|Lastname|firstNameLocal|lastNameLocal|departmentName|description|email|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'Priya'|'Dharshini'|'Sumathi'|'Veenu'|'Testers'|'Learning skills'|'alpha123@gmail.com'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|'Riya'|'Priyanka'|'Sumathi'|'Veenu'|'Testers'|'Learning skills'|'alpha123@gmail.com'|

