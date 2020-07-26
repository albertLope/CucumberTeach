package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day5_01_Discount {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Discount page$")
    public void navigate_to_Discount_page()  {

        leftNav.findTheElementFromThePageAndClick("setupOne");
        leftNav.findTheElementFromThePageAndClick("Parameters");
        leftNav.findTheElementFromThePageAndClick("Discounts");
    }

    @When("^Create a Discount name as \"([^\"]*)\" integration code as \"([^\"]*)\" Priority as \"([^\"]*)\"$")
    public void create_a_Discount_name_as_integration_code_as_Priority_as(String Description, String Integration_code, String Priority)   {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("Description" , Description);
        countryPage.findTheElementFromThePageAndSendKeys("codeInput" , Integration_code);
        countryPage.findTheElementFromThePageAndSendKeys("Priority" , Priority);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }
}
