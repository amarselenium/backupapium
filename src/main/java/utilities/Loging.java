package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loging {

	private static boolean root = false;
	static PropertyReader applicationproperties = new PropertyReader("\\src\\main\\resources\\Application.properties");
    
	public static Logger getLogger(Class clas) {

		if (root) {
			return Logger.getLogger(clas);
		}
		try {
			PropertyConfigurator.configure(new FileInputStream(new File(applicationproperties.getproperty("logfile"))));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		root = true;
		return Logger.getLogger(clas);
	}
}
