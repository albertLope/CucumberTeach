package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EtsySteps {

    @Given("^Navigate to etsy website$")
    public void navigate_to_etsy_website() {

        System.out.println("Navigating to etsy.com");
    }

    @Given("^Search for \"([^\"]*)\" and click on the any item$")
    public void search_for_and_click_on_the_any_item(String itemName)  {

        System.out.println("Searching for the "+ itemName);
    }

    @When("^Add item to favorite$")
    public void add_item_to_favorite()  {

        System.out.println("Adding item to favorites");

    }

    @Then("^Item should be added in the favorite page$")
    public void item_should_be_added_in_the_favorite_page()  {

        System.out.println("Item successfully added in the favorites page");

    }

    @When("^Click on the remove button for the \"([^\"]*)\"$")
    public void click_on_the_remove_button_for_the(String arg1)  {

    }

    @Then("^Item should be remove from the item page$")
    public void item_should_be_remove_from_the_item_page()  {

    }




}
