@calendar
Feature: Calendar Event Creation Feature

  Background: For all scenarios user is logged into application
    Given user is logged in and on the calendar page of the application

  @newEventCreation
  Scenario: User can create event by clicking on time box
    When user clicks on timebox for "All day" on "sun"
    And user enters information in "summary" section of pop-up window
    And user clicks "Create"
    Then user should see event created in that time box

  @eventDetails
  Scenario: User can see event details when clicking the event on the calend
    When user clicks on event in timebox
    Then user should see pop-up window with event details
