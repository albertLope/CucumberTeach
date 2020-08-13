Feature: Enter the countries

  Background:
    Given GO to website
    And Enter the username and password
    When Submit button should be clicked
    And Navigate to countries page

  Scenario: Enter the countries
    When I create a countries
    Then Country should be created

  Scenario: Edit
    When I edit a countries
    Then Country should be created

  Scenario: Enter the countries
    When Delete a countries
    Then Country should be created

