package TestNGDemo.RealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class SocialSites extends Base {



    @Test
    public void facebook() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
    }

    @Test
    public void instagram() {
        driver.get("https://www.instagram.com/accounts/login/");
        driver.findElement(By.linkText("Forgot password?")).click();
    }

    @Test
    public void twitter() {
        driver.get("https://www.twitter.com");
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void linkedin() {
        driver.get("https://www.linkedin.com");
        driver.findElement(By.linkText("Sign in")).click();
    }

}