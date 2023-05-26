package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.HomePage;
import Locators.ProductPage;

public class PageObjectManager extends Baseclass {

	public PageObjectManager (WebDriver driver) {
		
		this.driver = driver;
	}
	
private HomePage HomePage;

public HomePage getHomepage() {
	
	if (HomePage == null) {
		
		HomePage = new HomePage(driver);
	}
	return HomePage;
}

	
private ProductPage Productpage;

public ProductPage getProductpage() {
	
	if (Productpage == null) {
		Productpage = new ProductPage(driver);
	}
	return Productpage;
}
	
	
}




