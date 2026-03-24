package TestNGDemo.Assertion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestNGLoginDemo {

    @Test
    public void loginTest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

      // Thread.sleep(4000);

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // explicit wait
          /*  WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs("Dashboard — StockMaster Pro"));*/

      /*  String expected = "Dashboard — StockMaster Pro";
        String actual  = driver.getTitle();*/

        /*String expected = "https://amolujagare.com/stockmaster/pages/dashboard.php";
        String actual  = driver.getCurrentUrl();*/


        /*String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);*/

        String expected = "Recent Products";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='app']//div[1]//div[1]//div[1]//div[1]")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a Dashboard");

    }

    @Test
    public void loginTest2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagaresdsd@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admindsds123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String expected = "Invalid email or password. Please try again.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a Dashboard");

    }

    @Test
    public void loginTest3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String expected = "Both fields are required.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"Incorrect or No error message");


    }


    @Test
    public void addCustomer() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.linkText("+ Add Customer")).click();




        driver.findElement(By.className("btn-primary")).click();



        String expected = "Full name is required.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='field-error']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"Incorrect or No error message");


    }

    @Test
    public void addCustomer2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.linkText("+ Add Customer")).click();


        driver.findElement(By.id("f_email")).sendKeys("tanishq.sharmagmail.com");

        driver.findElement(By.id("f_phone")).sendKeys("sdsdsds");




        driver.findElement(By.className("btn-primary")).click();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Full name is required.");
        expected.add("Enter a valid email address.");
        expected.add("Valid phone number required.");

        ArrayList<String> actual = new ArrayList<>();



        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//div[@class ='field-error']"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"Incorrect or No error message");


    }
}
