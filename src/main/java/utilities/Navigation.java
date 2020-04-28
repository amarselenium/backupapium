package utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;

import base.DriverManagement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Navigation {
	
	/**
	* Author: Amaresh
	*
	* All phone navigation and action 
	*
	*/
	private static Logger Log = Loging.getLogger(Navigation.class);
	 
	/*
	 * These methods are commonly used all accorss the application. . . .
	 */

	// This method is for pressing 'Enter' from the keyboard.
	public static void EnterKey() {
		Log.info("pressing enter key from Keyboard");
		DriverManagement.driver.getKeyboard().pressKey(Keys.ENTER);

	}
	// This method is for scrolling the UI to the desired text.

	public static void scrolltoview(AndroidDriver<AndroidElement> driver, String scrolltext) {
		Log.info("Scrolling to the specific element");
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + scrolltext + "\"));");
	}
	//Screen Roation to potrait mode
	public static void potraitrotation()
	{
		ScreenOrientation sr=DriverManagement.driver.getOrientation();
		DriverManagement.driver.rotate(sr.PORTRAIT);
	}
	
	//*Screen Roation to Landscape mode*
	public static void landscaperotation()
	{
		ScreenOrientation sr=DriverManagement.driver.getOrientation();
		DriverManagement.driver.rotate(sr.LANDSCAPE);
	}
	
	//*Screen Resolution change *
	public static void changeresolution(int width,int height)
	{
		Dimension dim = new Dimension(width,height);
				DriverManagement.driver.manage().window().setSize(dim);
				}
	

}