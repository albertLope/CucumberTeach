package Steps;

import Pages.CountryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Day3_01_CountryClass {

    CountryPage countryPage = new CountryPage();


    @When("^Create a country name is \"([^\"]*)\" code is \"([^\"]*)\"$")
    public void create_a_country_name_is_code_is(String name, String code) throws Throwable {

        countryPage.findTheElementFromThePageAndClick("addButton");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" ,name);
        countryPage.findTheElementFromThePageAndSendKeys("codeInput" ,code);
        countryPage.findTheElementFromThePageAndClick("saveButton");

    }

    @Given("^Click on the edit button for position \"([^\"]*)\" name \"([^\"]*)\"$")
    public void click_on_the_edit_button_for_position_name(String position, String name) {
        System.out.println("Position" + position);
        countryPage.ClickOnTheButtonForTheElement(position,"edit", name);
    }

    @And("^Edit the name as \"([^\"]*)\"")
    public void edit_the_country_name_as_code_as(String name) throws Throwable {
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" ,name);
        countryPage.findTheElementFromThePageAndClick("saveButton");
    }

    @When("^Delete name in the \"([^\"]*)\" position the \"([^\"]*)\"$")
    public void delete_name_in_the_position_the(String position, String name) {

        countryPage.ClickOnTheButtonForTheElement(position,"delete" , name);
        countryPage.findTheElementFromThePageAndClick("YesButton");

    }

}
