package TestNGDemo.RealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class ShoppingSites {

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
    public void amazon() {
        driver.get("https://www.amazon.com");
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void flipkart() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.linkText("Login")).click();
    }

    @Test
    public void ebay() {
        driver.get("https://www.ebay.com");
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void myntra() {
        driver.get("https://www.myntra.com");
        driver.findElement(By.linkText("Login")).click();
    }

}
