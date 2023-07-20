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


  @B29G19-188
  Scenario Outline: Verify when clicking any product and then clicking the edit button all the boxes entered information can be editable again.
    When User clicks "Book"
    And User clicks Edit button
    And User enters "<Product name>"
    And User selects Product Type "Service"
    And User selects Category Type "All/Artistic"
    And User enters the "<Internal Reference>"
    And User enters new "<Barcode>"
    And User fills "<Sales Price>"
    And User adds "<Cost>"

    Examples: value I am going to enter in this scenario outlines

      | Product name | Internal Reference | Barcode | Sales Price | Cost |
      | New Book     | R12                | 12345   | 15       | 25   |