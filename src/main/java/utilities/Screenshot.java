package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.DriverManagement;

public class Screenshot {
	
	/**
	 * Author: Amaresh
	 *
	 * screenshot method
	 *
	 */
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)DriverManagement.driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}

}
