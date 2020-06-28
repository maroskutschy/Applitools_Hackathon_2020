package pages;

import GlueCode.GeneralStepDefinitions;
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

    //boolean collectedResultOfValidation = true;

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
        List<Boolean> listOfVisibleStatusesForWith1200 = new ArrayList<>();
        List<Boolean> listOfVisibleStatusesForWith768 = new ArrayList<>();
        List<Boolean> listOfVisibleStatusesForWith500 = new ArrayList<>();

        listOfElementsNames.add("Main menu");
        listOfElementsIds.add("DIV__mainmenu__15");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Filter Collection");
        listOfElementsIds.add("filter_col");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Search field");
        listOfElementsIds.add("DIV__customsear__41");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Search icon on the right");
        listOfElementsIds.add("I__headericon__44");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Search button on the left");
        listOfElementsIds.add("A__btnsearchm__59");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Account");
        listOfElementsIds.add("DIV__dropdowndr__55");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Wishlist");
        listOfElementsIds.add("A__wishlist__52");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Cart");
        listOfElementsIds.add("DIV__dropdowndr__48");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Items in cart");
        listOfElementsIds.add("STRONG____50");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("View grid");
        listOfElementsIds.add("I__tiviewgrid__202");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("View list");
        listOfElementsIds.add("I__tiviewlist__204");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Filters icon");
        listOfElementsIds.add("ti-filter");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Filters label");
        listOfElementsIds.add("SPAN____208");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Add to favourites for element 1");
        listOfElementsIds.add("I__tiheart__225");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 1");
        listOfElementsIds.add("I__ticontrols__229");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 1");
        listOfElementsIds.add("I__tishopping__233");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 2");
        listOfElementsIds.add("I__tiheart__250");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 2");
        listOfElementsIds.add("I__ticontrols__254");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 2");
        listOfElementsIds.add("I__tishopping__258");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 3");
        listOfElementsIds.add("I__tiheart__272");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 3");
        listOfElementsIds.add("I__ticontrols__276");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 3");
        listOfElementsIds.add("I__tishopping__280");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 4");
        listOfElementsIds.add("I__tiheart__294");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 4");
        listOfElementsIds.add("I__ticontrols__298");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 4");
        listOfElementsIds.add("I__tishopping__302");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 5");
        listOfElementsIds.add("I__tiheart__316");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 5");
        listOfElementsIds.add("I__ticontrols__389");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 5");
        listOfElementsIds.add("I__tishopping__393");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 6");
        listOfElementsIds.add("I__tiheart__338");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 6");
        listOfElementsIds.add("I__ticontrols__342");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 6");
        listOfElementsIds.add("I__tishopping__346");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 7");
        listOfElementsIds.add("I__tiheart__360");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 7");
        listOfElementsIds.add("I__ticontrols__364");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 7");
        listOfElementsIds.add("I__tishopping__368");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 8");
        listOfElementsIds.add("I__tiheart__385");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 8");
        listOfElementsIds.add("I__ticontrols__389");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 8");
        listOfElementsIds.add("I__tishopping__393");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for element 9");
        listOfElementsIds.add("A__tooltip__406");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for element 9");
        listOfElementsIds.add("I__ticontrols__411");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for element 9");
        listOfElementsIds.add("A__tooltip__414");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("About us");
        listOfElementsIds.add("A____425");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Faq");
        listOfElementsIds.add("A____427");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Help");
        listOfElementsIds.add("A____429");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("My account");
        listOfElementsIds.add("A____431");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Blog");
        listOfElementsIds.add("A____433");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Contacts");
        listOfElementsIds.add("A____435");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("About us");
        listOfElementsIds.add("A____425");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email newsletter");
        listOfElementsIds.add("email_newsletter");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Address");
        listOfElementsIds.add("LI____440");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email");
        listOfElementsIds.add("LI____443");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        // this code will be applied only when viewport width is: 1200
        if (width.equalsIgnoreCase("1200")) {
            for (int i = 0; i < listOfElementsNames.size(); i++ ) {
                // this code will be applied when element should be visible (we are validating is isDisplayed() is true)
                if (listOfVisibleStatusesForWith1200.get(i).equals(true)) {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                // this code will be applied when element should NOT be visible (we are validating is isDisplayed() is false)
                } else {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should not be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            !driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                }
            }
        // this code will be applied only when viewport width is: 768
        } else if (width.equalsIgnoreCase("768")) {
            for (int i = 0; i < listOfElementsNames.size(); i++ ) {
                // this code will be applied when element should be visible (we are validating is isDisplayed() is true)
                if (listOfVisibleStatusesForWith768.get(i).equals(true)) {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                // this code will be applied when element should NOT be visible (we are validating is isDisplayed() is false)
                } else {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should not be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            !driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                }
            }
        // this code will be applied only when viewport width is: 500
        } else {
            for (int i = 0; i < listOfElementsNames.size(); i++ ) {
                // this code will be applied when element should be visible (we are validating is isDisplayed() is true)
                if (listOfVisibleStatusesForWith500.get(i).equals(true)) {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                // this code will be applied when element should NOT be visible (we are validating is isDisplayed() is false)
                } else {
                    hackathonReporter(task, listOfElementsNames.get(i) + " should not be displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
                            !driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed());
                }
            }
        }



//        for (int i = 0; i < listOfElementsNames.size(); i++ ) {
//            softAssertions.assertThat(
//                    hackathonReporter(task, listOfElementsNames.get(i) + " is displayed", listOfElementsIds.get(i), browser, width, height, deviceType,
//                            driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed()));


               // example for not displayed: !driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed()));

//            if (listOfElementsNames.get(i).equalsIgnoreCase("Search field")) {
//                softAssertions.assertThat(
//                        hackathonReporter(task, listOfElementsNames.get(i) + " is displayed", listOfElementsIds.get(i),
//                                browser, width, height, deviceType,
//                                driver.findElement(By.id(listOfElementsIds.get(i))).isDisplayed()));
//            } else {
//                softAssertions.assertThat(
//                        hackathonReporter(task, listOfElementsNames.get(i) + " is displayed", listOfElementsIds.get(i),
//                                browser, width, height, deviceType,
//                                driver.findElement(By.id(listOfElementsIds.get(i))).isSelected()));
//            }
//        }

        //Assert all elements inside this test
           softAssertions.assertAll();
//        Assert.assertTrue("One or more elements were not displayed, check statuses Fail in 'Traditional-V1-TestResults.txt' in the root of the project", GeneralStepDefinitions.collectedResultOfValidation);
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
        GeneralStepDefinitions.collectedResultOfValidation = GeneralStepDefinitions.collectedResultOfValidation && comparisonResult;
        //returns the result so that it can be used for further Assertions in the test code.
        return comparisonResult;
    }

}
