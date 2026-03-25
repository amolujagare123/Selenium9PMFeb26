package ExtentReports.util;

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
}
