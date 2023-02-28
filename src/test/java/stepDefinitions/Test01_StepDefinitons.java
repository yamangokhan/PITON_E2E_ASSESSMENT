package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class Test01_StepDefinitons {

    Page page = new Page();

    @Given("the users enters {string}")
    public void theUsersEnters(String baseUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        Thread.sleep(3000);
    }

    @When("homepage should be display successfully")
    public void homepageShouldBeDisplaySuccessfully() {
        String actualTitle = Driver.getDriver().getTitle();
        String actualUrl = Driver.getDriver().getCurrentUrl();

        String expectedTitle = "Türk Hava Yolları";
        String expectedUrl = "https://www.turkishairlines.com/tr-int/";


        System.out.println("page title : " + actualTitle);
        System.out.println("page url : " + actualUrl);

        Assert.assertEquals("test failed", expectedUrl, actualUrl);

    }

    @Given("the users should check that the from location selection area")
    public void theUsersShouldCheckThatTheFromLocationSelectionArea() {
        Assert.assertTrue(page.inputFrom.isEnabled());
    }

    @When("the users should check that the to location selection area")
    public void theUsersShouldCheckThatTheToLocationSelectionArea() {
        Assert.assertTrue(page.inputTo.isEnabled());
    }

    @Then("the users should check that the date selection are")
    public void theUsersShouldCheckThatTheDateSelectionAre() {
        Assert.assertTrue(page.dateSelector.isEnabled());
    }

    @And("the users should check that the flight intermediate elements")
    public void theUserShouldCheckThatTheFlightIntermediateElements() {
        Assert.assertTrue(page.flightSearchButton.isEnabled());
    }

    @Given("the users should check the round trip option is selected by default.")
    public void theUsersShouldCheckTheRoundTripOptionIsSelectedByDefault() {
        Assert.assertTrue(page.roundTripRadioButton.isSelected());

    }

    @Given("the users click on the where entry area")
    public void theUsersClickOnTheWhereEntryArea() {
        page.fromWhereSpaceArea.click();

    }

    @When("the users delete expression what is on written")
    public void theUsersDeleteExpressionWhatIsOnWritten() {
        page.fromWhereSpaceArea.clear();
    }

    @Given("the users write {string} to input")
    public void theUsersWriteToInput(String destination) {
        page.fromWhereSpaceArea.sendKeys(ConfigurationReader.getProperty("destination"));
    }

    @When("the users clicks input to where option")
    public void theUsersClicksInputToWhereOption() throws InterruptedException {
        page.toWhereSpaceArea.click();
        Thread.sleep(2000);
    }

    @Then("the users verifies all our destinations option is displayed")
    public void theUsersVerifiesAllOurDestinationsOptionIsDisplayed() {
        String expectedData = "Tüm uçuş noktalarımız";
        String actualData = page.allDestinationOption.getText();
        Assert.assertEquals("Didnt displayed", expectedData, actualData);

    }

    @Given("the users clicks all our destinations option")
    public void theUsersClicksAllOurDestinationsOption() throws
            InterruptedException {
        page.allDestinationOption.click();
        Thread.sleep(3000);
    }

    @When("the users verifies that alphabetical filtering screen is displayed")
    public void theUsersVerifiesThatAlphabeticalFilteringScreenIsDisplayed() {
        String alphabet = page.alphabetOption.getText();

        Assert.assertTrue(alphabet.contains("A") && alphabet.contains("B"));

    }

    @Then("the users verifies that country selection menu is displayed")
    public void theUsersVerifiesThatCountrySelectionMenuIsDisplayed() {
        page.countryCountText.isDisplayed();
    }

    @And("the users verifies that airport list is displayed")
    public void theUsersVerifiesThatAirportListIsDisplayed() {
        page.portCountText.isDisplayed();
    }

    @Given("the users clicks the letter {string}")
    public void theUsersClicksTheLetter(String letter) {
        page.letter.click();

    }

    @When("the users verifies that letter {string} is selected in the alphabetic filtering screen.")
    public void
    theUsersVerifiesThatLetterIsSelectedInTheAlphabeticFilteringScreen(String visibleLetter) {
        String actualLetter = page.visibleLetter.getText();
        String expectedLetter = visibleLetter.toString();
        Assert.assertTrue(actualLetter.equalsIgnoreCase(expectedLetter));
    }

    @Then("the users verifies that  it is seen that countries starting with the letter {string} come.")
    public void
    theUsersVerifiesThatItIsSeenThatCountriesStartingWithTheLetterCome(String letter) {
        String startLetter = page.letter.getText();
        char startLetter01 = startLetter.charAt(0);
        Assert.assertTrue(startLetter.contains(letter));

    }

    @Given("the users select {string} option from the dropdown menu")
    public void theUsersSelectOptionFromTheDropdownMenu(String country) {
        page.selectCountry.click();
        System.out.println(country);

    }

    @When("the users sees that the airports in Spain are listed.")
    public void theUsersSeesThatTheAirportsInSpainAreListed() {
        List<WebElement> spainAirports = (List<WebElement>) Driver.getDriver().findElements(By.id("countryPorts"));
        for (WebElement wb : spainAirports) {
            System.out.println(wb.getText());
        }

    }

    @Given("the users select {string} option")
    public void theUsersSelectOption(String arg0) {
        page.bCNAirport.click();

    }

    @When("the users verifies that date selection screen apperars")
    public void theUsersVerifiesThatDateSelectionScreenApperars() {
        Assert.assertTrue(page.dateSelector.isDisplayed());
    }

    @Given("the users select {string} for departure date")
    public void theUsersSelectForDepartureDate(String port) {
        page.selectPort.click();
        System.out.println("port name is :" + port);

    }

    @When("the users select {string} for return date")
    public void theUsersSelectForReturnDate(String arg0) {
        page.departureDate.click();
        page.returnDate.click();
    }

    @Then("the users verifies that return date cannot be before the departure date")
    public void theUsersVerifiesThatReturnDateCannotBeBeforeTheDepartureDate() {
        String expectedData1 = page.departureDate.getText();
        String actualData1 = String.valueOf(Driver.getDriver().findElement(By.id("selectFlightDate01")));

        Assert.assertTrue(actualData1.contains(expectedData1));
    }

    @Given("the user verifies that ‘Date selection is complete\" message")
    public void theUserVerifiesThatDateSelectionIsCompleteMessage() {
        //
    }

    @When("the users verifies that OK button is clickable")
    public void theUsersVerifiesThatOKButtonIsClickable() {
        Assert.assertTrue(page.tamamButton.isEnabled());

    }

    @Then("the users verifies that passenger selection menu is displayed")
    public void theUsersVerifiesThatPassengerSelectionMenuIsDisplayed() {
        Assert.assertTrue(page.passengersPage.isDisplayed());
    }

    @Given("the users verifies that Adult Person option is selected default")
    public void theUsersVerifiesThatAdultPersonOptionIsSelectedDefault() {

    }

    @When("the users verifies that Economy Class option is selected default")
    public void theUsersVerifiesThatEconomyClassOptionIsSelectedDefault() {
        Assert.assertTrue(page.defaultRadioButton.isSelected());
    }

    @Given("the users clicks search flight button")
    public void theUsersClicksSearchFlightButton() {
        Assert.assertTrue(page.defaultPassangersCount.getText(), Boolean.parseBoolean("1"));
    }

    @When("the users verifies that between IST-BCN flights are listed")
    public void theUsersVerifiesThatBetweenISTBCNFlightsAreListed() {
        page.ucusAraButton.click();
        Assert.assertTrue(page.flightTable.isDisplayed());

    }

}