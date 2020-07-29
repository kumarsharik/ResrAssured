package utilities;

import java.util.HashMap;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JSONReader {
public static HashMap<String,Double> getCityHumidityandTempFromResJson(Response response) {
	HashMap<String,Double> APIdata= new HashMap<String, Double>();
	JsonPath jsonpath = response.jsonPath();
	Double tempindegree = ((jsonpath.getDouble("main.temp") -273.15));
	APIdata.put("apiTemp", tempindegree);
	APIdata.put("humidity", jsonpath.getDouble("main.humidity"));
	return APIdata;
}
}
