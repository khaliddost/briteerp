@B29G19-189
	@wip


Feature: New product features

User Story: As a PosManager, I should be able to add new products to inventory

	Background: For all scenarios User is on the Products page of the briteerp application
		Given the User logged in as "pos manager"
		Then User clicks Inventory module
		And User clicks Products page

	@B29G19-187
	Scenario: Verify user can create a new product by filling only the Product Name input box 
		When User clicks Create button
		And User adds only "Product By Hanna"
		And User clicks Save button
		Then User sees "Product By Hanna" is displayed