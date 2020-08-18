Feature: Entrance Student part 2 functionality

  @regression
  Scenario Outline: Create Student part 2 categories


    And Navigate to Students page
    And Click on add button
    And Send the keys in the new exam form
      | firstName      | <FirstNameOfStudent>  |
      | lastName       | <LastNameOfStudent>   |
      | middleName     | <MiddleNameOfStudent> |
      | documentNumber | <DocNumOfStudent>     |

    And Clicks in the new exam form
      | gender                         |
      | <genderOption>                 |
      | Grade_Level                    |
      | <GradeLevelOption>             |
      | SchoolDepartment               |
      | <SchoolDepartmentOption>       |
      | Section                        |
      | <SectionOption>                |
      | Citizenship                    |
      | <CitizenshipOption>            |
      | Nationality                    |
      | <NationalityOption>            |
      | Document_Type                  |
      | <Document_TypeOption>          |
      | Representatives                |
      | plusIconAddRepresentative      |
      | RepresentativeDropdown         |
      | <RepresentativeDropdownOption> |

    And Send the keys in the new exam form
      | PopUpFirstName | <TechnoParentFirst> |
      | PopUplastName  | <TechnoParentLast>  |
      | contactInfo    | <ContactInfo>       |

    And Clicks in the new exam form
      | AddButtonPopUp  |
      | SaveButton      |
      | entryType       |
      | Option2         |
      | SaveButtonPopUp |


    Then Success message should be displayed
    And Navigate to Students page
    When Delete name in the "third" position the "<FullName>"
    Then Success message should be displayed

    Examples:
      | FirstNameOfStudent | LastNameOfStudent | MiddleNameOfStudent | FullName       | DocNumOfStudent | genderOption | GradeLevelOption | SchoolDepartmentOption | SectionOption | CitizenshipOption | NationalityOption | Document_TypeOption | RepresentativeDropdownOption | TechnoParentFirst | TechnoParentLast | ContactInfo |
      | Techno             | Study             | A                   | Techno A Study | 8625894984      | Option1      | Option1          | Option1                | Option1       | Option1           | Option1           | Option1             | Option1                      | TparentFirst      | Tparentlast      | 86284528952 |
      | Techno             | Study             | A                   | Techno A Study | 8625894984      | Option2      | Option2          | Option2                | Option2       | Option2           | Option2           | Option2             | Option2                      | TparentFirst      | Tparentlast      | 86284528952 |


