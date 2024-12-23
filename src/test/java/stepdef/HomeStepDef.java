package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class HomeStepDef extends BaseTest{
    HomePage homePage;

    public HomeStepDef(){
        this.homePage = new HomePage(driver);
    }

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
            homePage = new HomePage(driver);
            homePage.validateOnHomePage();
    }


    @And("user add product to cart")
    public void userAddProductToCart() {
        homePage.clickAddToCart();

    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        homePage.assertCartItem(cartItem);
    }

    @And("user remove item from the cart")
    public void userRemoveItemFromTheCart() {
        homePage.removeItem();
    }
}
