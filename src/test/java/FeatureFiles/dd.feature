Feature: Entrance Student functionality

  @regression
  Scenario: Create Student categories

#    Given Navigate to basqar
#    And Enter the username and password click on login button
#    Then User should be able to login successfully
    And Clicks in the "CountryPage" form
      | Student  |
      | Students |

    And Click on add button
    And Send the keys in the new exam form
      | firstName      | Techno      |
      | lastName       | Study       |
      | middleName     | A           |
      | documentNumber | 86579812358 |

    And Clicks in the "formPages" form
      | gender                    |
      | Option1                   |
      | Grade_Level               |
      | Option3                   |
      | SchoolDepartment          |
      | Option2                   |
      | Section                   |
      | Option1                   |
      | Citizenship               |
      | Option1                   |
      | Nationality               |
      | Option1                   |
      | Document_Type             |
      | Option1                   |
      | Representatives           |
      | plusIconAddRepresentative |
      | RepresentativeDropdown    |
      | Option1                   |

    And Send the keys in the new exam form
      | PopUpFirstName | TechnoParentFirst |
      | PopUplastName  | TechnoParentLast  |
      | contactInfo    | 89587465895       |

    And Clicks in the new exam form
      | AddButtonPopUp  |
      | SaveButton      |
      | entryType       |
      | Option2         |
      | SaveButtonPopUp |

    Then Success message should be displayed
    And Navigate to Students page
    When Delete name in the "third" position the "Techno A Study"
    Then Success message should be displayed

