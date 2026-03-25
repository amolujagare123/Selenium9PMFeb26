package ExtentReports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static ExtentReports.util.ForExtentReports.screenshot;

public class TestNGLoginDemo {


    ExtentReports extent;

    @BeforeClass
    public void init() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Master Project");
        reporter.config().setReportName("Regression testing");

        extent.setSystemInfo("Developers Name", "Srisha");
        extent.setSystemInfo("Testers Name", "Rahul");
        extent.setSystemInfo("Project Manager", "Amol");
        extent.setSystemInfo("Sprint Name", "Sprint 001");
        extent.setSystemInfo("Project Deadline", "Dec 2026");

    }

    @AfterClass
    public void writeToReport() {
        extent.flush();
    }


    @Test
    public void loginTest1() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("admin12");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        test.info("login button is clicked");
        // Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String expected = "Recent Products";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='app']//div[1]//div[1]//div[1]//div[1]")).getText();
        } catch (Exception e) {

        }
        System.out.println("Expected=" + expected);
        System.out.println("Actual=" + actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a Dashboard");
            test.pass("this test is passed");
        } catch (AssertionError e) {
            test.fail("This Test is failed:" + e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amol@gmail.com");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("sdsds");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String expected = "Invalid email or password. Please try again.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        } catch (Exception e) {

        }
        System.out.println("Expected=" + expected);
        System.out.println("Actual=" + actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a Dashboard");
            test.pass("this test is passed");
        } catch (AssertionError e) {
            test.fail("This Test is failed:" + e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {

        ExtentTest test = extent.createTest("blank login test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();
        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String expected = "Both fields are required.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        } catch (Exception e) {

        }
        System.out.println("Expected=" + expected);
        System.out.println("Actual=" + actual);

        try {
            Assert.assertEquals(actual, expected, "Incorrect or No error message");
            test.pass("this test is passed");
        } catch (AssertionError e) {
            test.fail("This Test is failed:" + e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));

        }


    }

}
