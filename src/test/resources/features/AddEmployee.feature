Feature: Adding the employees in HRMS Application

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @regression @denemeadd
  Scenario: Adding one employee from feature file
    #Given user is navigated to HRMS application
    #When user enters valid admin credentials
    #And user clicks on login button
    #Then admin user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on add employee option
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully


  Scenario: Adding one employee using cucumber feature file
    And user enters "dalilo" " mırra" and "velo"
    And user clicks on save button
    Then employee added successfully

  @test @test123
  Scenario Outline: Adding multiple employees
    And user provides "<firstName>" "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully
    Examples:
      | firstName | middleName | lastName |
      | asel      | MS         | toli     |
      | yaren     | fero       | sebo     |
      | marta     | koli       | tilly    |

  @test @datatabletest
  Scenario: Add employee using data table
    When user provides multiple employee data and verify they are added
      | firstName | middleName | lastName |
      | asel      | MS         | toli     |
      | yaren     | fero       | sebo     |
      | marta     | koli       | tilly    |
      | zippo     | topal      | jolly    |

    @excel
    Scenario: Adding multiple employees from excel file
      When user adds multiple employees from excel file using "EmployeeData" sheet and verify the user added
