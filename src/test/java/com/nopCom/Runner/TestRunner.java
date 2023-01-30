package com.nopCom.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/AddCustomer.feature",
		glue="com.nopCom.stepDefinitions",
		dryRun = false,
		monochrome = true,
		publish = true
		)
public class TestRunner {

	
	
}
