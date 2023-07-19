
@B29G19-199
Feature: Create a new customer on briteerp
Agile Story:  Sales Manager should be able to create a new customer from "Sales" module



Background: : For all Scenarios User is on Customers page
		Given User is logged in as Sales Manager
		When User click on "Sales" module
		And User clicks on "Customers" field 
		Then User sees "Customers" as briteerp title


	@B29G19-198
	Scenario: User should be able to create a new customer 
		When User click on Create button
		And User enters new customers "Alan Bow" into input box
		And User click Save button
		Then User should see customer's "Alan Bow" displayed