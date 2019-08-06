package discovery_Automation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/Feature"
			,glue={"src/test/java/discovery_Automation/StepDefinitions"}
			)

	public class Runner {

	}
	
	

