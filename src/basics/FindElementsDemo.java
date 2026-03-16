package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/practice/multipleElements.html");

        List<WebElement> wbList = driver.findElements(By.tagName("input"));

        System.out.println("total elements = "+wbList.size());

        wbList.get(0).sendKeys("amol");
        wbList.get(1).sendKeys("ujagare");
        wbList.get(2).sendKeys("amol@gmail.com");
        wbList.get(3).sendKeys("4343434");
        wbList.get(4).sendKeys("xyz pune");
        wbList.get(5).sendKeys("pune");
        wbList.get(6).sendKeys("maharastra");
        wbList.get(7).sendKeys("411041");
        wbList.get(8).sendKeys("India");
        wbList.get(9).sendKeys("amol123");

    }
}
