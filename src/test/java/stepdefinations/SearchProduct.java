package stepdefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import base.DriverManagement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.Product;
import utilities.Loging;
import utilities.Navigation;
import utilities.PropertyReader;
import utilities.Waits;

public class SearchProduct {
	
	/**
	 * Author: Amaresh
	 *
	 * Product Search scnerio
	 *
	 */
	private Logger Log = Loging.getLogger(SearchProduct.class);
	Product productpage = new Product(DriverManagement.driver);
	Home homepage = new Home(DriverManagement.driver);
	Login login = new Login(DriverManagement.driver);

	@Given("^User already login to Amazon app$")
	public void user_already_login_to_Amazon_app() throws Throwable {
		try {

			if (homepage.category().isDisplayed())
				Log.info("User already log into an application");

		}

		catch (Exception e) {

			Waits.waitforgiventime(30);
			Log.info("User is log into application");
			if (login.alreadycutomerbutton().isDisplayed()) {
				login.alreadycutomerbutton().click();
			}
			Waits.waitforgiventime(30);
			Log.info("Enter UserName and Password into application");

			// Enter Username
			Waits.waitforgiventime(15);
			login.loginemailid().sendKeys(PropertyReader.Testproperties.getObjectpropertyValue("username"));
			login.continuebutton().click();
			Waits.waitforgiventime(10);
			login.loginpassword().clear();
			login.loginpassword().sendKeys(PropertyReader.Testproperties.getObjectpropertyValue("password"));
			login.Submitbutton().click();
			Waits.waitforgiventime(10);

			Log.info("User log in into application Sucessfully");
		}
	}

	// Entering input to the search Textbox

	@Then("^enter \"([^\"]*)\" Product name in Search Box$")
	public void enter_Product_name_in_Search_Box(String arg1) throws Throwable {
		Log.info("Entering value to the Search Textbox");
		if (productpage.searchtextbox().isDisplayed()) {
			try {
				productpage.searchtextbox()
						.sendKeys(PropertyReader.Testproperties.getObjectpropertyValue("Searchproduct"));
			} catch (Exception e) {
				Log.error("Searchtextbox is not available");
			}

		}

	}

	@Then("^click on Search in Search page$")
	public void click_on_Search_in_Search_page() throws Throwable {
		Log.info("Pressing Enter Key");
		Navigation.EnterKey();

	}
    //Assetion for the product detail page
	@Then("^check User is in Product detail page$")
	public void check_User_is_in_Product_detail_page() throws Throwable {
		Log.debug("Verifying on the productdetails page");
		boolean Isproductpagedisplayed = productpage.Productdetailpage().isDisplayed();
		Assert.assertEquals(true, Isproductpagedisplayed);

	}

	@Then("^user scroll to the mid of the product$")
	public void user_scroll_to_the_mid_of_the_product() throws Throwable {
		Log.info("scrolling down to the product");
		Navigation.scrolltoview(DriverManagement.driver,
				PropertyReader.Testproperties.getObjectpropertyValue("ActualProduct"));

	}

}
