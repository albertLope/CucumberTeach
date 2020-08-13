package RunnerClasses;


import Utilities.Day10_DriverClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;

/*
        In some companies

            There is a

     */
@CucumberOptions(

        plugin={"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReportSmoke.html"
        },
//                if you need to run specific feature files then add tag here and in the
//                  feature file then it will run those feature files
        tags = "@SmokeTest",
//
//                path for the my feature Files
        features = {"src/test/java/FeatureFiles"},

//                location of the step definitions
        glue={"Steps"},

//                if the dry run is true it is making sure your feature files steps are
//                  created in the step definition
        dryRun = false
)

public class Day_10_RunnerForParameters extends AbstractTestNGCucumberTests {

    @BeforeTest
    @Parameters("browser")
    public void beforeMethod(String browser){
        Day10_DriverClass.browsername=browser;
    }

    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src\\test\\java\\FeatureFiles\\Day_10_extent_config.xml"));
        //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
        Reporter.setSystemInfo("User Name", "Ali Koklu");
        Reporter.setSystemInfo("Application Name", "Basqar ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name"));
        Reporter.setSystemInfo("Environment", "QA");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}
