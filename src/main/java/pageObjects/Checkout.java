package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Checkout {

	/**
	* Author: Amaresh
	*
	* pagefactory for Checkout page
	*
	*/
	
	public Checkout(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//*[@text='Proceed to Buy']")
	private AndroidElement proceedtopaybutton;

	@AndroidFindBy(id = "sc-active-cart")
	private AndroidElement activecart;

	@AndroidFindBy(xpath = "//*[@text='Dettol Body Wash and shower Gel, Revitalize - 250ml']")
	private AndroidElement cartitem;

	public AndroidElement proceedtopaybutton() {

		return proceedtopaybutton;
	}

	public AndroidElement activecart() {

		return activecart;
	}

	public AndroidElement cartitem() {

		return cartitem;
	}

}
