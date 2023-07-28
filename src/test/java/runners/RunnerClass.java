package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        //glue is where we find implementations for gherkin steps
        //we provide the path of package to get all the step definitions
        glue = "steps",
        //dryRun we use to get the step definitions of undefined steps
        //if we set it to true, it will quickly scan all gherkin steps whether they are implemented or not
        //if we set it to true, it stops actual execution
        //to execute scripts in real time, we should set it to false,
        dryRun = false,
        // (monochrome) it means the console output for cucumber test is having irrelevant information
        //when we set it to true, it simply removes  all the irrelevant information
        monochrome = true,
        tags = "@regression", // we can write tags = "@smoke or @batch12 or @sprint12"
        // we expecially gives @smoke @regression @test tag - it means we are working on it
        // when we finish to work over it we change it

        //html report will be generated under target folder
        //having both the tags in it
        plugin = {"html:target/cucumber.html" ,"pretty","json:target/cucumber.json",
                "rerun:target/failed.txt"

        }

)

public class RunnerClass {

}
