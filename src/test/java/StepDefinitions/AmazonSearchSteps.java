package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import utils.Constants;
import utils.ElementFetch;

import java.awt.*;
import java.io.File;
import java.time.Duration;

public class AmazonSearchSteps {

    public static WebDriver driver = null;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("^browser is open$")
    public void browser_is_open(){
        System.out.println("Inside step- browser is open.");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @And("^user is on amazon search page$")
    public void user_is_on_amazon_search_page(){
        System.out.println("Inside step- user is on amazon search page.");
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @When("^user enters Tables on search$")
    public void user_enters_data1(){
        System.out.println("Inside step- user enters data1.");
        ElementFetch.getWebElement("ID", Constants.searchBox).sendKeys(Constants.data1);
    }

    @When("^user enters Books on search$")
    public void user_enters_data2(){
        System.out.println("Inside step- user enters data2.");
        ElementFetch.getWebElement("ID", Constants.searchBox).sendKeys(Constants.data2);
    }
    @When("^user enters Chairs on search$")
    public void user_enters_data3(){
        System.out.println("Inside step- user enters data3.");
        ElementFetch.getWebElement("ID", Constants.searchBox).sendKeys(Constants.data3);
    }

    @When("^user enters Clothes on search$")
    public void user_enters_data4(){
        System.out.println("Inside step- user enters data4.");
        ElementFetch.getWebElement("ID", Constants.searchBox).sendKeys(Constants.data4);
    }

    @And("^user clicks on search button$")
    public void user_clicks_on_search(){
        System.out.println("Inside step- user clicks on search.");
        ElementFetch.getWebElement("ID", Constants.amazonSearch).click();
    }

    @Then("^user is navigated to correct search options$")
    public void user_is_navigated_to_correct_search_options(){
        System.out.println("Inside step- user is navigated to correct search options.");
        Assert.assertTrue(ElementFetch.getWebElement("XPATH", Constants.firstPage).isDisplayed());
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }


}
