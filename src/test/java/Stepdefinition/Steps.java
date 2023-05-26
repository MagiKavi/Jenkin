package Stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.beust.ah.A;

import Baseclass.Baseclass;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Baseclass {

	  PageObjectManager obj = new PageObjectManager (driver);
	@Given("^User User Launch the \"([^\"]*)\" Browser$")
	public void user_User_Launch_the_Browser(String arg1) throws Throwable {
        BrowserLaunch(arg1);	   
	}
	@Given("User Navigate the Url {string}")
	public void user_navigate_the_url(String string) throws Exception {
	 geturl(string );
	}
	@Given("User Type {string} in the Search box")
	public void user_type_in_the_search_box(String keyword) {
		boolean register = obj.getHomepage().SkipButton.isDisplayed();
		if (register) {
			obj.getHomepage().SkipButton.click();
		}
		obj.getProductpage().ProductSearch.sendKeys(keyword);
	}
	
	@Given("User Will Click One Of Them In Suggestions Lists Are Displayed")
	public void user_will_click_one_of_them_in_suggestions_lists_are_displayed() throws InterruptedException {
	   
		Thread.sleep(2000);
		 

		for (WebElement Each : obj.getProductpage().search) {

			Each.findElement(By.xpath("./div/a")).click();
			break;
		}
	}
	   
	
	@Given("User Filter All Result By The Online Only Filter")
	public void user_filter_all_result_by_the_online_only_filter() {
	   
	
		mousehover(obj.getProductpage().Connectivity);
		obj.getProductpage().Connectivity.click();
		obj.getProductpage().WifiConnectivity.click();
	}
	
	@Given("User Select One Of The Results")
	public void user_select_one_of_the_results() throws InterruptedException {
		Thread.sleep(2000);
		
		for (WebElement Each : obj.getProductpage().ProductList) {
			Each.findElement(By.xpath(".//descendant::a")).click();
			break;
		}

	}
	   
	
	@Then("User Checkout The Order")
	public void user_checkout_the_order() {
	   
		String windowHandle = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator2 = handle.iterator();
		while (iterator2.hasNext()) {
			String handleID = (String) iterator2.next();

			if (!windowHandle.equalsIgnoreCase(handleID)) {

				driver.switchTo().window(handleID);
		obj.getProductpage().clickButton.click();
			}
		}
	}
	@Then("User Place The Order")
	public void user_place_the_order() {
		obj.getProductpage().clickButton2.click();
	}
	   
	@Then("User Enter Random Email\"magesh.nomercy@gmail.com\" and Phone Number")
	public void user_enter_random_email_magesh_nomercy_gmail_com_and_phone_number() throws InterruptedException {
		Thread.sleep(2000);
		obj.getProductpage().Email.sendKeys("magesh.nomercy@gmail.com");
		obj.getProductpage().clickButton3.click();
	}

	}


