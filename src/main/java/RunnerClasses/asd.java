package RunnerClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
//                if you need to run specific feature files then add tag here and in the
//                  feature file then it will run those feature files
        tags = "@regression",

//                path for the my feature Files
        features = {"src/test/java/FeatureFiles"},

//                location of the step definitions
        glue={"StepDefinition"},

//                if the dry run is true it is making sure your feature files steps are
//                  created in the step definition
        dryRun = false
)

public class asd extends AbstractTestNGCucumberTests {

}
