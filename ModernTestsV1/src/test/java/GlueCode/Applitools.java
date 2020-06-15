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

public class Applitools {

    @Given("^I make Applitools Visual Test validation running Locally with test name: \"([^\"]*)\" and step name: \"([^\"]*)\"")
    public void takeSnapshot(String testName, String stepName) {

        Eyes eyes = null;
        ClassicRunner eyesRunner = null;
        try {
            BatchInfo batch = new BatchInfo("UFG Hackathon");
            // Initialize the Runner for your test.
            eyesRunner = new ClassicRunner();
            // Initialize the eyes SDK
            eyes = new Eyes(eyesRunner);
            eyes.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
            eyes.setBatch(batch);
            eyes.
                    open(GeneralStepDefinitions.getDriver(), "AppliFashion", testName, new RectangleSize(800, 600));

            //eyes.check(Target.window().fully().withName(screenshotName));
            eyes.checkWindow(stepName);
            eyes.closeAsync();
        } finally {
           eyes.abortIfNotClosed();
            // we pass false to this method to suppress the exception that is thrown if we
            // find visual differences
            TestResultsSummary allTestResults = eyesRunner.getAllTestResults();

            // Print results
            System.out.println(allTestResults);

//            TestResultsSummary allTestResults = GeneralStepDefinitions.getVisualGridRunner().getAllTestResults(false);
//            System.out.println(allTestResults);
        }
    }

    @Given("^I make Applitools Visual Test validation running via UltraFast Grid with test name: \"([^\"]*)\" and step name: \"([^\"]*)\"")
    public void takeSnapshotUltraFastGrid(String testName, String stepName) {

        //        Eyes eyes = null;
        //        VisualGridRunner visualGridRunner = null;


        VisualGridRunner visualGridRunner = new VisualGridRunner(10);
        Eyes eyes = new Eyes(visualGridRunner);

        // Initialize eyes Configuration
        Configuration config = new Configuration();

        // You can get your api key from the Applitools dashboard
        config.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");

        // create a new batch info instance and set it to the configuration
        config.setBatch(new BatchInfo("UFG Hackathon"));

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

        try {
            //BatchInfo batch = new BatchInfo("UFG Hackathon");
            // Initialize the Runner for your test.
            //visualGridRunner = new VisualGridRunner();
            // Initialize the eyes SDK
            //eyes = new Eyes(visualGridRunner);
            //eyes.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
            //eyes.setBatch(batch);
            eyes.
                    open(GeneralStepDefinitions.getDriver(), "AppliFashion", testName, new RectangleSize(800, 600));

            //eyes.check(Target.window().fully().withName(screenshotName));
            eyes.checkWindow(stepName);
            eyes.closeAsync();
        } finally {
            eyes.abortIfNotClosed();
            // we pass false to this method to suppress the exception that is thrown if we
            // find visual differences
            TestResultsSummary allTestResults = visualGridRunner.getAllTestResults();

            // Print results
            System.out.println(allTestResults);

            //            TestResultsSummary allTestResults = GeneralStepDefinitions.getVisualGridRunner().getAllTestResults(false);
            //            System.out.println(allTestResults);


        }
    }


}
