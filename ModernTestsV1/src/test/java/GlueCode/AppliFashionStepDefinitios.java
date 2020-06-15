package GlueCode;

import TestRunners.TestDefaultValues;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.*;

import java.util.Map;

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

}
