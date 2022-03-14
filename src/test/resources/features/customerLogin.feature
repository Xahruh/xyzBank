Feature:  customer login

  as a bank user, customer should be able to login to bank


  Scenario: customer login with valid account
    Given user is on login page
    And login with first customer username
    Then verify user logged in successfully