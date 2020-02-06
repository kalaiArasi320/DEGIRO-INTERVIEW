package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalscenario/form.feature",
		glue= {"stepDefinitions"}
		)
public class TestRunner {

}
