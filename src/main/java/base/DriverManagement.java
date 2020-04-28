package base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.PropertyReader;

public class DriverManagement {
	
	/**
	* Author: Amaresh
	*
	* Check the device and start accordingly
	*
	*/
	
	public static AndroidDriver<AndroidElement> driver;
	static DesiredCapabilities cap = new DesiredCapabilities();
//code for emulator
	public static  AndroidDriver<AndroidElement> startmachine(String machine) throws IOException, InterruptedException {
		
		if (machine.contains("emulator")) {
			AppiumSetup.startEmulator();
			cap.setCapability("deviceName", PropertyReader.Applicationproperties.getObjectpropertyValue("devicename"));
			cap.setCapability("udid", PropertyReader.Applicationproperties.getObjectpropertyValue("emulator")); // Give Device ID of your
													// mobile phone
			cap.setCapability("platformName", PropertyReader.Applicationproperties.getObjectpropertyValue("platformName"));
			cap.setCapability("automationName", "UiAutomator1");
			cap.setCapability("app", PropertyReader.Applicationproperties.getproperty("Apkpath"));
			driver = new AndroidDriver<AndroidElement>(new URL(PropertyReader.Applicationproperties.getObjectpropertyValue("huburl")), cap);
			return driver;
			
//code for realdevice
		} else {

			cap.setCapability("deviceName", PropertyReader.Applicationproperties.getObjectpropertyValue("devicename"));
			cap.setCapability("udid", PropertyReader.Applicationproperties.getObjectpropertyValue("Realdevice")); // Give Device ID of your
													// mobile phone
			cap.setCapability("platformName", PropertyReader.Applicationproperties.getObjectpropertyValue("platformName"));
			cap.setCapability("automationName", "UiAutomator1");
			cap.setCapability("app", PropertyReader.Applicationproperties.getproperty("Apkpath"));
			driver = new AndroidDriver<AndroidElement>(new URL(PropertyReader.Applicationproperties.getObjectpropertyValue("huburl")), cap);
			return driver;
		}

	}

}
