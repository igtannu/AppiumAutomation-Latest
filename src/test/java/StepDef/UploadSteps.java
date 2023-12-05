package StepDef;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.UploadResumePOM;

public class UploadSteps extends Base{

@And("^Click on uploadResume Ui$")
public void click_on_uploadResume_Ui() throws Throwable {
UploadResumePOM uploadresume=new UploadResumePOM();
    uploadresume.UploadResumeUI();
    uploadresume.ChooseDocumentFun();
    uploadresume.ChooseFromDocumentFun();
}


@Then("^Nodata is present should be shown$")
public void nodata_is_present_should_be_shown() throws Throwable {
	UploadResumePOM uploadresume=new UploadResumePOM();
    uploadresume.NodataFun();
    logger.info("Resume Uploaded Sucessfully"); 

}



}
