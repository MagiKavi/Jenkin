package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class HomePage extends Baseclass{


	
	public HomePage(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver, this);
       }
	
	@FindBy(xpath = "//button[text()='✕']")
	public  WebElement SkipButton ;
}
