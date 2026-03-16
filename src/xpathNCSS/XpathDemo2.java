package xpathNCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.livehelperchat.com/site_admin/user/login/(r)/L3NpdGVfYWRtaW4vLw%3D%3D");

            Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Password reminder']")).click();

    }
    }
