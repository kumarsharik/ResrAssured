package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ManageWaitTime;
import utilities.PropertyFileReader;

public class HomePage {
	public WebDriver idriver;
	
	public HomePage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(idriver, this);
		
	}
	@FindBy(xpath = "//a[@id='h_sub_menu']")
	@CacheLookup
	WebElement expandMenu;
	
	@FindBy(xpath = "//div[@id='subnav']//a[text()='WEATHER']")
	@CacheLookup
	WebElement weatherLink;
	
	public void navigateToHomeScreen(String url) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "../RestAPITest/Drivers/chromedriver.exe");
		 */
	idriver.get(url);
	}
	public void navigateToWeatherDetailsPage() {
		ManageWaitTime.waitForElementToBeVisible(weatherLink, 10, 500);
		weatherLink.click();
		}
}
