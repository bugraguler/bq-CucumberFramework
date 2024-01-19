Feature:US-12345 Search an employee in HRMS

  Background:
    # Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    And user navigates to employee list page

  @smoke @regression @sanity
  Scenario: Search an employee by id
    # Given user is navigated to HRMS application
    # When user enters valid admin credentials
    # And user clicks on login button
    # And user navigates to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information

  # this comment sign
  # given when then yerine * kullanabiliriz. hepsinin yerine..


  @regression @batch12
  Scenario: Search an employee by name
    # Given user is navigated to HRMS application
    # When user enters valid admin credentials
    # And user clicks on login button
    # And user navigates to employee list page
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information