package StepDef;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.JobSearchPOM;

public class JobSearchSteps extends Base {
//	LogReport log = new LogReport("JobSearchAndApplySteps");

	@And("^User Enter Keyboard of (.*) and Apply$")
	public void user_Enter_Keyboard_of_graphic_and_Apply(String job) throws Throwable {
		JobSearchPOM jobSearch = new JobSearchPOM();
		jobSearch.SearchForJobFun(job);
		jobSearch.selectTextFun();
		jobSearch.ChooseJobFun();
		
//
//		 Dimension size = driver.manage().window().getSize();
//		   int startX = size.getWidth() / 2;
//		   int startY = size.getHeight() / 2;
//		   int endX = startX;
//		   int endY = (int) (size.getHeight() * 0.25);
//		   PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
//		   Sequence sequence = new Sequence(finger1, 1)
//		       .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
//		       .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//		       .addAction(new Pause(finger1, Duration.ofMillis(200)))
//		       .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
//		       .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//		   driver.perform(Collections.singletonList(sequence));
//			Thread.sleep(5000);
		
//		jobSearch.ClickcallToHRFun();

	}

	@Then("^User sucessfully apply for job$")
	public void user_sucessfully_apply_for_job() throws Throwable {

		JobSearchPOM jobSearch = new JobSearchPOM();
		jobSearch.GetCallAlertFun();

		logger.info("SucessFully apply for job"); 

	}


}
