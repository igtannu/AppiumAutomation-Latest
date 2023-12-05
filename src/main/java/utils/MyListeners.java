package utils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;


public class MyListeners implements ITestListener {
	@Override
	public void onFinish(ITestContext context) {
		
			String pathOfExtentReport = "C:\\Users\\tanugupta02\\OneDrive - Nagarro\\Desktop\\Appium\\Reports\\Spark\\ExtentSpark.html";

		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

		
	}
	

