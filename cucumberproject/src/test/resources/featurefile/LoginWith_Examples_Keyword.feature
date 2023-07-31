
@tag
Feature: This is Login feature
  
   This is Ebanking login page
  @tag1
  Scenario Outline: Login Page
    Given I have given a "url"
    And   Provided "<username>" and "<password>"
               
    When I click the login button
    Then I should able to see User dashBoard
    When I click on logout button
    Then I should see login page

 Examples:
 |username|password|
 |mngr458559|emamEhy|
 |mngr458559|emamEhy|
 |mngr458|elghos|
 |sghsofw|slghoe|
 