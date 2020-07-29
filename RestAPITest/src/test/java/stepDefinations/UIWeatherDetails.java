package stepDefinations;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pageObjects.HomePage;
import pageObjects.WeatherPage;
import utilities.JSONReader;
import utilities.PropertyFileReader;
import utilities.WeatherComparision;

public class UIWeatherDetails {
	
	public WebDriver driver;
	public WeatherPage wp;
	public HomePage hp;
	public HashMap<String, Double> UIdata;
	public HashMap<String, Double> APIdata;
	public Response response;
	String url;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "../RestAPITest/Drivers/chromedriver.exe");
		  
		  driver= new ChromeDriver();
		  
		  hp= new HomePage(driver);
		  hp.navigateToHomeScreen(PropertyFileReader.readProperty("URL"));
		 
		 
	}

	@When("^user clicks on weather link$")
	public void user_clicks_on_weather_link() {
	    hp.navigateToWeatherDetailsPage();
	}

	@And("^user verify the weather details$")
	public void user_verify_the_weather_details(){
	   wp.searchAndPinDownCityName(PropertyFileReader.readProperty("cityName"));
	   UIdata=wp.getCityHumadityAndTempInDegree();
	}
	
	@Then("^close the browser$")
	public void close_the_browser(){
	   driver.close();
	}
	
	
	/* API calls */
	
	@Given("^User Set GET weather details api endpoint$")
	public void user_Set_GET_weather_details_api_endpoint() {
	  url=PropertyFileReader.readProperty("baseURL")+PropertyFileReader.readProperty("cityName")+PropertyFileReader.readProperty("APIKey");
	}

	@When("^Send PUT request$")
	public void send_PUT_request(){
		response = RestAssured.given().contentType(ContentType.JSON).log().all().get(url);
	}

	@Then("^verify response body$")
	public void verify_response_body() {
		JSONReader.getCityHumidityandTempFromResJson(response);
	   
	}

	/* compare both API and UI data */
	
	@When("^USer complare both UI and API weather response$")
	public void USer_complare_both_UI_and_API_weather_response() {
	  org.junit.Assert.assertTrue(WeatherComparision.compareHumidity(APIdata.get("humidity"), UIdata.get("humidityOnUI")));
	  org.junit.Assert.assertTrue(WeatherComparision.compareTemprature(APIdata.get("apiTemp"), UIdata.get("tempinDegreeOnUI")));
	}


}
