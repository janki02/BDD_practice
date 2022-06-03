Feature: User Registation

Scenario: user Registation with different data

    
    Given  user is on registation page
    When  user enters to following deatils
    |janki |patel |1234 |bharuch |
    |jatin |patel |12345 |usa |
    |chirag |patel |1233 |surat |
    Then  user registation should be successful
    
Scenario: user Registation with different data with colums

    
    Given  user is on registation page
    When  user enters to following deatils with columns
    |Firstname|lastname|phone|city|
    |janki |patel |1234 |bharuch |
    |jatin |patel |12345 |usa |
    |chirag |patel |1233 |surat |
    Then  user registation should be successful
    
    