package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day10_DriverFactory {



    public static WebDriver createInstance(String browserName) {

        WebDriver driver;

        System.out.println(browserName + "<---------------- browser name ");

        if(browserName==null){
            browserName="chrome";
        }

        switch (browserName) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

        // maximize browser's window on start
        driver.manage().window().maximize();
        return driver;

    }


}
