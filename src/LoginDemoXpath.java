import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoXpath {



    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();

        /*driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.linkText("+ Add Customer")).click();


        driver.findElement(By.id("f_name")).sendKeys("Tanishq Sharma");

        driver.findElement(By.id("f_email")).sendKeys("tanishq.sharma@gmail.com");

        driver.findElement(By.id("f_phone")).sendKeys("+91 9876543210");

        driver.findElement(By.id("f_company")).sendKeys("Sharma Technologies Pvt Ltd");

        driver.findElement(By.id("f_credit")).sendKeys("50000");

        driver.findElement(By.name("city")).sendKeys("Pune");

        driver.findElement(By.name("country")).sendKeys("India");

        driver.findElement(By.name("address")).sendKeys("Flat No 302, Gokhale Nagar, Shivajinagar");

        driver.findElement(By.name("notes")).sendKeys("Premium customer from Maharashtra region. Interested in enterprise solutions.");

        driver.findElement(By.className("btn-primary")).click();
*/

    }
}
