package hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.AppiumServer;
import utils.ExtentTestManager;

public class Hooks {

	public AndroidDriver driver=null;
	protected static AppiumDriverLocalService service;

//Start Server
	@Before
	public void startservices() {
		
		AppiumServer.startservice();
	}

	// Stop server
	@After(order = 1)
	public void stopservices() {

		AppiumServer.stopservice();
	}
	// Stop server
//		@After(order = 0)
//		public void teardown() throws InterruptedException {
//			Thread.sleep(500);
//			driver.quit();
//		}

	//For screenshot

//For screenshot
	public static String getBase64Screenshot() throws IOException {

		return ((TakesScreenshot) Base.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

//To store screenshots in project folder
	@After(order = 2)
	public void af(Scenario scenario) throws IOException {

		
		if(scenario.isFailed())
		{ 
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath=((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.BYTES);
	
			
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
