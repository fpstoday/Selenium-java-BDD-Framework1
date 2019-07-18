Feature: Depends on Method Steps

  Scenario: app shopping steps
    Given User has logged on
    And User clicks on serach page
    And User clicks on advanced search page
    When User places products
    And User clicks on check out
    And   User buys products
    Then User gets product purchase confirmation, payment successful
    And User logs out

 