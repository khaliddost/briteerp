Feature: Login functionality with valid credentials
  User story: As POS and eventCRM manager, I should be able to Login with valid credentials


  Background: Given user user is on the login page of briteerp application



  Scenario: login functionality for POS testing
    When user enter a valid POS email address
    And User type a valid POS password
    Then user should be able to see #Inbox - Odoo



    Scenario: Scenario: login functionality for eventCRM manager testing
      When user enter a valid eventCRM manager address
      And User type a valid eventCRM manager password
      Then user should be able to see Odoo














