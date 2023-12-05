package StepDef;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ApplyFiltersPOM;
import pom.JobSearchPOM;

public class ApplyFiltersSteps  extends Base{

//	LogReport log = new LogReport("ApplyFiltersAndSortSteps");

	@When("^Apply filters to find job$")
	public void apply_filters_to_find_job() throws Throwable {

		ApplyFiltersPOM appandsort = new ApplyFiltersPOM();
		JobSearchPOM jobSearch = new JobSearchPOM();
		appandsort.ClickonFilterFun();
		appandsort.ClickonCentralFun();
		appandsort.ClickonBdFun();
		appandsort.ClickonApplyBtnFun();
		appandsort.ClickonSortFun();
		jobSearch.ChooseJobFun();
		appandsort.VerifyJobFun();
	}

	@Then("^Filters applied sucessfully$")
	public void filters_applied_sucessfully() throws Throwable {

		ApplyFiltersPOM appandsort = new ApplyFiltersPOM();
		appandsort.VerifyJobFun();
		logger.info("Applied Filters Sucessfully"); 

	}

}
