#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
Feature: Create company
Background: user is successfully logged in and on home page


@EndToEnd
Scenario: Create Company 
Given user is on the application home page
And user clicks  Company 
And user clicks  Manage Company 
And user clicks New
And user enters "MyCompany" as Company Name
And user enters "Manufacturing" as Company Type
And user enters "Automobile" as Company Subtype
And user enters "Hinjewadi phase1" as Address
And user enters "7218710933" as Phone
And user enters "samiksha@gmail.com" as Email
And user enters "HRGH34565H" as Pan Details
And User enters "4565768697" as Tin Details
And user enters "6756444498" as Mobile
And user enters "mycompany.com" as WebSite
And user enters "IN" as Country
And user enters "MAHARASHTRA" as State
And user enters "PUNE" as City
And user enters "2345" as Total Employee
And user clicks on Save
Then user can see Company is Created 
