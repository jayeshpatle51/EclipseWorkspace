Feature: Creating a Product

  Scenario: Adding a Product into a Page
    Given user adds the product using "Payload"
    When user calls "Post" http request method
    Then user should see response code as 201

 
  Scenario: Place the Order
    Given user adds the product using "Payload"
    When user calls "Post" http request method
    #    And user clicks on add to cart
#    Then user should see message as "Order Placed Successfully"
