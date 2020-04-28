package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {
	/**
	* Author: Amaresh
	*
	* pagefactory for Login page
	*
	*/

	public Login(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	private AndroidElement alreadycustomer;

	@AndroidFindBy(id = "ap_email_login")
	private AndroidElement loginemailid;

	@AndroidFindBy(id = "continue")
	private AndroidElement continuebutton;
	
	@AndroidFindBy(id = "ap_password")
	private AndroidElement loginpassword;
	
	@AndroidFindBy(id = "signInSubmit")
	private AndroidElement Submitbutton;
	
	
	

	public AndroidElement alreadycutomerbutton() {

		return alreadycustomer;
	}

	public AndroidElement loginemailid() {

		return loginemailid;
	}

	public AndroidElement continuebutton() {

		return continuebutton;
	}
	
	public AndroidElement loginpassword() {

		return loginpassword;
	}
	
	public AndroidElement Submitbutton() {

		return Submitbutton;
	}
}
