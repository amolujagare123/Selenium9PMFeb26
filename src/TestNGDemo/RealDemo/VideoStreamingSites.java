package TestNGDemo.RealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class VideoStreamingSites {

    WebDriver driver;

    @BeforeClass // This method executes before first test method of the class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass  // This method executes after last test method of the class
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void youtube() {
        driver.get("https://www.youtube.com");
      //  driver.findElement(By.linkText("Sign in")).click();

        Assert.assertEquals(driver.getTitle(),"utube site","we are not on youtube");
    }

    @Test
    public void netflix() {
        driver.get("https://www.netflix.com");
       // driver.findElement(By.linkText("Sign In")).click();
    }

    @Test
    public void hotstar() {
        driver.get("https://www.hotstar.com");
      //  driver.findElement(By.linkText("Log in")).click();
    }

    @Test
    public void primevideo() {
        driver.get("https://www.primevideo.com");
      //  driver.findElement(By.linkText("Sign in")).click();
    }

}
