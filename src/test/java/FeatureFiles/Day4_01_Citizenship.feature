Feature: Citizenship functionality

  @regression @SmokeTest
  Scenario: Create Citizenship

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Citizenship page
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Success message should be displayed

  @regression @SmokeTest
  Scenario: Edit Citizenship

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Citizenship page
    And Click on the edit button for position "second" name "Techno studydish"
    And Edit the name as "Alish"
    Then Success message should be displayed

  @regression  @SmokeTest
  Scenario: Delete Citizenship
    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Citizenship page
    And Delete name in the "second" position the "Alish"
    Then Success message should be displayed

  @regression  @SmokeTest
  Scenario: Negative scenario Citizenship
    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Citizenship page
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Success message should be displayed
    When Create a Citizenship name as "Techno studydish" shortname as "Ts"
    Then Error message should be displayed
    And Click on close button
    And Delete name in the "second" position the "Techno studydish"
    Then Success message should be displayed

