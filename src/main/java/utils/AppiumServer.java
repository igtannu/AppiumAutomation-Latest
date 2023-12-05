package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	
	//To start and stop Server
	protected static AppiumDriverLocalService service;
	public static void startservice() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public static void stopservice() {
		service.stop();
	}

}
