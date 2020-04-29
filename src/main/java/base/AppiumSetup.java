package base;

import java.io.IOException;
import java.net.ServerSocket;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utilities.PropertyReader;
import utilities.Waits;

public class AppiumSetup {
	
	/**
	* Author: Amaresh
	*
	* Start npm and appium server
	*
	*/
	
	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;

	public static AppiumDriverLocalService startServer() {
		//
		boolean flag = checkIfServerIsRunnning(4723);
		if (!flag) {

			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		return service;

	}

	public static boolean checkIfServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);

			serverSocket.close();
		} catch (IOException e) {
			// If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static void startEmulator() throws IOException, InterruptedException {

		Runtime.getRuntime().exec(PropertyReader.Applicationproperties.getproperty("Emulatorpath"));
		Waits.waitforgiventime(30);
	}

}
