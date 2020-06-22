package GlueCode;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.fluent.Target;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import pages.AppliFashionHomePage;

public class Applitools {

    Eyes eyes = GeneralStepDefinitions.getEyes();

    @Given("^I make Applitools Visual Test validation running via UltraFast Grid with test name: \"([^\"]*)\" and step name: \"([^\"]*)\"")
    public void takeSnapshotUltraFastGrid(String testName, String stepName) {
         eyes.open(GeneralStepDefinitions.getDriver(), "AppliFashion", testName, new RectangleSize(800, 600));
         eyes.checkWindow(stepName);
         eyes.closeAsync();
     }

    @Given("^I make Applitools Visual Test validation of region: \"([^\"]*)\" running via UltraFast Grid with test name: \"([^\"]*)\" and step name: \"([^\"]*)\"")
    public void takeSnapshotUltraFastGridRegion(String region, String testName, String stepName) {
        eyes.open(GeneralStepDefinitions.getDriver(), "AppliFashion", testName, new RectangleSize(800, 600));
        eyes.checkRegion(By.id(region),stepName);
        eyes.closeAsync();
    }

//    VisualGridRunner visualGridRunner = GeneralStepDefinitions.getVisualGridRunner();
//    BatchInfo batch;
//    @Given ("^I create Applitools Batch with Name \"([^\"]*)\" and setup Applitools Eyes")
//    public void createApplitoolsBatch(String batchName) throws Throwable {
//        batch = new BatchInfo("UFG Hackathon");
//        visualGridRunner = new VisualGridRunner(10);
//        eyes = new Eyes(visualGridRunner);
//
//        // Initialize eyes Configuration
//        Configuration config = new Configuration();
//
//        // You can get your api key from the Applitools dashboard
//        config.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
//
//        // create a new batch info instance and set it to the configuration
//        //config.setBatch(new BatchInfo("UFG Hackathon"));
//        //config.setBatch(GeneralStepDefinitions.getBatchInfo());
//        config.setBatch(batch);
//
//        // Add browsers with different viewports
//        config.addBrowser(1200, 700, BrowserType.CHROME);
//        config.addBrowser(1200, 700, BrowserType.FIREFOX);
//        config.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM);
//        config.addBrowser(768, 700, BrowserType.CHROME);
//        config.addBrowser(768, 700, BrowserType.FIREFOX);
//        config.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM);
//
//        // Add mobile emulation devices in Portrait mode
//        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
//        //config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);
//
//        // Set the configuration object to eyes
//        eyes.setConfiguration(config);
//    }
//
//
//    @Given("^I make Applitools Visual Test validation running Locally with test name: \"([^\"]*)\" and step name: \"([^\"]*)\"")
//    public void takeSnapshot(String testName, String stepName) {
//
//        Eyes eyes = null;
//        ClassicRunner eyesRunner = null;
//        try {
//            //BatchInfo batch = new BatchInfo("UFG Hackathon");
//            //BatchInfo batch = GeneralStepDefinitions.getBatchInfo()
//            // Initialize the Runner for your test.
//            eyesRunner = new ClassicRunner();
//            // Initialize the eyes SDK
//            eyes = new Eyes(eyesRunner);
//            eyes.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
//            eyes.setBatch(batch);
//            eyes.
//                    open(GeneralStepDefinitions.getDriver(), "AppliFashion", testName, new RectangleSize(800, 600));
//
//            //eyes.check(Target.window().fully().withName(screenshotName));
//            eyes.checkWindow(stepName);
//            eyes.closeAsync();
//        } finally {
//            eyes.abortIfNotClosed();
//            // we pass false to this method to suppress the exception that is thrown if we
//            // find visual differences
//            TestResultsSummary allTestResults = eyesRunner.getAllTestResults();
//
//            // Print results
//            System.out.println(allTestResults);
//
//            //            TestResultsSummary allTestResults = GeneralStepDefinitions.getVisualGridRunner().getAllTestResults(false);
//            //            System.out.println(allTestResults);
//        }
//    }

}
