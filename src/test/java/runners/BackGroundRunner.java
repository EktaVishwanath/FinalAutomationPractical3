package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\features\\SetBackGround.feature",
		//features ="classpath:features",
		glue = "steps",
		tags = "@Regression",
		monochrome = true,
		dryRun = false,
		//plugin is dedicated for what type of report that you want to genetate
		plugin = {
				"pretty",//report type//
				"html:target/cucumber",// next report in html and save in target folder as cucumber//
				"json:target/cucumber.json"//next jason report then save in target folder as cucumber.jason
		}
		)

public class BackGroundRunner {

}
