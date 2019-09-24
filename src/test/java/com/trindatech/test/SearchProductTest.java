package com.trindatech.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/test/SearchProduct.feature"},
		glue = {"com.trindatech.test", 
				"com.trindatech.core"},
		monochrome = true,
		plugin = {"pretty"},
		dryRun = false)
public class SearchProductTest {

}
