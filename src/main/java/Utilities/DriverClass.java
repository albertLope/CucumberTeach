package Utilities;

import org.openqa.selenium.WebDriver;

public class DriverClass {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static String browsername;

    public static WebDriver getDriver(){

        if(driver.get()==null) {
            setWebDriver(Day10_DriverFactory.createInstance(browsername));
        }
        return driver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        DriverClass.driver.set(driver);
    }

    public static void quitDriver(){

        if( driver.get()!=null) {
            driver.get().quit();
            WebDriver driver1 = driver.get();
            driver1=null;
            driver.set(driver1);

        }

    }

}
