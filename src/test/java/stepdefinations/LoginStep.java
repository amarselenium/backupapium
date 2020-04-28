package stepdefinations;

import org.apache.log4j.Logger;

import base.AppiumSetup;
import base.DriverManagement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.Assert;
import org.testng.asserts.*;
import pageObjects.Home;
import pageObjects.Login;
import utilities.ExcelfileReader;
import utilities.Loging;
import utilities.PropertyReader;
import utilities.Waits;

public class LoginStep {
	
	
	/**
	 * Author: Amaresh
	 *
	 * Login scenario
	 *
	 */

	Login login = new Login(DriverManagement.driver);
	Home home= new Home(DriverManagement.driver);
	private Logger Log = Loging.getLogger(LoginStep.class);
	
	//Login to the application
	@Given("^User login to Amazon app$")
	public void user_login_to_Amazon_app() throws Throwable {
		Log.info("clicking on Alreadycutomerbutton");
		login.alreadycutomerbutton().click();
	}

	//Entering Username and Password from external excel file
	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		Log.info("Entering Username");
		login.loginemailid().sendKeys(ExcelfileReader.excelreader(PropertyReader.Applicationproperties.getObjectpropertyValue("Logincredentialspath"), PropertyReader.Applicationproperties.getObjectpropertyValue("sheetname"),"username"));
		login.continuebutton().click();
		login.loginpassword().sendKeys(ExcelfileReader.excelreader(PropertyReader.Applicationproperties.getObjectpropertyValue("Logincredentialspath"), PropertyReader.Applicationproperties.getObjectpropertyValue("sheetname"),"password"));
		login.Submitbutton().click();
		Log.info("Entered Username and Password sucessfully");
	}

	//Verifying Login has done successully and check the homepagescreen
	@Then("^user navigate to Home page$")
	public void user_navigate_to_Home_page() throws Throwable {
		Waits.waitforgiventime(10);
		boolean displayed = home.category().isDisplayed();
		System.out.println(displayed);
		System.out.println(home.category().getText().replaceAll("\\s", ""));
		Assert.assertEquals(PropertyReader.Testproperties.getObjectpropertyValue("homepagelogoname"),home.category().getText().replaceAll("\\s", ""));
	
	}
}
