package stepdefinations;

import org.apache.log4j.Logger;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Loging;
import utilities.Navigation;
import utilities.PropertyReader;

public class Rotateandresolution {
	/**
	 * Author: Amaresh
	 *
	 * Screen rotaion and resolution scenario
	 *
	 */

	private Logger Log = Loging.getLogger(Rotateandresolution.class);

	@When("^rotate the screen$")
	public void rotate_the_screen() throws Throwable {
		Log.info("rotate the screen into landscape mode");
		Navigation.landscaperotation();
		Log.info("Rotate the screen into potrait mode");
		Navigation.potraitrotation();
	}

	@When("^reolution changed$")
	public void reolution_changed() throws Throwable {
		Log.info("rotate the screen resolution");
		Navigation.changeresolution(10, 20);

	}

	@Then("^screen rotated and resolution changed$")
	public void screen_rotated_and_resolution_changed() throws Throwable {
		Log.info("Screen resolution has changed and rotated successfully");
	}
}
