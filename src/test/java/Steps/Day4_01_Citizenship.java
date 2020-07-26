package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day4_01_Citizenship {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Citizenship page$")
    public void navigate_to_city_page() {

        leftNav.findTheElementFromThePageAndClick("setupOne");
        leftNav.findTheElementFromThePageAndClick("Parameters");
        leftNav.findTheElementFromThePageAndClick("Citizenships");

    }


    @When("^Create a Citizenship name as \"([^\"]*)\" shortname as \"([^\"]*)\"$")
    public void create_a_Citizenship_name_as_shortname_as(String name, String shortName) throws Throwable {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput",name);
        countryPage.findTheElementFromThePageAndSendKeys("shortName" , shortName);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }
}
