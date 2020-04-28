package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.PropertyReader;

public class Product {
	/**
	* Author: Amaresh
	*
	* pagefactory for Product page
	*
	*/
	public Product(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private AndroidElement searchtextbox;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='close']")
	private AndroidElement closepopup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.amazon.mShop.android.shopping:id/item_title'])[1]")
	private AndroidElement Productnametitle;
	
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/list_product_linear_layout]")
	private AndroidElement Productdetailpage;
	
	
	
	

	public AndroidElement searchtextbox() {
		return searchtextbox;
	}
	
	public AndroidElement closepopup() {
		return closepopup;
	}
	
	public AndroidElement Productnametitle() {
		return Productnametitle;
	}
	
	public AndroidElement Productdetailpage() {
		return Productdetailpage;
	}
}
