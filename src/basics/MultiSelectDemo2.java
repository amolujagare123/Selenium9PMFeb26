package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/60/post.html");

        // 1. find the element
        WebElement jobLocation = driver.findElement(By.id("source_118"));

        // 2. create the object of the Select class
        Select selText = new Select(jobLocation);


        // 3. select the option
        selText.selectByVisibleText("Bangalore");
        selText.selectByVisibleText("Chennai");
        selText.selectByVisibleText("Mumbai");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


        // 1. find the element
        WebElement jobLocation2 = driver.findElement(By.id("fld_118"));

        // 2. create the object of the Select class
         selText = new Select(jobLocation2);

         Thread.sleep(2000);

        selText.selectByVisibleText("Chennai");
        selText.selectByVisibleText("Mumbai");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();


    }
}
