package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day4_02_Nationalities {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Nationalities page$")
    public void navigate_to_Nationalities_page()  {

        leftNav.findTheElementFromThePageAndClick("setupOne");
        leftNav.findTheElementFromThePageAndClick("Parameters");
        leftNav.findTheElementFromThePageAndClick("Nationalities");

    }

    @When("^Create a Nationalities name as \"([^\"]*)\"")
    public void create_a_Nationalities_name_as_shortname_as(String name)  {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , name);
        countryPage.findTheElementFromThePageAndClick("saveButton");
    }
}
