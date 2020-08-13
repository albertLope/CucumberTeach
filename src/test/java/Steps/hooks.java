package Steps;

import Utilities.DriverClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class hooks {

    WebDriver driver;

    @Before
    public void before(){

        driver = DriverClass.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

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

        driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div"))));

    }

    @After
    public void after(Scenario scenario){
//
//        TakesScreenshot ScreenShot = ((TakesScreenshot)DriverClass.getDriver());
//
//        File srcFile = ScreenShot.getScreenshotAs( OutputType.FILE );
//
//        String featureFileName = scenario.getId();
//
//        Date now = new Date(  );
//
//        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
//
//        String dateinString = formatter.format( now );
//
//        dateinString = dateinString.replace( ":" ,"," );
//
//        File destinationFile = new File("target/screenShots/"+featureFileName+dateinString+".png");
//
//        try {
//            FileUtils.copyFile( srcFile, destinationFile );
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        System.out.println(scenario.getStatus());
        if(scenario.getStatus().contains("fail")) {
            TakesScreenshot ScreenShot = ((TakesScreenshot) DriverClass.getDriver());

            File srcFile = ScreenShot.getScreenshotAs(OutputType.FILE);

            String featureFileName = scenario.getId();

            File destinationFile = new File("target/screenShots/" + featureFileName + ".png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        DriverClass.quitDriver();

    }
}

// Background - Runner - Tags -