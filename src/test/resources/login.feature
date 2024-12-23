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





