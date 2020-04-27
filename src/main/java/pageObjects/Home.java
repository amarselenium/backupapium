package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home {

	public Home(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
	private AndroidElement category;

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/drawer_item_title")
	private AndroidElement Homeicon;

	public AndroidElement category() {

		return category;
	}

	public AndroidElement Homeicon() {

		return Homeicon;
	}

}
