package StepDef;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.RegisterPOM;

public class RegisterSteps extends Base{

	@Given("^Opened emulator and app$")
	public void open_emulator_and_app()  throws Throwable {
		Base.driverSetup();
        logger.info("Emulator Start");
        
		
	}

	@When("^Enter (.*) and (.*)$")
	public void enter_Tanu_and(String Names,String MobileNos) throws Throwable {

		RegisterPOM register_page=new RegisterPOM();
//		register_page.
		register_page.EnternameClick(Names);
		register_page.EnterMobileNoClick(MobileNos);
	}

	@And("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {

		RegisterPOM register_page=new RegisterPOM();
		register_page.ClickSubmitFunction();
	 
	}


@And("^Choose Options$")
public void choose_Options_and_click_submit() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	register_page.ClickChooseCityFun();
}


@And("^Enter (.*) Station$")
public void enter_Nalasopara(String Location) throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	register_page.EnterNearestLocationFunc(Location);
}

@And("^click submit$")
public void enter_Nala_Sopara_of_nearest_Station() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	
	register_page.ClickCitySubmitButtonFun();


}


@And("^Choose Diff Options$")
public void choose_Diff_Options() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	register_page.ChooseGenderFun();
	register_page.ChooseQualificationFun();
	register_page.ChooseSchoolMediumFun();
	register_page.ChooseEnglishLevelFun();
//	driver.scrol
//	Base.VerticalSwipe(0.70, 0.10, 0.50);
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
	   
	    register_page.ChooseExperienceFun();


}

@And("^Choose Age$")
public void age() throws InterruptedException {
	RegisterPOM register_page=new RegisterPOM();

//
	register_page.ChooseAgeAreaFun();
	register_page.ChooseAgeFun();

}
@And("^Choose more options after swipe up$")
public void choose_more_options_after_swipe_up() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	

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

	   driver.perform(Collections.singletonList(sequence));	register_page.ChooseIntrestFun();
	   register_page.ClickCitySubmitButtonFun();
		Thread.sleep(5000);

	register_page.ChooseExpQuesFun();

	   register_page.Choose6monthexpFun();
	   register_page.ChooseSubmitButtonFun();
	   register_page.ChooseSkillAnsFun();
	   register_page.ChoosePhotoshopFun();
	   register_page.ChooseSubmitButtonFun();
	   register_page.ChooseDegreeMenuFun();
	   register_page.ChooseDegreeFromOptionsFun();
	   register_page.ChooseLastSalaryMenuFun();
	   register_page.ChosseLastSalaryFun();
	   register_page.ClickCitySubmitButtonFun();
	   register_page.ChooseLanFun();


}


@And("^More Options Choose$")
public void more_Options_Choose() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
	register_page.ChooseAgeAreaFun();
	register_page.ChooseAgeFun();

   register_page.ChooseExpQuesFun();
   register_page.Choose6monthexpFun();
   register_page.ChooseSubmitButtonFun();
   register_page.ChooseSkillAnsFun();
   register_page.ChoosePhotoshopFun();
   register_page.ChooseSubmitButtonFun();
   register_page.ChooseDegreeMenuFun();
   register_page.ChooseDegreeFromOptionsFun();
   register_page.ChooseLastSalaryMenuFun();
   register_page.ChosseLastSalaryFun();
   register_page.ClickCitySubmitButtonFun();
   register_page.ChooseLanFun();

}


@Then("^Verify Registered Sucessfully$")
public void registered_Sucessfully() throws Throwable {
	RegisterPOM register_page=new RegisterPOM();
	Assert.assertTrue(register_page.VerfiyRegisterPageFun());
     logger.info("Registered Sucessfully");

}


@Then("^Error should be displayed$")
public void error_should_be_displayed() throws Throwable {

	RegisterPOM register_page=new RegisterPOM();
register_page.ClickSubmitFunctionVerify();
logger.error("Error should be displayed");
}




}
