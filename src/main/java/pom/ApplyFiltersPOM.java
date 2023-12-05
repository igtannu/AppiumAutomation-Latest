package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//Pom File for Applying filters
public class ApplyFiltersPOM extends Base {
	public ApplyFiltersPOM() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_filter")
	public WebElement ClickonFilter;

	public void ClickonFilterFun() throws Exception {
		waitForVisibility(ClickonFilter);
		ClickonFilter.click();
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_central_button")
	public WebElement ClickonCentral;

	public void ClickonCentralFun() throws Exception {
		waitForVisibility(ClickonCentral);
		logger.info("Choose Central Filter");
		ClickonCentral.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.FrameLayout[9]/android.widget.CheckBox")
	public WebElement ClickonBd;

	public void ClickonBdFun() throws Exception {
		logger.info("Clcik on Choose button filter");
		waitForVisibility(ClickonBd);
		ClickonBd.click();
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply")
	public WebElement ClickonApplyBtn;

	public void ClickonApplyBtnFun() throws Exception {
		waitForVisibility(ClickonApplyBtn);
		ClickonApplyBtn.click();
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	public WebElement ClickonlowtoHigh;

	public void ClickonlowtoHighFun() throws Exception {
		waitForVisibility(ClickonlowtoHigh);

		ClickonlowtoHigh.click();
		logger.info("Click on sort for low to high");

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/tv_head_job_interview_detail")
	public WebElement VerifyJob;

	public void VerifyJobFun() {
		waitForVisibility(VerifyJob);

		Assert.assertTrue(VerifyJob.isDisplayed());
		logger.info("Verify Sucessfully");
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"in.workindia.nileshdungarwal.workindiaandroid:id/btn_sort\"]")
	public WebElement ClickonSort;

	public void ClickonSortFun() {
		waitForVisibility(ClickonSort);

		ClickonSort.click();
		waitForVisibility(ClickonlowtoHigh);

		ClickonlowtoHigh.click();
		logger.info("Clicked on Sort");
	}

}
