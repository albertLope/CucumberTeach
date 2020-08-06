package Steps;

import Utilities.Day2_GetMultipleDataFromExcelReusableMethod;
import Utilities.Day2_GetSingleDataFromExcelReusableMethod;
import Utilities.Day10_DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Day14_ApachePOI_02 {

    WebDriver driver;

    @Given("^Navigate to toolsQA$")
    public void navigate_to_toolsQA(){

        driver = Day10_DriverClass.GetDriver();

        driver.get("https://demoqa.com/text-box");
    }

    @And("^Enter the data to website$")
    public void enter_the_data_to_website(){

        driver.findElement(By.id("userName")).sendKeys(Day2_GetSingleDataFromExcelReusableMethod.GetSingleDataFromExcel("src/test/java/excelFiles/toolsQAForm.xlsx", "Sheet1","FullName"));

        driver.findElement(By.id("userEmail")).sendKeys(Day2_GetSingleDataFromExcelReusableMethod.GetSingleDataFromExcel("src/test/java/excelFiles/toolsQAForm.xlsx", "Sheet1","userEmail"));

        driver.findElement(By.id("currentAddress")).sendKeys(Day2_GetSingleDataFromExcelReusableMethod.GetSingleDataFromExcel("src/test/java/excelFiles/toolsQAForm.xlsx", "Sheet1","currentAddress"));

        driver.findElement(By.id("permanentAddress")).sendKeys(Day2_GetSingleDataFromExcelReusableMethod.GetSingleDataFromExcel("src/test/java/excelFiles/toolsQAForm.xlsx", "Sheet1","permanentAddress"));

    }

    @When("^Click on submit button$")
    public void click_on_submit_button(){

        driver.findElement(By.id("submit")).click();

    }

    @Then("^Data should be displayed in the bottom of the page$")
    public void data_should_be_displayed_in_the_bottom_of_the_page() {

        List<WebElement> allResult = driver.findElements(By.className("mb-1"));

        List<String> allDataFromExcel = Day2_GetMultipleDataFromExcelReusableMethod.reusableMethodForGetData("src/test/java/excelFiles/toolsQAForm.xlsx" , "Sheet1");

        for(int i = 0 ;  i < allResult.size(); i++){

            System.out.println(allResult.get(i).getText());
            System.out.println(allDataFromExcel.get(i));

            Assert.assertTrue(allResult.get(i).getText().contains(allDataFromExcel.get(i)));

        }

    }
}
