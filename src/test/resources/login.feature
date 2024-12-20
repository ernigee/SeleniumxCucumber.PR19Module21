@login
  Feature: Login

    @valid-login
    Scenario: login using valid username and valid password
      Given user is on login page
      When user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      Then user is redirected to home page


    @invalid-login
    Scenario: Login using valid username and invalid password
      Given user is on login page
      When user input username with "standard_user"
      And user input password with "general_sauce"
      And user click login button
      Then login page give error message "Epic sadface: Username and password do not match any user in this service"

    @empty-username-login
    Scenario: Login using empty username and password
      Given user is on login page
      When user input username with ""
      And user input password with ""
      And user click login button
      Then login page give error message "Username is required"


    Scenario: Test login web add to cart
      Given open web login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user will see icon cart in homepage
      And user add item to cart
      And user add item to cart
      And user add item to cart
      Then verify cart item is match "3"


    Scenario: Test login web remove to cart
      Given open web login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user will see icon cart in homepage
      And user add item to cart
      And user add item to cart
      And user add item to cart
      And user add item to cart
      Then verify cart item is match "4"
      And user remove item to cart
      And user remove item to cart
      Then verify cart item is match "2"

