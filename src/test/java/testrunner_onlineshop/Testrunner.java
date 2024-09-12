package testrunner_onlineshop;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


import utility_onlineshop.Onlineshop_Base;

@CucumberOptions(features= {"src/test/resourcess/onlineshopAllFeature"}, plugin= {"json:target/cucumber.json"},
glue="stepdefination_onlineshop")//tags= {"@sign"})

public class Testrunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void StartURL() {
		Onlineshop_Base start= new Onlineshop_Base();
		start.OnlineshopBrowserSetup();
	}
	
	@AfterTest
	public void CloseBrowser() {
		Onlineshop_Base start= new Onlineshop_Base();
		start.driver.quit();
		
	}
	
	

}
