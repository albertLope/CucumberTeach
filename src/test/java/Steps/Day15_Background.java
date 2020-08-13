package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Day15_Background {

    @Given("^GO to website$")
    public void go_to_website() throws Throwable {
        System.out.println("Navigate to website ");
    }

    @Given("^Enter the username and password$")
    public void enter_the_username_and_password() throws Throwable {
        System.out.println("Enter the username and password");
    }

    @When("^Submit button should be clicked$")
    public void submit_button_should_be_clicked() throws Throwable {
        System.out.println("Submit button should be clicked");
    }

    @When("^Navigate to countries page$")
    public void navigate_to_countries_page() throws Throwable {
        System.out.println("Navigate to countries page");
    }

    @When("^I create a countries$")
    public void i_create_a_countries() throws Throwable {
        System.out.println("I create a countries");
    }

    @Then("^Country should be created$")
    public void country_should_be_created() throws Throwable {
        System.out.println("Country should be created");
    }

    @When("^I edit a countries$")
    public void i_edit_a_countries() throws Throwable {
        System.out.println("I edit a countries");
    }

    @When("^Delete a countries$")
    public void delete_a_countries() throws Throwable {
        System.out.println("Delete a countries");
    }




}
