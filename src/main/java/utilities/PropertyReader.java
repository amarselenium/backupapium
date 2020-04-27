package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private Properties prop = null;
	public static PropertyReader Testproperties = new PropertyReader("\\src\\main\\resources\\Test.properties");
	public static PropertyReader elementproperties= new PropertyReader("\\src\\main\\resources\\Page-Element.properties");
	public static PropertyReader Applicationproperties= new PropertyReader("\\src\\main\\resources\\Application.properties");
	public PropertyReader(String path) {
		prop = new Properties();
		try {
			prop.load(Resource.getResourcePathInputStream(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getproperty(String key) {

		return getsystempath() + String.valueOf(prop.get(key));
	}

	public String getObjectpropertyValue(String Objectname) {
		return String.valueOf(prop.get(Objectname));
	}

	public static String getsystempath() {
		return System.getProperty("user.dir");
	}

	

}
