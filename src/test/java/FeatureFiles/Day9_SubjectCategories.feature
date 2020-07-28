Feature: Subject Categories functionality

  Scenario: Subject Categories

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Subject Categories page
#    Country also has the name and code so we can use same code
    When Create a country name is "Subject name1" code is "Subject code1"
    Then Success message should be displayed


  Scenario: Edit Subject Categories
    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Subject Categories page
    And Click on the edit button for position "second" name "Subject name1"
    And Edit the name as "Techno subject"
    Then Success message should be displayed


  Scenario: Delete Subject Categories
    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Subject Categories page
    And Delete name in the "second" position the "Techno subject"
    Then Success message should be displayed

  Scenario: Create a subject categories then create Subject for the subject categories

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Subject Categories page
#    Country also has the name and code so we can use same code
    When Create a country name is "Subject name1" code is "Subject code1"
    Then Success message should be displayed
    And Navigate to Subjects
    When Create a subjects name is "Subject name1" code is "Subject code1" Subject Category is "Subject name1"
    Then Success message should be displayed



