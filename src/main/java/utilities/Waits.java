package utilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverManagement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Waits {

	private static Logger Log = Loging.getLogger(Waits.class);

	public static void waitforgiventime(int time) throws MalformedURLException {

		Log.info("waiting for " + time + "  seconds");
		DriverManagement.driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
		
	}

	// Explicit Wait
	public void waitForGivenElement(int time, AndroidElement androidElement) {
		try {
			Log.info("waiting till next element is visible");
			WebDriverWait wait = new WebDriverWait(DriverManagement.driver, time);
			wait.until(ExpectedConditions.visibilityOf(androidElement));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}