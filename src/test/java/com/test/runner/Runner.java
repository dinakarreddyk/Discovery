package com.test.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/Feature",
			glue={"src/test/java/discovery_Automation/StepDefinitions"},
			tags= {"@saqw"}
			)

	public class Runner {

	public static void main(String[] args) {
	//	Thread.sleep(1000);
	}

	}
	
	

