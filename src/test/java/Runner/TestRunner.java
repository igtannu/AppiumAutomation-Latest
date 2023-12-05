package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/", glue = { "StepDef", "hooks" },
plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
dryRun = false,
				tags="@test"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
