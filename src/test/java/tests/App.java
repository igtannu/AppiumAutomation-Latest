//package tests;
//
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import base.Base;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//
//class App extends Base
//{
//	AndroidDriver driver=null;
//	@Test
//	 public  void androidLaunchTest() throws MalformedURLException{
//		Base.driverSetup();
//		driver=getDriver();
//	   driver.findElement(AppiumBy.accessibilityId("open menu")).click();
//	    /*new WebDriverWait(driver, Duration.ofSeconds(10))
//	        .until(e->e.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]")));
//	 */
//	   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]"))
//	        .click();
//	    // Thread.sleep(5000);
//	   driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("wfwdfg");
//	   driver.quit();
//	    //Assertion
//	  }
//
//}
