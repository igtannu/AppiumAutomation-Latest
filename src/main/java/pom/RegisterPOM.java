package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//POM page for Applying Registration
public class RegisterPOM extends Base{
	

public RegisterPOM() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")
public WebElement Entername;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")
public WebElement EnterMobileno;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
public WebElement ClickButton;

@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"in.workindia.nileshdungarwal.workindiaandroid:id/rb_mum\"]")
public WebElement ClickChooseCity;
@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/continue_button\"]")
public WebElement continueBtn;
@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
public WebElement ok;


@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.EditText")
public WebElement EnterNearestStation;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
public WebElement ClickCitySubmit;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
public WebElement ChooseLocation;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RadioGroup/android.widget.FrameLayout[2]/android.widget.Button")
public WebElement ChooseGender;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RadioGroup/android.widget.FrameLayout[4]/android.widget.Button")
public WebElement ChooseQualification;

//TouchAction touch=new TouchAction(AppDriver);
//WebElement ele=AppDriver.findElementByXPath("xpath=\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RadioGroup/android.widget.FrameLayout[4]/android.widget.Button");



@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RadioGroup/android.widget.FrameLayout[1]/android.widget.Button")
public WebElement ChooseSchoolMedium;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.Button")
public WebElement ChooseEnglishLevel;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_experience")
public WebElement ChooseExperience;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
public WebElement ChooseAgeArea;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]")
public WebElement ChooseAge;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[14]/android.widget.CheckBox")
public WebElement ChooseIntrest;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
public WebElement ChooseExpQues ;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_first_question")
public WebElement ChooseSkillAns ;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_course")
public WebElement ChooseDegreeMenu ;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_title_last_salary")
public WebElement ChooseLastSalaryMenu ;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/action_notifications")
public WebElement verifyRegisterPage;

@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_6_months")
public WebElement Choose6monthexp ;

@AndroidFindBy(id="android:id/button1")
public WebElement ChooseSubmitButton;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
public WebElement ChoosePhotoshop ;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
public WebElement ChooseDegreeFromOptions;

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
public WebElement ChosseLastSalary;

@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"in.workindia.nileshdungarwal.workindiaandroid:id/btn_english\"]")
public WebElement ChooseLan;

public void EnternameClick(String Name) throws InterruptedException {
	waitForVisibility(Entername);
Entername.sendKeys(Name);
logger.info("Entered Name");
}

public void EnterMobileNoClick(String MobileNo) {
	waitForVisibility(EnterMobileno);
	EnterMobileno.sendKeys(MobileNo);
	logger.info("Entered Mobile no");
}

public void ClickSubmitFunction() {
	waitForVisibility(ClickButton);
	ClickButton.click();
}
public void ClickSubmitFunctionVerify() {
	waitForVisibility(ClickButton);
	ClickButton.isDisplayed();
}

public void ClickChooseCityFun() {
	waitForVisibility(ClickChooseCity);
	ClickChooseCity.click();
	logger.info("Choose City");
}

public void ClickCitySubmitButtonFun() {
	waitForVisibility(ClickCitySubmit);

	ClickCitySubmit.click();
}

public void EnterNearestLocationFunc(String Location) throws InterruptedException {
	waitForVisibility(EnterNearestStation);

	EnterNearestStation.sendKeys(Location);
	logger.info("Enter Nearest Location");
}

public void ChooseLocationFun() throws InterruptedException {
	waitForVisibility(ChooseLocation);

	ChooseLocation.click();
}

public void ChooseGenderFun() {
	waitForVisibility(ChooseGender);

	ChooseGender.click();
	logger.info("Choose gender");
}

public void ChooseQualificationFun() {
	waitForVisibility(ChooseQualification);

		ChooseQualification.click();
		logger.info("Chosses Qualification");
}

public void ChooseSchoolMediumFun() throws InterruptedException {
	waitForVisibility(ChooseSchoolMedium);

	logger.info("Chooses School Medium ");
	ChooseSchoolMedium.click();
}

public void ChooseEnglishLevelFun() throws InterruptedException {
	waitForVisibility(ChooseEnglishLevel);
	logger.info("Choose experince ");
	ChooseEnglishLevel.click();
}

public void ChooseExperienceFun() throws InterruptedException {
	waitForVisibility(ChooseExperience);

	ChooseExperience.click();
}

public void ChooseIntrestFun() throws InterruptedException {
	waitForVisibility(ChooseIntrest);

	ChooseIntrest.click();
}

public void ChooseAgeAreaFun() throws InterruptedException {
	waitForVisibility(ChooseAgeArea);
 
	ChooseAgeArea.click();
}

public void ChooseAgeFun() throws InterruptedException {
	waitForVisibility(ChooseAge);

	ChooseAge.click();
}

public void ChooseSkillAnsFun() throws InterruptedException {
	waitForVisibility(ChooseSkillAns);

	ChooseSkillAns.click();
}

public void ChooseExpQuesFun() throws InterruptedException {
	waitForVisibility(ChooseExpQues);

	ChooseExpQues.click();
}

public void ChooseDegreeMenuFun() {
	 logger.info("Choose Various options");
		waitForVisibility(ChooseDegreeMenu);

	ChooseDegreeMenu.click();
}

public void ChooseLastSalaryMenuFun() {
	waitForVisibility(ChooseLastSalaryMenu);

	ChooseLastSalaryMenu.click();
}

public void Choose6monthexpFun() {
	waitForVisibility(Choose6monthexp);

	Choose6monthexp.click();
}

public void ChooseSubmitButtonFun() throws InterruptedException {
	waitForVisibility(ChooseSubmitButton);

	ChooseSubmitButton.click();
}

public void ChoosePhotoshopFun() {
	waitForVisibility(ChoosePhotoshop);

	ChoosePhotoshop.click();
}

public void ChooseDegreeFromOptionsFun() throws InterruptedException {
	waitForVisibility(ChooseDegreeFromOptions);

	ChooseDegreeFromOptions.click();
}

public void ChosseLastSalaryFun() throws InterruptedException {
	waitForVisibility(ChosseLastSalary);

	 logger.info(" Last salary chooses"); 
	ChosseLastSalary.click();
}

public void ChooseLanFun() {
	waitForVisibility(ChooseLan);

	 logger.info("Choose language");
	ChooseLan.click();
}

public boolean VerfiyRegisterPageFun() throws InterruptedException {
	waitForVisibility(verifyRegisterPage);

 
  logger.info("Verified Registraction ");
return verifyRegisterPage.isDisplayed();
}




}
