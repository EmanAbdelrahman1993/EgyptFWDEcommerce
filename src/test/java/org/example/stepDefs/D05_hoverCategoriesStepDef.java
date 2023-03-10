package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    WebElement randomItem = null;
    String title = null;
    P03_homePage home  = new P03_homePage();
    int randomNum = new Random().nextInt(home.categories().size());

    @When("user selects any random category")
    public void chooseRandomCategory() {

        Actions action = new Actions(Hooks.driver);
        do {
            randomItem = home.categories().get(randomNum);
        }while(randomItem.getText() == "");
        action.moveToElement(randomItem).perform();
    }

    @And("user selects any sub-category")
    public void RandomSubCategory() {

        Actions action = new Actions(Hooks.driver);

        if(home.subCategories(randomNum).size() > 0){
            randomItem = home.subCategories(randomNum).get( new Random().nextInt(3) );
            title = randomItem.getText();
            action.moveToElement(randomItem).perform();
            randomItem.click();
        }else{
            title = randomItem.getText();
            randomItem.click();
        }
    }
    @Then("page title should contains category or sub-category name")
    public void assertSucess() {
        Assert.assertTrue( home.pageTitle().getText().toLowerCase().trim().contains( title.toLowerCase().trim() ), "Page title doesn't match selected category");
    }
}
