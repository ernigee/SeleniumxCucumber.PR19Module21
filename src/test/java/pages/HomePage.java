package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By addToCart1 = By.cssSelector("button#add-to-cart-sauce-labs-back-pack");
//    By addToCart2 = By.cssSelector("button#add-to-cart-sauce-labs-bike-lilght");
//    By addToCart3 = By.cssSelector("button#add-to-cart-sauce-labs-onesie");

//    By iconCartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By cartBadge = By.cssSelector(".shopping_cart_badge");
    By removeItemCart = By.xpath("(//*[text()='Remove'])[1]");

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private WebDriver driver;

    public HomePage(WebDriver driver){this.driver =driver;}

    public void validateOnHomePage(){
        WebElement productElement = driver.findElement(productTitle);
            assertTrue(productElement.isDisplayed());
            assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void clickAddToCart(){
        driver.findElement(addToCart1).click();
    }

    public void assertCartItem(String cartItem){
        String itemExpected = cartItem;
        String itemActual = driver.findElement(cartBadge).getText();
        Assertions.assertEquals(itemActual, itemExpected);
    }

    public void removeItem(){
        driver.findElement(removeItemCart);
    }

}
