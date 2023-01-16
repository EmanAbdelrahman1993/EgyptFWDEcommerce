package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.List;

public class D08_WishlistStepDef {
    P03_homePage home = new P03_homePage();
    @When("user clicks add to wishlist button at the selected product")
    public void addToWishlist() {
        home.wishlistButton().click();
    }

    @Then("product added to wishlist")
    public void successAssertion() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(home.wishlistSuccessMessage().getText().contains("The product has been added to your"));
        WebElement parent = (WebElement) ((JavascriptExecutor) Hooks.driver).executeScript("return arguments[0].parentNode;", home.wishlistSuccessMessage());
        soft.assertEquals(parent.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }

    @And("wait until this success message with green color to disappears")
    public void waitForMessageToDisappear() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(home.wishlistSuccessMessageS()));
    }

    @And("user click on \"Wishlist\" Tab on the top of the page")
    public void openWishlist() {
        home.wishlist().click();
    }

    @Then("verify product quantity in wishlist greater than 0")
    public void itemAdded() {
        List<WebElement> products = home.getProducts();
        Assert.assertTrue(Integer.parseInt(home.productQuantity(products.get(0)).getAttribute("value")) > 0);
    }
}
