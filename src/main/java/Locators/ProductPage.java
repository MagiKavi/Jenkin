package Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class ProductPage extends Baseclass {

	private WebDriver driver;

	public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }
	
	@FindBy(xpath = "//input[contains(@title,'Search for products')]")
	public  WebElement ProductSearch ;

	@FindBy(xpath = "//form[@action='/search']/ul/li" )
	public List<WebElement>  search;
	
	@FindBy(xpath = "//div[text()='Connectivity']")
	public  WebElement Connectivity  ;

	@FindBy(xpath = "//div[@title='Wi-Fi+4G']")
	public  WebElement WifiConnectivity  ;
	
	@FindBy(xpath = "//a[text()='Home']/ancestor::div[5]/following-sibling::div")
	public  List<WebElement> ProductList;
	
	@FindBy(xpath = "//ul/li/button")
	public  WebElement clickButton;

	@FindBy(xpath = "//form/button")
	public  WebElement clickButton2;
	
	@FindBy(xpath = "//form/div/input")
	public  WebElement Email;
	
	@FindBy(xpath = "//form/div/input")
	public  WebElement clickButton3;

}
