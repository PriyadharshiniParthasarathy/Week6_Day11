Feature: Create Lead

Scenario Outline: Postive Flow
Given Open the chrome browser2
Given Load the URL2 as <url>
Given Enter the username2 as <username>
Given Enter the password2 as <password>
When login button2
Then Homepage2
Then Click on Leads tab
Then click on Create Lead tab
Given Enter the Companyname as <Companyname>
Given Enter the Firstname1 as <Firstname1>
Given Enter the Lastname1 as <Lastname1>
Given Select the Source
Given Select the Campaign
Given Enter the firstNameLocal as <firstNameLocal>
Given Enter the lastNameLocal as <lastNameLocal>
Given Enter the personalTitle as <personalTitle>
Given Enter the DOB as <DOB>
Given Enter the ProfileTitle as <ProfileTitle>
Given Enter the DepartmentName1 as <DepartmentName1>
Given Enter the AnnualRevenue as <AnnualRevenue>
Given Select the Industry
Given Select the Currency
Given Select the Ownership
Given Enter the No of Employee as <NoofEmployee>
When Click on create Lead Button


Examples:
|url|username|password|Companyname|Firstname1|Lastname1|firstNameLocal|lastNameLocal|personalTitle|DOB|ProfileTitle|DepartmentName1|AnnualRevenue|NoofEmployee|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'CTS'|'Priya'|'Dharshini'|'Sumathi'|'Veenu'|'Testers'|'10/10/2021'|'Manual testing'|'HR'|'1000'|'100'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|'CTS'|'Priya'|'Dharshini'|'Sumathi'|'Veenu'|'Testers'|'10/10/2021'|'Manual testing'|'HR'|'1000'|'700'|

