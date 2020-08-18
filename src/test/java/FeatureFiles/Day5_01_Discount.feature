Feature: Discount functionality

  @regression
  Scenario Outline: Create Discount


    And Navigate to Discount page
    When Create a Discount name as "<Discount name>" integration code as "<integration_code>" Priority as "<priority>"
    Then Success message should be displayed
    And Delete name in the "second" position the "<Discount name>"
    Then Success message should be displayed

    Examples:
      | Discount name | integration_code | priority |
      | name1         | code1            | 1        |
      | name2         | code2            | 1        |
      | name3         | code3            | 1        |
