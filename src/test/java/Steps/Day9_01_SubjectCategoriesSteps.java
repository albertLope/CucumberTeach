package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import Utilities.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_01_SubjectCategoriesSteps {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Subject Categories page$")
    public void navigate_to_Subject_Categories_page()  {

        leftNav.findTheElementFromThePageAndClick("Education");
        leftNav.findTheElementFromThePageAndClick("SetupUnderTheInventory");
        leftNav.findTheElementFromThePageAndClick("Subject_Categories");

    }


    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to(String elementName){

        leftNav.findTheElementFromThePageAndClick(elementName);

    }

    @When("^Create a subjects name is \"([^\"]*)\" code is \"([^\"]*)\" Subject Category is \"([^\"]*)\"$")
    public void create_a_subjects_name_is_code_is_Subject_Category_is(String name, String code, String subjectName){

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , name);
        countryPage.findTheElementFromThePageAndSendKeys("codeInput" , code);
        countryPage.findTheElementFromThePageAndClick("Subject_Category_dropdown");
        countryPage.FindTheListAndClickOnExpectedElement( "DropdownOptionsList", subjectName);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }

    @Then("^Navigate commands \"([^\"]*)\" , url should contain \"([^\"]*)\"$")
    public void navigate_commands_url_should_contain(String whichCommand, String WhichTextUrlShouldContain){

        WebDriver driver = DriverClass.getDriver();

        switch (whichCommand){

            case "back":
                driver.navigate().back();
                break;
            case "forward":
                driver.navigate().forward();
                break;
            case "refresh":
                driver.navigate().refresh();
                break;
        }

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.urlContains(WhichTextUrlShouldContain));

    }
}
