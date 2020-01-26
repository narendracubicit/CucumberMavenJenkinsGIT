package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"steps"}, features={"src/test/resources"}, plugin = {"pretty" ,
        "usage:target/cucumberreport/cucumber-usage.json",
        "html:target/cucumberreport/cucumber-report-html" ,
        "json:target/cucumber.json" ,
        "junit:target/cucumberreport/cucumber.xml"}
		)
public class TestRunner {
	
	
}
