package JunitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {



    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername1 = driver.findElement(By.name("email"));
        txtUsername1.sendKeys("amolujagare122@gmail.com");

        WebElement txtPassword1 = driver.findElement(By.id("pwField"));
        txtPassword1.sendKeys("fdfdfd");

        WebElement btnLogin1 = driver.findElement(By.className("btn-login"));
        btnLogin1.click();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername2 = driver.findElement(By.name("email"));
        txtUsername2.sendKeys("");

        WebElement txtPassword2 = driver.findElement(By.id("pwField"));
        txtPassword2.sendKeys("");

        WebElement btnLogin2 = driver.findElement(By.className("btn-login"));
        btnLogin2.click();



    }
}
