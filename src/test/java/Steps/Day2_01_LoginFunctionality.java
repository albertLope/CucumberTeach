package Steps;

import Utilities.DriverClassCopy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day2_01_LoginFunctionality {

    /*
        This class is created without using page object model
     */

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() throws Throwable {

        driver = DriverClassCopy.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @Given("^Enter the username and password click on login button$")
    public void enter_the_username_and_password_click_on_login_button(){

        driver.findElement(By.id("mat-input-0")).sendKeys("daulet2030@gmail.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("mat-input-1")).sendKeys("TechnoStudy123@");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[text()=' LOGIN ']")).click();

        driver.findElement(By.linkText("Got it!")).click();

    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully(){

        driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
