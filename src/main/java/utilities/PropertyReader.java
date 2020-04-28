package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	/**
	 * Author: Amaresh
	 *
	 * Reading value from property file
	 *
	 */
	private Properties prop = null;
	public static PropertyReader Testproperties = new PropertyReader("\\src\\main\\resources\\Test.properties");
	public static PropertyReader elementproperties = new PropertyReader(
			"\\src\\main\\resources\\Page-Element.properties");
	public static PropertyReader Applicationproperties = new PropertyReader(
			"\\src\\main\\resources\\Application.properties");

	public PropertyReader(String path) {
		prop = new Properties();
		try {
			prop.load(Resource.getResourcePathInputStream(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// * Reading Paths from property file*
	public String getproperty(String key) {

		return getsystempath() + String.valueOf(prop.get(key));
	}

	// * Reading absolutevalues from property file*
	public String getObjectpropertyValue(String Objectname) {
		return String.valueOf(prop.get(Objectname));
	}

	// * Reading systempath from property file*
	public static String getsystempath() {
		return System.getProperty("user.dir");
	}

}
