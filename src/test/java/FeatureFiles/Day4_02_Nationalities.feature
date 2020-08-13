Feature: Nationalities functionality

  @regression @SmokeTest
  Scenario: Create Nationalities

    And Navigate to Nationalities page
    When Create a Nationalities name as "Techno studydish"
    Then Success message should be displayed

  @regression @SmokeTest
  Scenario: Edit Nationalities

    And Navigate to Nationalities page
    And Click on the edit button for position "second" name "Techno studydish"
    And Edit the name as "Alish"
    Then Success message should be displayed

  @regression @SmokeTest
  Scenario: Delete Nationalities

    And Navigate to Nationalities page
    And Delete name in the "second" position the "Alish"
    Then Success message should be displayed

  @regression
  Scenario: Extra Nationalities

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Nationalities page
    When Create a Nationalities name as "Techno studydish"
    Then Success message should be displayed
    And Click on the edit button for position "second" name "TechnoEdittedNation"
    Then Success message should be displayed
    When Create a Nationalities name as "Techno studydish"
    And Click on the edit button for position "second" name "TechnoEdittedNation"
    Then Error message should be displayed
    And Click on close button
    And Delete name in the "second" position the "TechnoEdittedNation"


