package ExtentReports.util;

import TestNGDemo.RealDemo.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReports.util.ForExtentReports.initExtent;
import static ExtentReports.util.ForExtentReports.screenshot;
//import static TestNGDemo.RealDemo.Base.driver;

public class MyExtentListeners extends Base implements ITestListener {

    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
         test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("this test is passed :"+result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {

        test.fail("this test is failed :"
                +result.getMethod().getMethodName()
        +"\n"+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void onStart(ITestContext context) {
        if(extent==null)
         extent = initExtent();
    }

    public void onFinish(ITestContext context) {

        extent.flush();
    }
}
