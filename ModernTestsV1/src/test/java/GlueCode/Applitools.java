package GlueCode;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.fluent.Target;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import cucumber.api.java.en.Given;

public class Applitools {

    @Given("^I make Applitools Visual Test validation with screenshot name: \"([^\"]*)\"")
    public void takeSnapshot(String screenshotName) {

        Eyes eyes = null;
        ClassicRunner eyesRunner = null;
        try {
            BatchInfo batch = new BatchInfo("Demo batch");
            // Initialize the Runner for your test.
            eyesRunner = new ClassicRunner();
            // Initialize the eyes SDK
            eyes = new Eyes(eyesRunner);
            eyes.setApiKey("H2MZ0YiQgCtDxMgCgsGqQAKp3qykfmqj501qddCGrjY110");
            eyes.setBatch(batch);
            eyes.
                    open(GeneralStepDefinitions.getDriver(), "AppliFashion", screenshotName, new RectangleSize(800, 600));

            //eyes.check(Target.window().fully().withName(screenshotName));
            eyes.checkWindow(screenshotName);
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


}
