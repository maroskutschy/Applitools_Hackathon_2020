package GlueCode;

import TestRunners.TestDefaultValues;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;
import java.util.Map;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import org.testng.annotations.BeforeSuite;
import pages.AppliFashionHomePage;

public class GeneralStepDefinitions {

    public static WebDriver driver;
    public static Eyes eyes;
    public static VisualGridRunner runner;
    public static BatchInfo batch;
    public static EyesRunner eyesRunner;
    private String operatingSystem = TestDefaultValues.getOperatingSystem();
    private String browser = TestDefaultValues.getBrowser();
    private String link = TestDefaultValues.getLink();

    @Before
    public void openBrowserWithLink() throws Throwable {

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
                    System.setProperty("webdriver.chrome.driver", "ModernTestsV1/src/test/resources/drivers/" + operatingSystem + "/chromedriver");
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

//                // Create a runner with concurrency of 1
//                VisualGridRunner runner = new VisualGridRunner(1);
//                // Create Eyes object with the runner, meaning it'll be a Visual Grid eyes.
//                eyes = new Eyes(runner);
//                setUp(eyes);

                // Must be before ALL tests (at Class-level)
//                batch = new BatchInfo("Demo batch");
//                // Initialize the Runner for your test.
//                eyesRunner = new ClassicRunner();
//                // Initialize the eyes SDK
//                eyes = new Eyes(runner);
//                eyes.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
//                eyes.setBatch(batch);
                driver = new ChromeDriver(options);
                break;
        }
        driver.get(link);

    }

    @After
    public void closeBrowser() {

        driver.quit();

        // If the test was aborted before eyes.close was called, ends the test as
        // aborted.
//        eyes.abortIfNotClosed();
//
//        // Wait and collect all test results
//        TestResultsSummary allTestResults = runner.getAllTestResults();
//
//        // Print results
//        System.out.println(allTestResults);



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

    public static VisualGridRunner getVisualGridRunner() {
        return runner;
    }

    public static void setUp(Eyes eyes) {

        // Initialize eyes Configuration
        Configuration config = new Configuration();

        // You can get your api key from the Applitools dashboard
        config.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");

        // create a new batch info instance and set it to the configuration
        config.setBatch(new BatchInfo("Ultrafast Batch"));

        // Add browsers with different viewports
        config.addBrowser(800, 600, BrowserType.CHROME);
        config.addBrowser(700, 500, BrowserType.FIREFOX);
        config.addBrowser(1600, 1200, BrowserType.IE_11);
        config.addBrowser(1024, 768, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(800, 600, BrowserType.SAFARI);

        // Add mobile emulation devices in Portrait mode
        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);

        // Set the configuration object to eyes
        eyes.setConfiguration(config);

    }
}
