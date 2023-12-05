package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class Base{
	public static String ssdir ="Reports/FailedScreenShots/";
	public static Logger logger;
	public static WebDriverWait wait ;


	public static AndroidDriver driver=null;
	  public WebElement waitForVisibility(WebElement clickonFilter) {
	        return wait.until(ExpectedConditions.visibilityOf(clickonFilter));
	    }

	public static void driverSetup() throws MalformedURLException {
		 UiAutomator2Options options = new UiAutomator2Options();
	    options.setPlatformName("Android"); //optional
	    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);//optional
	    options.setDeviceName("Android");
	    options.setApp(System.getProperty("user.dir") + "/apps/in.workindia.apk");	
//     	options.setAppActivity("");
//     	options.setAppPackage("");
	    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), options);
		logger = Logger.getLogger("Logger_file");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\log4j.properties");
		logger.info("Basic Set-up");
		
		 wait = new WebDriverWait(getDriver(),Duration.ofSeconds(60));

//		getDriver().manage().window().maximize();
		

	
	}
	public static AndroidDriver getDriver() {
		return driver;
	}
//	public static void VerticalSwipe(double d, double e, double f) {
//		// TODO Auto-generated method stub
//		
//	}
	

}
