package stepdefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import base.DriverManagement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Addtocart;
import pageObjects.Checkout;
import utilities.Loging;
import utilities.Navigation;
import utilities.PropertyReader;
import utilities.Waits;

public class Addtocartandcheckout {
	private Logger Log = Loging.getLogger(Addtocartandcheckout.class);
	Checkout chkout = new Checkout(DriverManagement.driver);
	Addtocart addtcart = new Addtocart(DriverManagement.driver);

	@Given("^User already search the product$")
	public void user_already_search_the_product()  {
		Log.info("verifying search result page");

		if (addtcart.ProductResult().isDisplayed()) {
			Log.info("Searched item has selected and ready to add to cart");
		} else {
			try {
				int count = DriverManagement.driver
						.findElements(By.id(PropertyReader.elementproperties.getObjectpropertyValue("productlist")))
						.size();

				for (int i = 0; i < count; i++) {
					String text = DriverManagement.driver
							.findElements(By.id(PropertyReader.elementproperties.getObjectpropertyValue("productlist")))
							.get(i).getText();
					//System.out.println(text);
					if (text.equalsIgnoreCase(PropertyReader.Testproperties.getObjectpropertyValue("ActualProduct"))) {
						DriverManagement.driver
								.findElements(
										By.id("com.amazon.mShop.android.shopping:id/list_product_description_layout"))
								.get(i).click();
						break;
					}

				}

			} catch (Exception e) {
				Log.error("Not Added to cart");
			}

		}

	}

	//scrollint to the addto button  and adding to the cart
	
	@When("^click on addto cart button$")
	public void click_on_addto_cart_button() throws Throwable {
		
		Navigation.scrolltoview(DriverManagement.driver, "Add to Cart");
		Log.info("scrolled to Add to cart button");
		addtcart.addtocartbutton().click();
		Log.info("clicked on addto cart button");

	}

	//Asserting the product added to the cart
	@Then("^Product added to the cart successfully$")
	public void product_added_to_the_cart_successfully() throws Throwable {
		
		Waits.waitforgiventime(50);
		addtcart.addtocarticon().click();
		Log.info("checking the product quantity in checkout");
		Assert.assertEquals(chkout.activecart().isDisplayed(),true);

	}

	//Asserting the cart items to the product added to the cart and proceed to pay
	
	@Then("^added product matches with the selected product$")
	public void added_product_matches_with_the_selected_product() throws Throwable {
		
		Waits.waitforgiventime(30);
		Log.info("Asserting the added product to the cart");
		Assert.assertEquals(chkout.cartitem().getText(),PropertyReader.Testproperties.getObjectpropertyValue("ActualProduct"));
		Log.debug("Clicking on proceed to pay");
		chkout.proceedtopaybutton().click();

	}

}
