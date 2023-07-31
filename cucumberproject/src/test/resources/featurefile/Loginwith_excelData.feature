
@tag
Feature: This is Login feature
 This is Ebanking login page
  
  
  @tag1
  Scenario Outline: Login Page
    Given I have given a "https://demo.guru99.com/V4/"
    And   To Provide login Data from given "<sheetname>" and <rownumber>
               
    When I click the login button
    Then I should able to see User dashBoard
    When I click on logout button
    Then I should see login page

 Examples:
 |sheetname|rownumber|
 |LoginData|0|
 |LoginData|1|
 
 