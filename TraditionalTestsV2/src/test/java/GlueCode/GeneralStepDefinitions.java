package GlueCode;

import TestRunners.TestDefaultValues;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;

public class GeneralStepDefinitions {

    public static WebDriver driver;
    public static Eyes eyes;
    private String operatingSystem = TestDefaultValues.getOperatingSystem();
    private String link = TestDefaultValues.getLink();

    public static boolean collectedResultOfValidation = true;

    @Before
    public void beforeScenario() throws Throwable {
        collectedResultOfValidation = true;
    }

    @Given("I open \"([^\"]*)\" page with \"([^\"]*)\" browser and \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height and \"([^\"]*)\" device type")
    public void openSpecifiedBrowserWithSpecifiedViewPport(String page, String browser, String width, String height, String deviceType) throws Throwable {
        switch (browser) {
            case "Firefox" :
                if (operatingSystem.equalsIgnoreCase("Windows")) {
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/"+ operatingSystem +"/geckodriver.exe");
                } else {
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/" + operatingSystem + "/geckodriver");
                }
                driver = new FirefoxDriver();
                break;
            case "Chrome" :
                if (operatingSystem.equalsIgnoreCase("Windows")) {
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/" + operatingSystem + "/chromedriver.exe");
                } else {
                    //TODO : when failing via IntelliJ - change working directory in Run Configuration to: ModernTestV1
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/" + operatingSystem + "/chromedriver");
                }
                // DISABLE CHROME NOTIFICATIONS:
                // Create object of HashMap Class
                Map<String, Object> prefs = new HashMap<String, Object>();
                // Set the notification setting it will override the default setting
                prefs.put("profile.default_content_setting_values.notifications", 2);
                // Create object of ChromeOption class
                ChromeOptions options = new ChromeOptions();
                // Set the experimental option
                options.setExperimentalOption("prefs", prefs);
                //options.addArguments("--window-size=" + width +"," + height);
                driver = new ChromeDriver(options);
                break;
            case "Edge Chromium" :
                if (operatingSystem.equalsIgnoreCase("Windows")) {
                    System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/"+ operatingSystem +"/msedgedriver.exe");
                } else {
                    System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/" + operatingSystem + "/msedgedriver");
                }
                final EdgeOptions edgeOptions = new EdgeOptions();
                //final WebDriver webDriver = new EdgeDriver(chromeOptions);
                driver = new EdgeDriver(edgeOptions);
                //driver = new ChromeDriver(chromeOptions);
        }
        driver.get(link);
        ArrayList padding = (ArrayList)((JavascriptExecutor) driver).executeScript(
                "return [window.outerWidth-window.innerWidth, window.outerHeight-window.innerHeight];");
        // set the inner size of the window to width x height (scrollbar included)
        driver.manage().window().setSize(new Dimension(
                (int)(Integer.parseInt(width) + (Long)padding.get(0)),
                (int)(Integer.parseInt(height) + (Long)padding.get(1))
        ));
     }

    @After
    public void closeBrowser(Scenario scenario) {
        driver.quit();
        System.out.println("collectedResultOfValidation is: " + collectedResultOfValidation);
        Assert.assertTrue("One or more elements were not correctly displayed/hidden, check statuses Fail in 'Traditional-V2-TestResults.txt' in the target folder of the project", collectedResultOfValidation);
    }

    @Given("^I maximize the browser$")
    public void selectChecksbox() throws Throwable {
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Eyes getEyes() {
        return eyes;
    }

    @Given("^I resize the browser to \"([^\"]*)\" viewport width and \"([^\"]*)\" viewport height$")
    public void resizeTheBrowser(String width, String height) throws Throwable {
        driver.manage().window().setPosition(new Point(0,0));
        // Setting inner window size, because this is real size of the window which we want to test, outer size with all other browser's
        // elements (title bar, bookmarks bar, borders etc) will be bigger = via driver.manage().window().getSize() you will have highre number
        // but when using http://howbigismybrowser.com/ you will get exact values as you specify
        ArrayList padding = (ArrayList)((JavascriptExecutor) driver).executeScript(
                "return [window.outerWidth-window.innerWidth, window.outerHeight-window.innerHeight];");
        // set the inner size of the window to width x height (scrollbar included)
        driver.manage().window().setSize(new Dimension(
                (int)(Integer.parseInt(width) + (Long)padding.get(0)),
                (int)(Integer.parseInt(height) + (Long)padding.get(1))
        ));
        System.out.println("Resolution is: " + width + ", " + height);
    }

}
