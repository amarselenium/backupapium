package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "src/test/resources/Features/lunch.feature"}, 
        glue = {"stepdefinations"},
		plugin = {"html:target/cucumber-html-report","pretty", "json:target/cucumber-reports/Cucumber.json"},monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

}
