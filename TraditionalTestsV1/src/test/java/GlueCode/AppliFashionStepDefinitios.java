package GlueCode;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.*;

public class AppliFashionStepDefinitios {

    private WebDriver driver = GeneralStepDefinitions.getDriver();
    private AppliFashionHomePage appliFashionHomePage;

    @Given ("^I validate that AppliFashion Home page is successfully displayed")
    public void validateAppliFashionHomePage() throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.validateAppliFashionHomePage();
    }

    @Given ("^I select \"([^\"]*)\" checkbox$")
    public void selectChecksbox(String checkboxName) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.checkCheckboxOnAppliFashionHomePage(checkboxName);
    }

    @Given ("^I click on \"([^\"]*)\" button$")
    public void clickOnButton(String buttonName) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.clickOnButtonOnAppliFashionHomePage(buttonName);
    }

    @Given ("^I click on item number \"([^\"]*)\" in the selection$")
    public void clickOnItemInTheSelection(String itemOrder) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.clickOnItemInTheSelectionOnAppliFashionHomePage(itemOrder);
    }

    @Given ("^I validate after opening the page if all relevant elements on the Home page for task No \"([^\"]*)\" and \"([^\"]*)\" browser and \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height and \"([^\"]*)\" device type are correctly displayed$")
    public void validateElementsOnHomePageAfterOpeningApplication(String task, String browser, String width, String height, String deviceType) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.validateElementsOnHomePageAfterOpeningApplication(task, browser, width, height, deviceType);
    }

    @Given ("^I validate after search for black colors if all relevant elements on the Home page for task No \"([^\"]*)\" and \"([^\"]*)\" browser and \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height and \"([^\"]*)\" device type are correctly displayed$")
    public void validateElementsOnHomePageAfterSearchFOrBlackColor(String task, String browser, String width, String height, String deviceType) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.validateElementsOnHomePageAfterSearchFOrBlackColor(task, browser, width, height, deviceType);
    }

    @Given ("^I validate after click on item if all relevant elements on the Home page for task No \"([^\"]*)\" and \"([^\"]*)\" browser and \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height and \"([^\"]*)\" device type are correctly displayed$")
    public void validateElementsOnHomePageAfterClickOnItem(String task, String browser, String width, String height, String deviceType) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.validateElementsOnHomePageAfterClickOnItem(task, browser, width, height, deviceType);
    }

    @Given ("^I validate that number of found items is \"([^\"]*)\" for task No \"([^\"]*)\" and \"([^\"]*)\" browser and \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height and \"([^\"]*)\" device type$")
    public void validateNumberOfFoundItems(String expectedNumberOfFoundItems, String task, String browser, String width, String height, String deviceType) throws Throwable {
        appliFashionHomePage = new AppliFashionHomePage(driver);
        appliFashionHomePage.validateNumberOfFoundItems(expectedNumberOfFoundItems, task, browser, width, height, deviceType);
    }

}
