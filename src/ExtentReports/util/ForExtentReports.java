package ExtentReports.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static String screenshot(WebDriver driver) throws IOException {

        // 1. create the object reference of TakesScreenshot
        // assign the current driver to it. type cast driver into TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. Call the method getScreenshotAs() using ts object reference of TakesScreenshot

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // 3. copy the file object into a real image file

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        FileUtils.copyFile(srcFile , new File("Reports\\screenshots\\"+fileName));

        return fileName;
    }

    public static ExtentReports initExtent() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Master Project");
        reporter.config().setReportName("Regression testing");

        extent.setSystemInfo("Developers Name", "Srisha");
        extent.setSystemInfo("Testers Name", "Rahul");
        extent.setSystemInfo("Project Manager", "Amol");
        extent.setSystemInfo("Sprint Name", "Sprint 001");
        extent.setSystemInfo("Project Deadline", "Dec 2026");

        return extent;

    }
}
