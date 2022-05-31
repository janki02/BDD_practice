Feature: open cart Longin Feature

Scenario: Valied longin page working
    
    Given  Browser is open
    And  user is on longin page
    When  user enter the vaild deatils in "Email" and "Password"
    And  user click longin buttan
    Then  user able to see home page

