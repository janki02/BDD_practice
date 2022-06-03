Feature: User Facebook lognin feature

Scenario Outline: validet faceboook login page
    
    Given  user is on Facebook login page
    When  user clicks on sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in paswoord field
    And user clicks sign in button
    Then user gets login failed error massage 
    
    Examples:
    |UserName     |Password         |
    |janki        |123456           |
    |jatin        |incorrectpassword|
   