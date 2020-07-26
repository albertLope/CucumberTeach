Feature: Country functionality


  Scenario: Create country
    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to country page
    When Create a country
    Then Success message should be displayed

