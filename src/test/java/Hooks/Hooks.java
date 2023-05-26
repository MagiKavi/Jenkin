package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass{

	@Before
	public  void BeforeHooks() {          //it will run before and after the scenario
System.out.println("Am before Hooks");
	}
	
	@After
	public void AfterHooks(Scenario scenario) {
             byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
   scenario.attach(screenshot, "image/png", "screenshot");
   driver.quit();
	}
}
