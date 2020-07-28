package Steps;

import Utilities.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_01_LoginFunctionality {

    /*
        This class is created without using page object model
     */

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() throws Throwable {

        driver = DriverClass.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @Given("^Enter the username and password click on login button$")
    public void enter_the_username_and_password_click_on_login_button() throws Throwable {

        driver.findElement(By.id("mat-input-0")).sendKeys("daulet2030@gmail.com");

        driver.findElement(By.id("mat-input-1")).sendKeys("DV@d9FjCm5hXeNFv");

        driver.findElement(By.xpath("//span[text()=' LOGIN ']")).click();

        driver.findElement(By.linkText("Got it!")).click();

    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {

        driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();

    }

}
