package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;


public class HomeStepDef extends BaseTest{
    HomePage homePage;

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
            homePage = new HomePage(driver);
            homePage.validateOnHomePage();

    }

    @Given("open web login page")
    public void openWebLoginPage() {
        homePage.();
    }
}
