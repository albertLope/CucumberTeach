package Steps;

import Pages.CountryPage;
import Pages.FormPages;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class Day07_01_EntranceExam {

    LeftNav leftNav = new LeftNav();
    CountryPage countryPage = new CountryPage();
    FormPages formPages = new FormPages();


    @Given("^Navigate to Entrance exam page$")
    public void navigate_to_Entrance_exam_page() {

        leftNav.findTheElementFromThePageAndClick("Entrance_ExamsDropdownMain");
        leftNav.findTheElementFromThePageAndClick("SetupUnderTheInventory");
        leftNav.findTheElementFromThePageAndClick("Entrance_ExamsButton");

    }

    @Given("^Navigate to Students page$")
    public void navigate_to_Students_page(){
        leftNav.findTheElementFromThePageAndClick("Student");
        leftNav.findTheElementFromThePageAndClick("Students");
    }

    @And("^Click on add button$")
    public void create_an_exam(){

        countryPage.findTheElementFromThePageAndClick("addButton");

    }

    @And("^Send the keys in the new exam form$")
    public void send_the_keys_in_the_new_exam_form(DataTable elements)  {

        List<List<String>> elementNameAndValue = elements.asLists(String.class);

        for(int i = 0 ; i <elementNameAndValue.size();i++){

            formPages.findTheElementFromThePageAndSendKeys(elementNameAndValue.get(i).get(0),elementNameAndValue.get(i).get(1));

        }

    }

    @And("^Clicks in the new exam form$")
    public void clicks_in_the_new_exam_form(DataTable Elements)  {
        List<String> elementNameAndValue = Elements.asList(String.class);

        for(int i = 0 ; i <elementNameAndValue.size();i++){

            System.out.println(elementNameAndValue.get(i));
            formPages.findTheElementFromThePageAndClick(elementNameAndValue.get(i));

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }



}
