Feature: open cart Longin Feature

Scenario: Valiedet longin page  is working
    
    Given  user is on longin page
    When  user enter the vaild deatils in "Email:jacknjan02@gmail.com" and "Password:01234"
    And  user click longin buttan
    Then  user able to see home page

