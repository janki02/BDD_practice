Feature: Billing amount feature
 
    Scenario Outline: billing amount
    
    Given  user is on billing page
    When  user enters billing amount "<billingamount>"
    When   user enters txt amount "<txtamount>"
    And user clicks checkout button
    Then it should be gives the tottal amount"<tottalamount>"
    
    Examples:
    |billingamount|txtamount |tottalamount |
    |1000        |10        |1010         |
    |500         |20        |520          |
    |100         |5.5       |105.5        |