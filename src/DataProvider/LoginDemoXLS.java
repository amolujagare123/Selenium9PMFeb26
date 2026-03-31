package DataProvider;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDemoXLS {

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
    Object[][] getData() throws IOException {
        // 1. Read the file
        FileInputStream fis = new FileInputStream("Data/Data.xls");

        // 2. create the Workbook Object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        // 3. choose the sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        // 4. count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for(int i=0 ; i<rowCount ; i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();

        }

        /*data[0][0] = "amolujagare@gmail.com";
        data[0][1] = "admin123";

        data[1][0] = "xyz@gmail.com";
        data[1][1] = "1234";

        data[2][0] = "abc@gmail.com";
        data[2][1] = "1234";

        data[3][0] = "std@gmail.com";
        data[3][1] = "1234";*/

        return data;

    }


}
