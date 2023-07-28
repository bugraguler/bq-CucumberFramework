Feature: Validation of login scenarios

  Background: #which will execute before every scenario
    # Given user is navigated to HRMS application


  @smoke @sprint12
  Scenario: Admin login
    # Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

    #ess means normal user
  @regression @batch12  @smoke
  Scenario: ESS login
    # Given user is navigated to HRMS application
    When user enters valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in

  @smoke @sprint12
  Scenario: Invalid login
    # Given user is navigated to HRMS application
    When user enters invalid username and password
    And user clicks on login button
    Then user see error message on the screen

