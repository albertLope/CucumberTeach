Feature: Citizenship functionality

  @regression  @SmokeTest
  Scenario: Create Citizenship

    And Navigate to Citizenship page
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Success message should be displayed

  @regression  @SmokeTest
  Scenario: Edit Citizenship

    And Navigate to Citizenship page
    And Click on the edit button for position "second" name "Techno studydish"
    And Edit the name as "Alish"
    Then Success message should be displayed

  @regression  @SmokeTest
  Scenario: Delete Citizenship

    And Navigate to Citizenship page
    And Delete name in the "second" position the "Alish"
    Then Success message should be displayed

  @regression  @SmokeTest
  Scenario: Negative scenario Citizenship

    And Navigate to Citizenship page
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Success message should be displayed
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Error message should be displayed
    And Click on close button
    And Delete name in the "second" position the "Techno studydish"
    Then Success message should be displayed

