
@CompleteTest
Feature: Login functionality with invalid credentials
  User story: As POS and eventCRM manager, I should be able to Login with valid credentials


  Scenario: Scenario: login functionality for eventCRM manager testing
    Given Given user user is on the login page of briteerp application
    When user enter a valid eventCRM manager address
    And User type a valid eventCRM manager password
    Then user should be able to see Wrong login/password message



