package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;


public class LoginStepDef extends BaseTest {

    protected LoginPage loginPage;

    public LoginStepDef(){
        getDriver();
        this.loginPage= new LoginPage(driver);
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
       loginPage = new LoginPage(driver);
       loginPage.goToLoginPage();
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
       loginPage.inputUserName(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
        
    }

    @Then("login page give error message {string}")
    public void loginPageGiveErrorMessage(String errorMessage) {
        loginPage.validateErrorMessage(errorMessage);
    }

}
