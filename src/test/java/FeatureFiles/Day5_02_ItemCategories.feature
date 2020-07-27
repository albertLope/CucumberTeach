Feature: Item categories functionality

  @regression
  Scenario Outline: Create Item categories

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Item Categories page
    When Create a Item categories name as "<Item categories name>" integration code as "<Item categories user type>"
    Then Success message should be displayed
    And Delete name in the "second" position the "<Item categories name>"
    Then Success message should be displayed

    Examples:
      | Item categories name | Item categories user type  |
      | name1                | UserTypeOption_TenantAdmin |
      | name2                | UserTypeOption_User        |
      | name3                | UserTypeOption_Guest       |
      | name4                | UserTypeOption_Everyone    |

