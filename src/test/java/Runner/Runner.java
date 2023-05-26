package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\Features", glue = {"Stepdefinition","Hooks"},
plugin = {"html:target\\report\\flipkart_report.html",
		"json:target\\report\\Flipkart_JReport.json",
		"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = false,
stepNotifications = true)
public class Runner {

}
