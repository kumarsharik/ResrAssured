package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ManageWaitTime;
import utilities.PropertyFileReader;

public class WeatherPage {
	public WebDriver idriver;

	public WeatherPage(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(idriver, this);
	}

	public String cityname = PropertyFileReader.readProperty("cityName");
	private String cityxpath = "//div[text()='" + cityname + "']";

	private WebElement cityName() {

		WebElement cityname=idriver.findElement(By.xpath(cityxpath));
		return cityname;
	}

	@FindBy(id = "searchBox")
	@CacheLookup
	private WebElement searchBox;

	@FindBy(xpath = "//span/b[contains(text(),'Humidity:')]")
	@CacheLookup
	private WebElement humidity;

	@FindBy(xpath = "//span/b[contains(text(),'Temp in Degrees:')]")
	@CacheLookup
	private WebElement temInDegree;
	
	
	public void searchAndPinDownCityName(String city) {
		ManageWaitTime.waitForElementToBeVisible(searchBox, 10, 500);
		searchBox.sendKeys(city);
	}
	public void clickOnCityName() {
		ManageWaitTime.waitForElementToBeVisible(cityName(), 10, 500);
		cityName().click();	
	}
	public HashMap<String, Double> getCityHumadityAndTempInDegree() {
		HashMap<String, Double> UIWeatherData= new HashMap<String, Double>();
		String UIhumidity=humidity.getText().replaceAll("[^0-9]", "").trim();
		String UITemInDegree=temInDegree.getText().replaceAll("[^0-9]", "").trim();
		UIWeatherData.put("humidityOnUI", Double.parseDouble(UIhumidity));
		UIWeatherData.put("tempinDegreeOnUI", Double.parseDouble(UITemInDegree));
		return UIWeatherData;
	}
}
