package JunitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitLoginDemo2 {

    WebDriver driver;

    @Before // This method executes before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After  // This method executes after every test method
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginTest1() {


        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

    }

    @Test
    public void loginTest2() {


        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagaresdsd@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admindsds123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

    }

    @Test
    public void loginTest3() {


        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

    }
}
