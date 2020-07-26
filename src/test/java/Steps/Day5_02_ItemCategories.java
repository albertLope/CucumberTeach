package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day5_02_ItemCategories {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Item Categories page$")
    public void navigate_to_Item_Categories_page()  {

        leftNav.findTheElementFromThePageAndClick("InventoryMain");
        leftNav.findTheElementFromThePageAndClick("SetupUnderTheInventory");
        leftNav.findTheElementFromThePageAndClick("Item_Categories");

    }

    @When("^Create a Item categories name as \"([^\"]*)\" integration code as \"([^\"]*)\"$")
    public void create_a_Item_categories_name_as_integration_code_as(String name, String userType) {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , name);
        countryPage.findTheElementFromThePageAndClick("UserType");
        countryPage.findTheElementFromThePageAndClick("UserType");
        countryPage.findTheElementFromThePageAndClick(userType);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }
}
