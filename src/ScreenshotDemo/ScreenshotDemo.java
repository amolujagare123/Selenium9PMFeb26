package ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void screenshotDemo() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/practice");

        // 1. create the object reference of TakesScreenshot
        // assign the current driver to it. type cast driver into TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. Call the method getScreenshotAs() using ts object reference of TakesScreenshot

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // 3. copy the file object into a real image file

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        FileUtils.copyFile(srcFile , new File("screenshots\\"+fileName));

    }
}
