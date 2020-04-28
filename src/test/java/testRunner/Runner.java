package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Author: Amaresh
 *
 * Reading feature file and executing attached gluecode
 *
 */

@CucumberOptions(
		features = { "src/test/resources/Features"}, 
        glue = {"stepdefinations"},
		plugin = {"html:target/cucumber-html-report","pretty", "json:target/cucumber-reports/Cucumber.json"},monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

}
