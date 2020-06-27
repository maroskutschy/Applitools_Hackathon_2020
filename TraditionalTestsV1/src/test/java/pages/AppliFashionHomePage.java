package pages;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class AppliFashionHomePage extends BasicActions {

    @FindBy (xpath = "//img[@src='/grid/img/logo.svg']")
    private WebElement appliFashionLogo;

    @FindBy (xpath = "//span[@id='SPAN__checkmark__107']")
    private WebElement blackCheckbox;

    @FindBy (xpath = "//button[@id='filterBtn']")
    private WebElement filterButton;

    @FindBy (xpath = "//main[@class='bg_gray']")
    private WebElement detailsPageMainElement;

    // Home Page All element after opening the page

    @FindBy (id = "BUTTONsubmit____43")
    private WebElement searchEditBox;

//    @FindBy (id = "BUTTONsubmit____43")
//    private WebElement searchEditBox;




    String itemInTheSelectionXpathPart1 = "(//div[@class='col-6 col-md-4'])[";
    String generalEndOfXpathFOrOrder = "]";

    boolean collectedResultOfValidation = true;

    public AppliFashionHomePage(WebDriver driver) {
        super( driver );
    }

    public AppliFashionHomePage validateAppliFashionHomePage () throws InterruptedException {
        checkElementPresent(appliFashionLogo, "appliFashionLogo");
        return this;
    }

    public AppliFashionHomePage checkCheckboxOnAppliFashionHomePage (String checkboxName) throws InterruptedException {
        WebElement checkBox;
        switch (checkboxName) {
            case "Black":
                checkBox = blackCheckbox;
                break;
            default:
                checkBox = blackCheckbox;
        }
        click(checkBox, checkboxName);
        return this;
    }

    public AppliFashionHomePage clickOnButtonOnAppliFashionHomePage (String buttonName) throws InterruptedException {
        WebElement button;
        switch (buttonName) {
            case "Filter":
                button = filterButton;
                break;
            default:
                button = filterButton;
        }
        click(button, buttonName);
        return this;
    }

    public AppliFashionHomePage clickOnItemInTheSelectionOnAppliFashionHomePage (String itemOrder) throws InterruptedException {
        WebElement itemInTheSelection = driver.findElement(By.xpath(itemInTheSelectionXpathPart1 + itemOrder + generalEndOfXpathFOrOrder));
        click(itemInTheSelection, "item In The Selection No.: " + itemOrder);
        checkElementPresent(detailsPageMainElement, "Details Page Main Element");
        return this;
    }

    public AppliFashionHomePage validateElementsOnHomePageAfterOpeningApplication (String task, String browser, String width, String height, String deviceType) {
        SoftAssertions softAssertions = new SoftAssertions();
//        String searchField = "DIV__customsear__41";
//        String searchIcon= "I__headericon__44";
//
//            //Report and then soft-assert
//            softAssertions.assertThat(
//                    hackathonReporter(task, "Search field is displayed", searchField, browser, width, height, deviceType,
//                            driver.findElement(By.id(searchField)).isDisplayed()));
//
//            //Report and then soft-assert
//            softAssertions.assertThat(
//                    hackathonReporter(task, "Search icon is displayed", searchIcon, browser, width, height, deviceType,
//                            driver.findElement(By.id(searchIcon)).isSelected()));

        List<String> listOfElementsIds = new ArrayList<>();
        List<String> listOfElementsNames = new ArrayList<>();
        listOfElementsNames.add("Search field");
        listOfElementsIds.add("DIV__customsear__41");
        listOfElementsNames.add("Search icon");
        listOfElementsIds.add("I__headericon__44");

        for (int i = 0; i < listOfElementsIds.size(); i++ ) {
            softAssertions.assertThat(
                    hackathonReporter(task, listOfElementsNames.get(i) + " is displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed()));
        }

        //Assert all elements inside this test
           softAssertions.assertAll();
        Assert.assertTrue("One or more elements were not displayed, check statuses Fail in 'Traditional-V1-TestResults.txt' in the root of the project", collectedResultOfValidation);
        return this;
    }

    public boolean hackathonReporter(String task, String testName, String domId, String browser, String width, String height, String device, boolean comparisonResult) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Traditional-V1-TestResults.txt", true))){
            writer.write("Task: " + task + ", Test Name: " + testName +", DOM Id: " + domId + ", Browser: " + browser
                    + ", Viewport: " + width + "  x " + height + ", Device: " + device + ", Status: " + (comparisonResult ? "Pass" : "Fail"));
            writer.newLine();
        }catch(Exception e){
            System.out.println("Error writing to report file");
            e.printStackTrace();
        }
        collectedResultOfValidation = collectedResultOfValidation && comparisonResult;
        //returns the result so that it can be used for further Assertions in the test code.
        return comparisonResult;
    }

}
