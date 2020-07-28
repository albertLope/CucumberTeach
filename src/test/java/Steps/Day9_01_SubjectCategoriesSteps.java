package Steps;

import Pages.CountryPage;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Day9_01_SubjectCategoriesSteps {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();

    @And("^Navigate to Subject Categories page$")
    public void navigate_to_Subject_Categories_page()  {

        leftNav.findTheElementFromThePageAndClick("Education");
        leftNav.findTheElementFromThePageAndClick("SetupUnderTheInventory");
        leftNav.findTheElementFromThePageAndClick("Subject_Categories");

    }

    @And("^Navigate to Subjects$")
    public void navigate_to_Subjects() {

        leftNav.findTheElementFromThePageAndClick("Subjects");
        countryPage.verifyElementContainTheText("Subjects" , "Subjects");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
}
