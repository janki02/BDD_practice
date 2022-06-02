Feature: open cart ordere page feature
In order i want to check my order detaisl 
i want to specify the feature of order details page

Background:
Given  user is on opencart page
    When  user enter the  deatils in "username" and "Password"
    And  user click sign-in buttan
    And  user navigates to order page
    Then user able to see order page


@Smoke
Scenario: Valiedet orderpage  is working
    
    When user clicks on Order link
    Then user checks the previoud detials
    
    @Regression
Scenario: check order page feature
    
    When user clicks on feature   Order  link
    Then user checks the all feature 
    
Scenario: Check Cancelled order details
    
    When user clicks on Cancelled Order link
    Then user checks the Cancelled order detials
    