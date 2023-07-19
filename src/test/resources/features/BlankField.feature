Feature: As POS and eventCRM manager, I should be able to Login with valid credentials



  Scenario: Verify that the user gets the "Please fill out this field." message for at least one blank field
    Given Given user user is on the login page of briteerp webpage
    When User enter an email address and leaves the password input box blank
    And Click login button
    Then User should be able to see the "Please fill out this field." message for at least one blank field




