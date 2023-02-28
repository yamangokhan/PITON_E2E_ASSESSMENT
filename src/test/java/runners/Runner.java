package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    //RUNNER CLASS

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber-reports",
                    "rerun:target/rerun.txt"},
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@smoke")


    public class Runner {}
