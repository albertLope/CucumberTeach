Feature: Entrance Exam functionality

  @regression
  Scenario: Create entrance exam categories

    Given Navigate to basqar
    And Enter the username and password click on login button
    Then User should be able to login successfully
    And Navigate to Entrance exam page
    And Click on add button
    And Send the keys in the new exam form
      | nameInput | ExamOne |

    And Clicks in the new exam form
      | Academic_Period  |
      | Option_2019_2020 |
      | Grade_Level      |
      | Option1          |
      | DocumentType     |
      | Option1          |
      | AddButton        |
      | DocumentType     |
      | Option2          |
      | AddButton        |
      | DocumentType     |
      | Option3          |
      | AddButton        |
      | SaveButton       |

    Then Success message should be displayed
    And Navigate to Entrance exam page
    When Delete name in the "second" position the "ExamOne"
    Then Success message should be displayed
