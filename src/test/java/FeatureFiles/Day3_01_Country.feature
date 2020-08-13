Feature: Country functionality

# Difference between today and day 2 is send the data from this page to step definition


  @regression
  Scenario: Create country
    And Navigate to country page
    When Create a country name is "AliCountry1" code is "1234"
    Then Success message should be displayed

  @regression
  Scenario: Edit country
    And Navigate to country page
    And Click on the edit button for position "second" name "AliCountry1"
    And Edit the name as "Techno country"
    Then Success message should be displayed

  @regression
  Scenario: Delete country
    And Navigate to country page
    And Delete name in the "second" position the "Techno country"
    Then Success message should be displayed

