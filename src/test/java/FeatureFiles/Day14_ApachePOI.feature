Feature: Release Notes

#  This should teach in the day 3 of the Apache POI.

  @Apache
  Scenario: Verify release notes as expected

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to ReleaseNotes page
    And Verify release notes as expected


