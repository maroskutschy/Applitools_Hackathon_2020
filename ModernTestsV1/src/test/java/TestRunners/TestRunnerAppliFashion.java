package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
		features = "classpath:Feature_Files/AppliFashion",
		glue={"GlueCode"},
		monochrome = true,
		format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json", "rerun:rerun.txt"},
		tags = {}
)

public class TestRunnerAppliFashion extends AbstractTestNGCucumberTests  {

	@Parameters ({"operatingSystem", "browser", "link"})
	@BeforeClass
	public void beforeClass (String operatingSystem, String browser, String link) {

		TestDefaultValues.setOperatingSystem( operatingSystem );
 		TestDefaultValues.setBrowser( browser );
		TestDefaultValues.setLink( link );
	}

}
