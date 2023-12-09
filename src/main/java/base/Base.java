package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class Base {
	public static String ssdir = "Reports/FailedScreenShots/";
	public static Logger logger;
	public static WebDriverWait wait;

	public static AndroidDriver driver = null;
	public static final String BrowserStackUSername="tanugupta_NtS6mv";
	public static final String BrowserStackPassword="UCC6sofoi1CnekWq14YX";
	public static final String BrowserStackURL="https://"+BrowserStackUSername+":"
	+BrowserStackPassword+"@hub-cloud.browserstack.com/wd/hub";
			

	public WebElement waitForVisibility(WebElement clickonFilter) {
		try { 
			wait.until(ExpectedConditions.visibilityOf(clickonFilter));}
		catch (Exception e) {
			 Dimension size = driver.manage().window().getSize();
			   int startX = size.getWidth() / 2;
			   int startY = size.getHeight() / 2;
			   int endX = startX;
			   int endY = (int) (size.getHeight() * 0.25);
			   PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   Sequence sequence = new Sequence(finger1, 1)
			       .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
			       .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
			       .addAction(new Pause(finger1, Duration.ofMillis(200)))
			       .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
			       .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			   driver.perform(Collections.singletonList(sequence));
		}
		finally {
			
		
			wait.until(ExpectedConditions.visibilityOf(clickonFilter));}

		return clickonFilter;
	
	}
// setup local driver
//	public static void driverSetup() throws MalformedURLException {
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);// optional
//		options.setCapability("deviceName","Android");
//		options.setCapability("platformVersion", "8.1");
//		options.setCapability("platformName", "Android");
//		options.setCapability("app",System.getProperty("user.dir") + "\\apps\\in.workindia.apk" );
//		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), options);
//		logger = Logger.getLogger("Logger_file");
//		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\resources\\log4j.properties");
//		logger.info("Basic Set-up");
//
//		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//
//	}
	
//	 setup BrowserStack
		public static void driverSetup() throws MalformedURLException {
			UiAutomator2Options options = new UiAutomator2Options();
			options.setCapability("deviceName", "Google Pixel 3");
			options.setCapability("os_version", "9.0");
			options.setCapability("app", "bs://7ff3cb330d4910e73bf8aba99c2c42f2fb7f463c");
			options.setPlatformName("Android"); // optional
			options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);// optional
			driver = new AndroidDriver(new URL(BrowserStackURL), options);
			logger = Logger.getLogger("Logger_file");
			PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\resources\\log4j.properties");
			logger.info("Basic Set-up");
	
			wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
	
		}

	public static AndroidDriver getDriver() {
		return driver;
	}

}
