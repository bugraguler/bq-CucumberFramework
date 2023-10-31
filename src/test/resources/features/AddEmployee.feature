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
    And user enters "Dalilo" "Maroon" and "Fidel"
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

  @e2eTest1DBTest
  Scenario: Adding one employee using cucumber feature file
    And user enters "Buray" " Koray" and "Tanay"
    And user grabs the employee id
    And user clicks on save button
    And user query the database for same employee id
    Then user verifies the results