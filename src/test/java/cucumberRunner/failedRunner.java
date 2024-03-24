package cucumberRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




//@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed_scenarios.txt", 
glue="stepdefinitions", monochrome=true, dryRun=false,
plugin= {"pretty", "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class failedRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}