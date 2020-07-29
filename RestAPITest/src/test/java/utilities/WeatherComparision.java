package utilities;

public class WeatherComparision {
	public static boolean compareTemprature(Double o1, Double o2) {
		
		// keeping the variance as 3 degree celsius for temperature
		if (Math.abs(o1 - o2) > 3) {
			return false;
		}
		return true;
	}

	// keeping the variance as 20% for humidity.
	public static boolean compareHumidity(Double o1, Double o2) {
		if (Math.abs(o1 - o2) > 20) {
			return false;
		}
		return true;
	}
}
