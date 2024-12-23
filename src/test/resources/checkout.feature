@checkout
  Feature: Checkout

    @add-cart-checkout
  Scenario : Test Login and add product to cart
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    Then user is redirected to home page
    And user add product to cart
    And user add product to cart
    And user add product to cart
    Then verify cart item is match "3"

    @remove-cart-checkout
  Scenario:  Remove product from the cart
      Given user is on login page
      When user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      Then user is redirected to home page
      And user add product to cart
      And user add product to cart
      And user add product to cart
      Then verify cart item is match "3"
      And user remove item from the cart
      Then verify cart item is match "2"
