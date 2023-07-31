Feature: checking Ecommerce website API

Scenario: logging in to the API

Given user loads the API with the "loginAPIBody"
When user calls the post http method with "loginAPI"
Then user should see the response as 200

Scenario: Adding the product

Given user loads the addproductAPI with the payload
When user calls the post http method with "addProductAPI"
Then user should see the response as 201

Scenario: creating the order

Given user loads the API with the "createOrderApiBody"
When user calls the post http method with "createOrderAPI"
Then user should see the response as 201

Scenario: Deleting the product

When user calls the delete http method with "deleteProductApi"
Then user should see the response as 200
