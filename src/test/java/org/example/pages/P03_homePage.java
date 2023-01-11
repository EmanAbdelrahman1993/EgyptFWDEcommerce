package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P03_homePage {

    // EuroCurrency Selection //
    public WebElement homePageLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/\"]"));
    }
    public WebElement currencyList()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> productImage()
    {
        return Hooks.driver.findElements(By.className("product-item"));
    }
    public WebElement productPrice(WebElement product)
    {
        return product.findElement(By.className("price"));
    }

    //Search Functions
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public List<WebElement> products() {
        return Hooks.driver.findElements(By.className("product-item"));
    }
    public WebElement productTitle(WebElement product) {
        return product.findElement(By.cssSelector("h2[class=\"product-title\"] > a"));
    }
    public WebElement getSKU() {
        return Hooks.driver.findElement(By.cssSelector(" div[class=\"sku\"] > span[class=\"value\"]"));
    }

    //HoverOver Functions
    public List<WebElement> categories()
    {
        return Hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
    }
    public WebElement pageTitle() {
        return Hooks.driver.findElement(By.tagName("h1"));
    }
    public List<WebElement> subCategories(int num)
    {
        String locator = "(//ul[@class='top-menu notmobile']/li/a)["+(num+1)+"]/following-sibling::ul//a";
        return Hooks.driver.findElements(By.xpath(locator));
    }
     //homeSliders Feature
     public WebElement Nokia()
     {
         return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
     }

    public WebElement IPhone()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }

    //FollowUs Functions
    public WebElement facebookIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rssIcon()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtubeIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    //Wish List Functions
    public WebElement wishlistButton()
    {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]")).findElement(By.className("add-to-wishlist-button"));
    }
    public WebElement wishlistSuccessMessage()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
    }

    public By wishlistSuccessMessageS()
    {
        return By.cssSelector("p[class=\"content\"]");
    }

    public WebElement wishlist()
    {
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }

    public List<WebElement> getProducts() {
        return Hooks.driver.findElements(By.cssSelector(" table[class=\"cart\"] > tbody > tr"));
    }

    public WebElement productQuantity(WebElement product){
        return product.findElement(By.className("qty-input"));
    }
}
