Feature: manager login

  application should let manager login



  Scenario: manager should able to login
    Given user is on login page
    And login as manager
    Then verify manager logged in successfully