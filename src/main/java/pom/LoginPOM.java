//package pom;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//
//import base.Base;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
////Pom File for Applying filters
//public class LoginPOM extends Base {
//	public LoginPOM() {
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
//	public WebElement openMenu;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log In\"]")
//	public WebElement login;
//	
//	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Username input field\"]")
//	public WebElement username;
//	
//	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"Password input field\"]")
//	public WebElement password;
//
//	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Login button\"]")
//	public WebElement loginBtn;
////
////	@AndroidFindBy(xpath="")
////	public WebElement ;
////
////	@AndroidFindBy(xpath="")
////	public WebElement ;
////
////	@AndroidFindBy(xpath="")
////	public WebElement ;
////
////	@AndroidFindBy(xpath="")
////	public WebElement ;
////
////	@AndroidFindBy(xpath="")
////	public WebElement ;
//
//	
//	
//	
//	public void clickOnOpenMenu() throws Exception {
//		waitForVisibility(selectText);
//
//		openMenu.click();
//	}
//	public void clickOnLogin() throws Exception {
//		waitForVisibility(selectText);
//
//		login.click();
//	}
//	public void enterOnUsername() throws Exception {
//		waitForVisibility();
//
//		username.click();
//		username.sendKeys("bob@example.com");
//	}
//	public void enterPassword() throws Exception {
//		waitForVisibility(password);
//
//		password.click();
//		password.sendKeys("10203040");
//	}
//
//	public void ClickonloginBtn() throws Exception {
//		waitForVisibility(loginBtn);
//
//		loginBtn.click();
//	}
////
////	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply")
////	public MobileElement ClickonApplyBtn;
////
////	public void ClickonApplyBtnFun() throws Exception {
////
////		ClickonApplyBtn.click();
////	}
////
////	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
////	public MobileElement ClickonlowtoHigh;
////
////	public void ClickonlowtoHighFun() throws Exception {
////		ClickonlowtoHigh.click();
////		logger.info("Click on sort for low to high");
////
////	}
////
////	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/tv_head_job_interview_detail")
////	public MobileElement VerifyJob;
////
////	public void VerifyJobFun() {
////		Assert.assertTrue(VerifyJob.isDisplayed());
////		logger.info("Verify Sucessfully");
////	}
////
////	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_sort")
////	public MobileElement ClickonSort;
////
////	public void ClickonSortFun() {
////		ClickonSort.click();
////		ClickonlowtoHigh.click();
////		logger.info("Clicked on Sort");
////	}
//
//}
