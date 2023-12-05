package utils;import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {

    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<ExtentTest>();

    public static ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    public static void setTest(ExtentTest extentTest) {
        extentTestThreadLocal.set(extentTest);
    }

    public static void removeTest() {
        extentTestThreadLocal.remove();
    }
}
