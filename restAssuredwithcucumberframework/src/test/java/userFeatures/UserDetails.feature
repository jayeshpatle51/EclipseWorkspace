
Feature: Creation of New User
 
 Create New User in with All details

 
  Scenario: Crete new User
    Given user Provide the userdetails using "Payload"
       
   When user calls "Post" http request method
   Then user should see response code as 201
   