package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day4_03_Fees {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Fees page$")
    public void navigate_to_Fees_page() throws Throwable {


        leftNav.findTheElementFromThePageAndClick("setupOne");
        leftNav.findTheElementFromThePageAndClick("Parameters");
        leftNav.findTheElementFromThePageAndClick("Fees");
    }

    @When("^Create a Fees name as \"([^\"]*)\" code as \"([^\"]*)\" integration code as \"([^\"]*)\" Priority as \"([^\"]*)\"$")
    public void create_a_Fees_name_as_code_as_integration_code_as_Priority_as(String Name, String code, String Integration_Code, String Priority) throws Throwable {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , Name);
        countryPage.findTheElementFromThePageAndSendKeys("codeInput" , code);
        countryPage.findTheElementFromThePageAndSendKeys("IntegrationCode" , Integration_Code);
        countryPage.findTheElementFromThePageAndSendKeys("Priority" , Priority);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }

    @When("^Create a Fees name$")
    public void createAFeesName() {

//Create an excel for dialog content get all the data in there 

    }
}
