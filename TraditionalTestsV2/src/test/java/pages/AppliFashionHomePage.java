package pages;

import GlueCode.GeneralStepDefinitions;
import org.openqa.selenium.By;
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

    @FindBy (xpath = "//div[@id='product_grid']/div")
    private List<WebElement> listOfSearchedItems;

    @FindBy (xpath = "//div[@class='nice-select wide']/span")
    private WebElement selectedOptionInSizeDropdown;

    @FindBy (id = "new_price")
    private WebElement newPrice;

    String itemInTheSelectionXpathPart1 = "(//div[@class='col-6 col-md-4'])[";
    String generalEndOfXpathFOrOrder = "]";

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
        listOfElementsIds.add("I__tiviewgrid__203");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("View list");
        listOfElementsIds.add("I__tiviewlist__205");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Filters icon");
        listOfElementsIds.add("ti-filter");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Filters label");
        listOfElementsIds.add("SPAN____209");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Add to favourites for item 1");
        listOfElementsIds.add("I__tiheart__226");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 1");
        listOfElementsIds.add("I__ticontrols__230");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 1");
        listOfElementsIds.add("I__tishopping__234");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 2");
        listOfElementsIds.add("I__tiheart__251");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 2");
        listOfElementsIds.add("I__ticontrols__255");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 2");
        listOfElementsIds.add("I__tishopping__259");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 3");
        listOfElementsIds.add("I__tiheart__273");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 3");
        listOfElementsIds.add("I__ticontrols__277");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 3");
        listOfElementsIds.add("I__tishopping__281");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 4");
        listOfElementsIds.add("I__tiheart__295");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 4");
        listOfElementsIds.add("I__ticontrols__299");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 4");
        listOfElementsIds.add("I__tishopping__303");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 5");
        listOfElementsIds.add("I__tiheart__317");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 5");
        listOfElementsIds.add("I__ticontrols__321");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 5");
        listOfElementsIds.add("I__tishopping__325");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 6");
        listOfElementsIds.add("I__tiheart__339");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 6");
        listOfElementsIds.add("I__ticontrols__343");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 6");
        listOfElementsIds.add("I__tishopping__347");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 7");
        listOfElementsIds.add("I__tiheart__361");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 7");
        listOfElementsIds.add("I__ticontrols__365");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 7");
        listOfElementsIds.add("I__tishopping__369");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 8");
        listOfElementsIds.add("I__tiheart__386");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 8");
        listOfElementsIds.add("I__ticontrols__390");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 8");
        listOfElementsIds.add("I__tishopping__394");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 9");
        listOfElementsIds.add("A__tooltip__407");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 9");
        listOfElementsIds.add("I__ticontrols__412");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 9");
        listOfElementsIds.add("A__tooltip__415");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("About us");
        listOfElementsIds.add("A____426");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Faq");
        listOfElementsIds.add("A____428");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Help");
        listOfElementsIds.add("A____430");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("My account");
        listOfElementsIds.add("A____432");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Blog");
        listOfElementsIds.add("A____434");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Contacts");
        listOfElementsIds.add("A____436");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email newsletter");
        listOfElementsIds.add("email_newsletter");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Address");
        listOfElementsIds.add("LI____441");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email");
        listOfElementsIds.add("LI____444");
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

        return this;
    }


    public AppliFashionHomePage validateElementsOnHomePageAfterSearchFOrBlackColor (String task, String browser, String width, String height, String deviceType) {

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
        listOfElementsIds.add("I__tiviewgrid__203");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("View list");
        listOfElementsIds.add("I__tiviewlist__205");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(false);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Filters icon");
        listOfElementsIds.add("ti-filter");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Filters label");
        listOfElementsIds.add("SPAN____209");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Add to favourites for item 1");
        listOfElementsIds.add("I__tiheart__226");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 1");
        listOfElementsIds.add("I__ticontrols__230");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 1");
        listOfElementsIds.add("I__tishopping__234");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to favourites for item 2");
        listOfElementsIds.add("I__tiheart__248");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to compare for item 2");
        listOfElementsIds.add("I__ticontrols__252");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to cart for item 2");
        listOfElementsIds.add("I__tishopping__256");
        listOfVisibleStatusesForWith1200.add(false);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("item 1 picture");
        listOfElementsIds.add("product_1");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("item 2 picture");
        listOfElementsIds.add("product_8");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("About us");
        listOfElementsIds.add("A____426");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Faq");
        listOfElementsIds.add("A____428");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Help");
        listOfElementsIds.add("A____430");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("My account");
        listOfElementsIds.add("A____432");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Blog");
        listOfElementsIds.add("A____434");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Contacts");
        listOfElementsIds.add("A____436");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email newsletter");
        listOfElementsIds.add("email_newsletter");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Address");
        listOfElementsIds.add("LI____441");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email");
        listOfElementsIds.add("LI____444");
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

       return this;
    }

    public AppliFashionHomePage validateElementsOnHomePageAfterClickOnItem (String task, String browser, String width, String height, String deviceType) {

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
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Cart");
        listOfElementsIds.add("DIV__dropdowndr__48");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Items in cart");
        listOfElementsIds.add("STRONG____50");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Product code");
        listOfElementsIds.add("SMALL____84");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("1st star");
        listOfElementsIds.add("I__iconstarvo__77");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("2nd star");
        listOfElementsIds.add("I__iconstarvo__78");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("3rd star");
        listOfElementsIds.add("I__iconstarvo__79");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("4th star");
        listOfElementsIds.add("I__iconstarvo__80");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Number of reviews");
        listOfElementsIds.add("EM__ratingcoun__82");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Add to Cart button");
        listOfElementsIds.add("A__btn__114");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Quantity editbox");
        listOfElementsIds.add("DIV__numbersrow__102");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Product info");
        listOfElementsIds.add("DIV__prodinfove__75");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("New price");
        listOfElementsIds.add("new_price");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Old price");
        listOfElementsIds.add("old_price");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Discount");
        listOfElementsIds.add("discount");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Quantity Plus button");
        listOfElementsIds.add("DIV__incbuttoni__104");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Quantity Minus button");
        listOfElementsIds.add("DIV__decbuttoni__105");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("Shoe Image");
        listOfElementsIds.add("shoe_img");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(true);

        listOfElementsNames.add("About us");
        listOfElementsIds.add("A____123");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Faq");
        listOfElementsIds.add("A____125");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Help");
        listOfElementsIds.add("A____127");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("My account");
        listOfElementsIds.add("A____129");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Blog");
        listOfElementsIds.add("A____131");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Contacts");
        listOfElementsIds.add("A____133");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email newsletter");
        listOfElementsIds.add("email_newsletter");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Address");
        listOfElementsIds.add("LI____138");
        listOfVisibleStatusesForWith1200.add(true);
        listOfVisibleStatusesForWith768.add(true);
        listOfVisibleStatusesForWith500.add(false);

        listOfElementsNames.add("Email");
        listOfElementsIds.add("LI____141");
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

        return this;
    }


    public boolean hackathonReporter(String task, String testName, String domId, String browser, String width, String height, String device, boolean comparisonResult) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("target/Traditional-V2-TestResults.txt", true))){
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

    public AppliFashionHomePage validateNumberOfFoundItems (String expectedNumberOfFoundItems, String task, String browser, String width, String height, String deviceType) throws InterruptedException {
        hackathonReporter(task, "Expected Number Of Found Items should be " + expectedNumberOfFoundItems + ", actual number is: " + listOfSearchedItems.size(), "XPATH = //div[@id='product_grid']/div", browser, width, height, deviceType,
                expectedNumberOfFoundItems.equalsIgnoreCase(String. valueOf(listOfSearchedItems.size())));
        return this;
    }

    public AppliFashionHomePage validateSelectedValueOfSizeOption (String expectedSelectedOption, String task, String browser, String width, String height, String deviceType) throws InterruptedException {
        hackathonReporter(task, "Expected Value of Selected Size Option should be " + expectedSelectedOption + ", actual Value is: " + selectedOptionInSizeDropdown.getText(), "XPATH = //div[@class='nice-select wide']/span", browser, width, height, deviceType,
                expectedSelectedOption.equalsIgnoreCase(selectedOptionInSizeDropdown.getText()));
        return this;
    }

    public AppliFashionHomePage validateValueOfNewPrice (String expectedValue, String task, String browser, String width, String height, String deviceType) throws InterruptedException {
        hackathonReporter(task, "Expected Value of New Price should be " + expectedValue + ", actual Value is: " + newPrice.getText(), "new_price", browser, width, height, deviceType,
                expectedValue.equalsIgnoreCase(newPrice.getText()));
        return this;
    }

    public AppliFashionHomePage validateIfShoeImageIsDisplayed (String task, String browser, String width, String height, String deviceType) throws InterruptedException {
        Boolean result = false;
        String value = driver.findElement(By.id("shoe_img")).getAttribute("style");
        if (!value.equalsIgnoreCase("")){
            result = true;
        }
        hackathonReporter(task, "Shoe image should be displayed, is it really displayed ?: " + result, "'shoe_img' with attribute 'style'", browser, width, height, deviceType,
                result);
        return this;
    }

}