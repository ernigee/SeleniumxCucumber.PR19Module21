package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    WebDriver driver;

    By userNameInputText = By.cssSelector("input#user-name");
    By PasswordInputText = By.cssSelector("input#password");
    By clickLoginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://saucedemo.com/");
    }

    public void inputUserName(String username){
        driver.findElement(userNameInputText).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(PasswordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(clickLoginButton).click();
    }

    public void validateErrorMessage(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
