package stepdef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeStepDef extends BaseTest{
    HomePage homePage;

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {

        homePage = new HomePage();
        homePage.validateOnHomePage()
//        By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
//        WebElement productElement = driver.findElement(productTitle);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("Sauce Labs Backpack", productElement.getText());

    }

}
