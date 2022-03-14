Feature: manage accounts

  as a manager, manager should be able to add customer


  Scenario: manager add customer
    Given user is on login page
    And login as manager
    And create a customer with following data
      | firstname | lastname | post code |
      | polat     | palta    | 23131     |
    Then verify new customer is added