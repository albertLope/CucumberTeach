Feature: Fees functionality

  @regression
  Scenario: Create Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    When Create a Fees name as "Techno studydish" code as "12345" integration code as "12" Priority as "7"
    Then Success message should be displayed

  @regression @SmokeTest1
  Scenario: Edit Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    And Click on the edit button for position "second" name "Techno studydish"
    And Edit the name as "Alish"
    Then Success message should be displayed

  @regression @SmokeTest2
  Scenario: Delete Fees

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Fees page
    And Delete name in the "second" position the "Alish"
    Then Success message should be displayed


#  Scenario Outline: asdasd
#
#    Given Navigate to basqar
#    When Enter the username and password and click on login button
#    Then User should login successfully
#    And Navigate to Fees page
#    When User create a country name as "<FeesName1>" code as "<Code1>" integration code as "<Integration1>" priority as "<Priority1>"
#    When User edit the "<FeesName1>" to "<FeesNameedit>"
#    Then Success message should be displayed
#    When User create a country name as "<FeesName1>" code as "<Code2>" integration code as "<Integration2>" priority as "<Priority2>"
#    When User edit the "<FeesName1>" to "<FeesNameedit>"
#    Then Error message should be displayed
#    And Click on close button
#    When User delete the "<FeesName1>"
#    Then Success message should be displayed
#    When User delete the "<FeesNameedit>"
#    Then Success message should be displayed
#    Examples:
#      | FeesName1 | Code1 | Integration1 | Priority1 | FeesNameedit  |Code2|Integration2|Priority2|
#      | FeesAli   | Code1 | 10           | 10        | FeesAliEdited |Code2|11          |12       |
#      | FeesAli   | Code2 | 11           | 11        | FeesAliEdited |Code2|11          |12       |
