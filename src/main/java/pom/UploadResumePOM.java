package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//POM page for Upload Resume
public class UploadResumePOM extends Base{
	
	public UploadResumePOM() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_fill_profile")
	public WebElement UploadResumeUI;
	
	public void UploadResumeUI() throws InterruptedException {
		waitForVisibility(UploadResumeUI);

		UploadResumeUI.click();
		 logger.info("Click to upload resume");

	}
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_upload_resume")
	public WebElement ChooseDocument;
	
	public void ChooseDocumentFun() throws InterruptedException {
		waitForVisibility(ChooseDocument);

		ChooseDocument.click();
	}
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_document")
	public WebElement ChooseFromDocument;
	
	public void ChooseFromDocumentFun() throws InterruptedException {
		waitForVisibility(ChooseFromDocument);

		ChooseFromDocument.click();
		 logger.info("Choose from documents");

	}
	@AndroidFindBy(id="com.android.documentsui:id/artwork")
	public WebElement Nodata;
	
	public void NodataFun(){
		waitForVisibility(Nodata);

		Nodata.isDisplayed();
		 logger.info("Verified to upload");

	}
	


}
