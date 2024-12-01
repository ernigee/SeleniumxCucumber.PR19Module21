package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef extends BaseTest {

    protected LoginPage loginPage;

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
        assertTrue(driver.getPageSource().contains(errorMessage));
        
    }

    @Then("login page return an error message {string}")
    public void loginPageReturnAnErrorMessage(String arg0) {
    }

    @And("user input wrong password with {string}")
    public void userInputWrongPasswordWith(String wrongPassword) {
    }
}
