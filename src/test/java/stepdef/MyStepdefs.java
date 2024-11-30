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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStepdefs {

    WebDriver driver;


    By InputPasswordText = By.cssSelector("input#password");
    By clickLoginButton = By.id("login-button");

    @Before
    public void beforeTest(){
        driver = WebDriverManager.chromedriver().create();
    }

    @After
    public void afterTest(){
        driver.close();
        }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
        
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
        By InputUserNameText = By.cssSelector("input#user-name");
        driver.findElement(InputUserNameText).sendKeys(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        By InputPasswordText = By.cssSelector("input#password");
        driver.findElement(InputPasswordText).sendKeys(password);
        
    }

    @And("user click login button")
    public void userClickLoginButton() {
        By clickLoginButton = By.id("login-button");
        driver.findElement(clickLoginButton).click();
        
    }

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
        By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
        
    }

    @Then("login page give error message {string}")
    public void loginPageGiveErrorMessage(String arg0) {
        
    }

    @Then("login page return an error message {string}")
    public void loginPageReturnAnErrorMessage(String arg0) {
    }

    @And("user input wrong password with {string}")
    public void userInputWrongPasswordWith(String wrongPassword) {
    }
}
