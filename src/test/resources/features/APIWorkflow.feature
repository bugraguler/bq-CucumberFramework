Feature: This feature covers all the API related scenario

  Background:
    Given a JWT is generated

  @api
  Scenario: Adding an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for the created employee is 201
    And the employee created contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as a global variable to be used for other calls


  @api
  Scenario: Get the newly created employee
    Given a request is prepared to get an employee
    When a GET call is made to retrieve the created employee
    Then the status call for this employee is 200

  @api
  Scenario: 