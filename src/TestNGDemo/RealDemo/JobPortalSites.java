package TestNGDemo.RealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class JobPortalSites extends Base {


    @Test
    public void naukri() {
        driver.get("https://www.naukri.com");
       // driver.findElement(By.linkText("Login")).click();
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
       // driver.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
        //driver.findElement(By.linkText("Sign In")).click();
    }

    @Test
    public void shine() {
        driver.get("https://www.shine.com");
      //  driver.findElement(By.linkText("Login")).click();
    }

}
