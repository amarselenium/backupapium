package pageObjects;

import org.openqa.selenium.support.PageFactory;

import base.DriverManagement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Addtocart {
	
	/**
	* Author: Amaresh
	*
	* pagefactory for addtocart page
	*
	*/

	public Addtocart(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "imageBlock_feature_div")
	private AndroidElement ProductResult;

	@AndroidFindBy(id = "add-to-cart-button")
	private AndroidElement addtocartbutton;

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_cart_count")
	private AndroidElement addtocarticon;

	@AndroidFindBy(id = "quantity-label-C5de7744e-066a-48ad-bb41-21f0105033d7")
	private AndroidElement quantitylabel;

	public AndroidElement ProductResult() {

		return ProductResult;
	}

	public AndroidElement addtocartbutton() {

		return addtocartbutton;
	}

	public AndroidElement addtocarticon() {

		return addtocarticon;
	}

	public AndroidElement quantitylabel() {

		return quantitylabel;
	}

}
