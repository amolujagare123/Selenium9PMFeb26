package TestNGDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGLoginDemo3 {

    WebDriver driver;

    @BeforeClass // This method executes before first test method of the class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // This method executes after last test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginTest1() throws InterruptedException {
        Thread.sleep(2000);

        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
       // btnLogin.click();

        Thread.sleep(2000);
    }

    @Test
    public void loginTest2() throws InterruptedException {

        Thread.sleep(2000);
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagaresdsd@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admindsds123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        Thread.sleep(2000);
    }

    @Test
    public void loginTest3() throws InterruptedException {

        Thread.sleep(2000);
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        Thread.sleep(2000);

    }
}
