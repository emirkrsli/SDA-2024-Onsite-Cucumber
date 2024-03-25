package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonStepDef {
    WebDriver driver;
    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {
        driver.get("https://www.google.com");
    }
    @When("I search for amazon on google")
    public void i_search_for_amazon_on_google() {
        driver.findElement(By.name("q")).sendKeys("amazon" + Keys.ENTER);
    }

    @When("I search for {string} on google")
    public void i_search_for_on_google(String searchInput) {
        driver.findElement(By.name("q")).sendKeys(searchInput + Keys.ENTER);
    }

    @Then("I should see amazon on the results")
    public void i_should_see_amazon_on_the_results() {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'amazon')]")).isEmpty());
    }

    @Then("I should see {string} on the results")
    public void i_should_see_on_the_results(String string) {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'"+string+"')]")).isEmpty());
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();
    }

    @Then("I assert something")
    public void i_assert_something() {
        Assert.assertTrue(true);
    }

}
