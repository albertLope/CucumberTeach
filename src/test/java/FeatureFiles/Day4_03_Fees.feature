Feature: Fees functionality

  @regression
  Scenario: Create Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    When Create a Fees name as "Techno studydish" code as "12345" integration code as "12" Priority as "7"
    Then Success message should be displayed

  @regression
  Scenario: Edit Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    And Click on the edit button for position "second" name "Techno studydish"
    And Edit the name as "Alish"
    Then Success message should be displayed

  @regression
  Scenario: Delete Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    And Delete name in the "second" position the "Alish"
    Then Success message should be displayed


