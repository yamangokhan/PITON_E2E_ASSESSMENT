package stepDefinitions;

import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Test01_StepDefinitons {
    @When("go to the homepage {string}")
    public void goToTheHomepage(String baseUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));

    }
}
