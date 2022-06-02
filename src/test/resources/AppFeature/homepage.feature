

@All
Feature: open cart homepage Feature

@Smoke @US-001
Scenario: homepage
    
    Given  user is on homepage
    When  user select desktop 
    And  user click desktop buttan
    Then  user able to see desktop page
    
@Regression
Scenario: desktop  for tablet
    
    Given  user is on desktop page
    When  user select tablets 
    Then  user click tablets buttan
    And  user able to see tablets page
    Then user select the "Apple Tablet" and price is 150 USD
    
@Prod
Scenario: desktop for camera
    
    Given  user is on desktop page for camera
    When  user select camera
    Then  user click camera buttan
    And  user able to see camera page
    Then user select the "Sony camera" and price is 200 USD

