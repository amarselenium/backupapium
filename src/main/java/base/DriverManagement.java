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
			cap.setCapability("deviceName", "Android Device");
			cap.setCapability("udid", "9e15a79b"); // Give Device ID of your
													// mobile phone
			cap.setCapability("platformName", "Android");
			cap.setCapability("automationName", "UiAutomator1");
			cap.setCapability("app", "F:\\NewWorkspace\\Amazone\\src\\main\\resources\\Amazon_Shopping.apk");
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			return driver;
			
//code for realdevice
		} else {

			cap.setCapability("deviceName", "Android Device");
			cap.setCapability("udid", "9e15a79b"); // Give Device ID of your
													// mobile phone
			cap.setCapability("platformName", "Android");
			cap.setCapability("automationName", "UiAutomator1");
			cap.setCapability("app", "F:\\NewWorkspace\\Amazone\\src\\main\\resources\\Amazon_Shopping.apk");
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			return driver;
		}

	}

}
