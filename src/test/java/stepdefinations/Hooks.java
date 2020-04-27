package stepdefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import base.AppiumSetup;
import base.DriverManagement;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import testRunner.Runner;
import utilities.Loging;
import utilities.PropertyReader;
import utilities.Screenshot;

public class Hooks {
	private Logger Log = Loging.getLogger(Hooks.class);

	@Before
	public void initialsetup() throws InterruptedException, IOException {
		Log.info("starting the server code started running");
		AppiumSetup.startServer();
		// aits.waitforgiventime(520000);
		PropertyReader prop = new PropertyReader("\\src\\main\\resources\\Application.properties");
		String machinefrompropertyfile = prop.getObjectpropertyValue("machine");
		DriverManagement.startmachine(machinefrompropertyfile);
		// login.alreadycutomerbutton().click();
		Log.info("Server started successfully");
	}

	@After()
	public void tearDown(Scenario scenario) throws IOException {
		Log.info("------------->End of scenario " + scenario.getName() + " <------------");

		if (scenario.isFailed()) {
			Screenshot.getScreenshot(scenario.getName());

		}
		else {
			Log.info(scenario.getName() + "Is Passed");
		}

		Log.info("Fetching HTML Reports");
		Runtime.getRuntime().exec(PropertyReader.Applicationproperties.getproperty("reportpath"));
		
	}

}
