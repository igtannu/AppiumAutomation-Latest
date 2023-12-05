package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//POM page for Applying Job Search
public class JobSearchPOM extends Base{

public  JobSearchPOM() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_inputSearch")
public WebElement SearchForJob;

public void SearchForJobFun(String job) {
	waitForVisibility(SearchForJob);
	SearchForJob.click();
	SearchForJob.sendKeys(job);
	logger.info("Search for job");
}


@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_schedule_2")
public WebElement ClickcallToHR;


@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_head_job_title")
public WebElement ClickHiUser;

public void ClickcallToHRFun() {
	waitForVisibility(ClickcallToHR);

	ClickcallToHR.click();
	logger.info("Click to call HR");
}

@AndroidFindBy(id="android:id/alertTitle")
public WebElement GetCallAlert;

public void GetCallAlertFun() {
	waitForVisibility(ClickHiUser);

		ClickHiUser.isDisplayed();
		logger.info("Verify For Job Seacrh");
	
}




@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")
public WebElement selectText;

public void selectTextFun() throws InterruptedException {
	waitForVisibility(selectText);

	selectText.click();
}


@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]")
public WebElement ChooseJob;

public void ChooseJobFun() {
	waitForVisibility(ChooseJob);

	ChooseJob.click();
	logger.info("Job Chooses sucessfully");
}


}
