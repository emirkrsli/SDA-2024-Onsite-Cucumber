package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class EbayStepDef {

    @Given("the user navigates to the Ebay homepage")
    public void the_user_navigates_to_the_amazon_homepage() {
        Driver.getDriver().get("https://www.ebay.com/");
    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String string) {

        Driver.getDriver().findElement(By.id("gh-ac")).sendKeys(string + Keys.ENTER);
    }
    @Then("the user verifies that the search results contain {string}")
    public void the_user_verifies_that_the_search_results_contain(String string) {
        List<WebElement> searchResults = Driver.getDriver().findElements(By.xpath("//div[@id = 'srp-river-results']//ul//li//*[contains(text(),'"+string+"')]"));
        Assert.assertFalse(searchResults.isEmpty());


    }

}
