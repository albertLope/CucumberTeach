package Steps.StepDefinitionWithApache;

import Pages.CountryPage;
import Utilities.Day2_GetSingleDataFromExcelReusableMethod;
import cucumber.api.java.en.And;

public class Day14_NationalitiesApache {

    CountryPage countryPage = new CountryPage();

    @And("^Create a citizenship with Apache POI$")
    public void create_a_citizenship_with_Apache_POI(){

        countryPage.findTheElementFromThePageAndClick("addButton");

        String name=  Day2_GetSingleDataFromExcelReusableMethod.GetSingleDataFromExcel("src\\test\\java\\excelFiles\\basqar login.xlsx",  "DialogContent", "Name");
        countryPage.findTheElementFromThePageAndSendKeys("nameInput" , name);

        countryPage.findTheElementFromThePageAndClick("saveButton");
    }

}
