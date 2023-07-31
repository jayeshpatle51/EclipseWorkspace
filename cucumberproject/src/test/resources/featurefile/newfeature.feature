@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login Page
   #Given I have given a "https://demo.guru99.com/V4/"
    Given   Provided username and password
          |mngr458559|emamEhy|
       
    When I click the login button
    Then I should able to see User dashBoard
    When I click on logout button
    Then I should see login page