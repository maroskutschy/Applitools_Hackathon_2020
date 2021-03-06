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
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    @Before
    public void openBrowserWithLink(Scenario scenario) throws Throwable {
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
                driver = new ChromeDriver(options);
                break;
        }
        driver.get(link);
        if (scenario.getName().contains("Applitools")) {
            batch = new BatchInfo(scenario.getName().replace(" - Applitools", ""));
            visualGridRunner = new VisualGridRunner(10);
            eyes = new Eyes(visualGridRunner);
            // Initialize eyes Configuration
            Configuration config = new Configuration();
            // You can get your api key from the Applitools dashboard
            config.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
            config.setBatch(batch);
            // Add browsers with different viewports
            config.addBrowser(1200, 700, BrowserType.CHROME);
            config.addBrowser(1200, 700, BrowserType.FIREFOX);
            config.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM);
            config.addBrowser(768, 700, BrowserType.CHROME);
            config.addBrowser(768, 700, BrowserType.FIREFOX);
            config.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM);
            // Add mobile emulation devices in Portrait mode
            config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
            //config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);
            // Set the configuration object to eyes
            eyes.setConfiguration(config);
        }
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
