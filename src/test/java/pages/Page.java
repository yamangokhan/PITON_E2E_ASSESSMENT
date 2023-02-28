package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {

    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "//input[@id='portInputFrom']")
    public WebElement inputFrom;

    @FindBy(id = "//input[@id='portInputTo']")
    public WebElement inputTo;

    @FindBy(css = "span[id='dateSelector'] span[class='date-viewdate-view - text - cell']")
    public WebElement dateSelector;

    @FindBy(xpath = "//a[@id='executeSingleCitySubmit']")
    public WebElement flightSearchButton;

    @FindBy(xpath = "//a[contains(text(),'Gidiş-Dönüş')]")
    public WebElement roundTripRadioButton;

    @FindBy(id = "portInputFrom")
    public WebElement fromWhereSpaceArea;

    @FindBy(id = "portInputTo")
    public WebElement toWhereSpaceArea;

    @FindBy(xpath = "(//span[contains(text(),'Tüm uçuş noktalarımız')])[1]")
    public WebElement allDestinationOption;

    @FindBy(xpath = "//ul[@class='country-alphabet-list nav pt-20pb-20 fs-10']")
    public WebElement alphabetOption;

    @FindBy(id = "countryCount")
    public WebElement countryCountText;

    @FindBy(id = "portCount")
    public WebElement portCountText;

    @FindBy(xpath = "//a[normalize-space()='I']")
    public WebElement letter;

    @FindBy(xpath = "//span[normalize-space()='I']")
    public WebElement visibleLetter;

    @FindBy(xpath = "//a[normalize-space()='Irak']")
    public WebElement starWithSameLetter;

    @FindBy(xpath = "//a[@role='button'][contains(text(),'İspanya')]")
    public WebElement selectCountry;

    @FindBy(xpath = "//a[contains(text(),'Barselona, Barselona El Prat Havalimanı(BCN) ')]")
    public WebElement selectPort;

    @FindBy(xpath = "//a[contains(text(),'Barselona, Barselona El Prat Havalimanı (BCN)')]")
    public WebElement bCNAirport;

    @FindBy (id = "singleCityCalendarHolder")
    public WebElement dateCalendar;

    @FindBy(xpath = "(//tbody)[2]/tr[2]/td[6]")
    public WebElement departureDate;

    @FindBy(xpath = "(//tbody)[2]/tr[2]/td[5]")
    public WebElement returnDate;

    @FindBy (xpath = "//*[@id=\"singleCityCalendarHolder\"]/div[1]/div/div/div[1]/div/a")
    public WebElement tamamButton;

    @FindBy (xpath = "//h3[contains(text(),'Kabin ve yolcu seçimi')]")
    public WebElement passengersPage;

    @FindBy (xpath = "//span[contains(text(),'Economy Class')]")
    public WebElement defaultRadioButton;

    @FindBy (id = "customSpnr0ADULT")
    public WebElement defaultPassangersCount;

    @FindBy (xpath = "//a[@id='executeSingleCitySubmit']")
    public WebElement ucusAraButton;

    @FindBy (xpath = "//*[@class='rangeslidercontent without-canvas']")
    public WebElement flightTable;

}

