package DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGLoginDemo {

    @Test (dataProvider = "getData")
    public void loginTest1(String username,String password) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("pwField"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

    }

    @DataProvider
    Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] = "amolujagare@gmail.com";
        data[0][1] = "admin123";

        data[1][0] = "xyz@gmail.com";
        data[1][1] = "1234";

        data[2][0] = "abc@gmail.com";
        data[2][1] = "1234";

        data[3][0] = "std@gmail.com";
        data[3][1] = "1234";

        return data;

    }


}
