package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalscenario/form.feature",
		glue= {"src/test/java/stepDefinitions/steps.java"},
	    //dryRun=true, (used to check whether all feature file statement have corresponding step definition)
		monochrome=true, //(console output of the cucumber will be in most readable form)
		format= {"pretty", "html:target"}
		)
public class TestRunner {

}
