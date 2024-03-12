package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",
				glue="StepDefinitions",
				tags={"@MobileTest,@RegTest"},
				plugin={"pretty","html:target/cucumber","json:target/cucumber.json",
						"junit:target/cukes.xml"},
				dryRun=false,
				monochrome=true,
				strict=true
				)


public class LoginRunner extends AbstractTestNGCucumberTests{

}
