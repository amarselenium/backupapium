import java.io.IOException;

import org.apache.log4j.Logger;

import base.DriverManagement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Home;
import utilities.Loging;
import utilities.PropertyReader;

public class testmain {

	private Logger Log = Loging.getLogger(testmain.class);
	public static AndroidDriver<AndroidElement> driver;
	Home home= new Home(DriverManagement.driver);
	public void mytest()
	{
		Log.info("india is grerat");
		
		boolean displayed = home.category().isDisplayed();
		System.out.println(displayed);
	}

	
	public static void main(String[] args) {
		new testmain().mytest();
		System.out.println(PropertyReader.Testproperties.getObjectpropertyValue("username"));
		
		
	}
}

