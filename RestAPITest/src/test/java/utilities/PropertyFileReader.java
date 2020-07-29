package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {
public static String readProperty(String searchstring) {
	String val = null;
	Properties obj = new Properties();
	try {
		FileInputStream file = new FileInputStream("../RestAPITest/ApplicationResources/application.properties");
		obj.load(file);
		val = obj.getProperty(searchstring);
		
	}catch(Exception e) {
	System.out.println(e.getStackTrace());	
	}
	return val;
}
}
