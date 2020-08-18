Feature: Automation Practice login

#  This should teach in the day 3 of the Apache POI.

  @Apache
  Scenario: Login to functionality

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    When Create a Fees name

