package runner;



import org.junit.runner.RunWith;

import cucumber.api.junit.cucumber;
import cucumber.api.CucumberOptions;

import cucumber.api.cucumberOptions;

import cucumber.api.junit.cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalscenario/form.feature",
		glue= {"stepDefinitions"}
		)
public class TestRunner {

}
