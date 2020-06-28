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
    public static VisualGridRunner visualGridRunner;
    public static BatchInfo batch;
    private String operatingSystem = TestDefaultValues.getOperatingSystem();
    private String browser = TestDefaultValues.getBrowser();
    private String link = TestDefaultValues.getLink();

    public static boolean collectedResultOfValidation = true;

    @Before
    public void beforeScenario() throws Throwable {
        collectedResultOfValidation = true;
    }

//    @Before
//    public void openBrowserWithLink(Scenario scenario) throws Throwable {
//        switch (browser) {
//            case "Firefox" :
//                if (operatingSystem.equalsIgnoreCase("Windows")) {
//                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/"+ operatingSystem +"/geckodriver.exe");
//                } else {
//                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/" + operatingSystem + "/geckodriver");
//                }
//                driver = new FirefoxDriver();
//                break;
//            case "Chrome" :
//                if (operatingSystem.equalsIgnoreCase("Windows")) {
//                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/" + operatingSystem + "/chromedriver.exe");
//                } else {
//                    //TODO : when failing via IntelliJ - change working directory in Run Configuration to: ModernTestV1
//                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/" + operatingSystem + "/chromedriver");
//                }
//                // DISABLE CHROME NOTIFICATIONS:
//                // Create object of HashMap Class
//                Map<String, Object> prefs = new HashMap<String, Object>();
//                // Set the notification setting it will override the default setting
//                prefs.put("profile.default_content_setting_values.notifications", 2);
//                // Create object of ChromeOption class
//                ChromeOptions options = new ChromeOptions();
//                // Set the experimental option
//                options.setExperimentalOption("prefs", prefs);
//                driver = new ChromeDriver(options);
//                break;
//        }
//        driver.get(link);
//        if (scenario.getName().contains("Applitools")) {
//            batch = new BatchInfo(scenario.getName().replace(" - Applitools", ""));
//            visualGridRunner = new VisualGridRunner(10);
//            eyes = new Eyes(visualGridRunner);
//            // Initialize eyes Configuration
//            Configuration config = new Configuration();
//            // You can get your api key from the Applitools dashboard
//            config.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
//            config.setBatch(batch);
//            // Add browsers with different viewports
//            config.addBrowser(1200, 700, BrowserType.CHROME);
//            config.addBrowser(1200, 700, BrowserType.FIREFOX);
//            config.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM);
//            config.addBrowser(768, 700, BrowserType.CHROME);
//            config.addBrowser(768, 700, BrowserType.FIREFOX);
//            config.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM);
//            // Add mobile emulation devices in Portrait mode
//            config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
//            //config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);
//            // Set the configuration object to eyes
//            eyes.setConfiguration(config);
//        }
//    }

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
                //System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/" + operatingSystem + "/msedgedriver.exe");
                // Setup the Edge chromium driver options for this operating system
//                final ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.setBinary("c:/Windows/SystemApps/Microsoft.MicrosoftEdge_8wekyb3d8bbwe/MicrosoftEdge.exe");
//                chromeOptions.setExperimentalOption("useAutomationExtension", false);
//                chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

                final EdgeOptions edgeOptions = new EdgeOptions();
                 //final WebDriver webDriver = new EdgeDriver(chromeOptions);
                driver = new EdgeDriver(edgeOptions);
                //driver = new ChromeDriver(chromeOptions);
        }
        driver.get(link);
//        driver.manage().window().setPosition(new Point(0,0));
//        driver.manage().window().setSize(new Dimension(Integer.parseInt(width), Integer.parseInt(height)));
//        System.out.println(driver.manage().window().getSize());
//        System.out.println("Resolution is: " + width + ", " + height);

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

//        System.out.println(driver.manage().window().getSize());
//        System.out.println("Resolution is: " + width + ", " + height);

    }



    @After
    public void closeBrowser(Scenario scenario) {
        driver.quit();
        if (scenario.getName().contains("Applitools")) {
            try {
                //Choose if a difference in screenshot should fail your test, e.g. false will not fail your test
                TestResults result = eyes.close(true);
                String resultStr;
                String url;
                if (result == null) {
                    resultStr = "Test aborted";
                    url = "undefined";
                } else {
                    url = result.getUrl();
                    int totalSteps = result.getSteps();
                    if (result.isNew()) {
                        resultStr = "New Baseline Created: " + totalSteps + " steps";
                    } else if (result.isPassed()) {
                        resultStr = "All steps passed:     " + totalSteps + " steps";
                    } else {
                        resultStr = "Test Failed     :     " + totalSteps + " steps";
                        resultStr += " matches=" +  result.getMatches();      /*  matched the baseline */
                        resultStr += " missing=" + result.getMissing();       /* missing in the test*/
                        resultStr += " mismatches=" + result.getMismatches(); /* did not match the baseline */
                    }
                }
                resultStr += "\n" + "results at " + url;
                System.out.println(resultStr);
            } finally {
                eyes.abortIfNotClosed();
            }
        }
        System.out.println("collectedResultOfValidation is: " + collectedResultOfValidation);
        Assert.assertTrue("One or more elements were not displayed, check statuses Fail in 'Traditional-V1-TestResults.txt' in the root of the project", collectedResultOfValidation);
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

}
