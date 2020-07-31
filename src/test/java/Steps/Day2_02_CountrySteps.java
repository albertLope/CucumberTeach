package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import Utilities.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_02_CountrySteps {

    /*
        In this class driver will fail because we are not using the same webdriver. If we create the new one then
            it will open new chrome this is why we need to use singleton driver.

     */

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    private WebDriver driver;

    @And("^Navigate to country page$")
    public void navigate_to_country_page() throws InterruptedException {

        driver = DriverClass.getDriver();

        leftNav.findTheElementFromThePageAndClick("setupOne");
        leftNav.findTheElementFromThePageAndClick("Parameters");
        leftNav.findTheElementFromThePageAndClick("Country");

    }

    @When("^Create a country$")
    public void create_a_country() throws InterruptedException {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , "AliCountry");
        countryPage.findTheElementFromThePageAndSendKeys("codeInput" , "1234");
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }

    @Then("^Success message should be displayed$")
    public void country_should_be_created_successfully() {

        countryPage.verifyElementContainTheText("successMessage","success");

    }

    @Then("^Error message should be displayed$")
    public void error_message_should_be_displayed() {
        countryPage.verifyElementContainTheText("ErrorMessage","Error");
    }

    @And("^Click on close button$")
    public void click_on_close_button() {
        countryPage.findTheElementFromThePageAndClick("closeButton");

    }



}
