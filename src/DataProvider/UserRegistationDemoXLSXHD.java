package DataProvider;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class UserRegistationDemoXLSXHD {

    @Test  (dataProvider = "getData")
    public void userRegistration(String nameStr,String emailStr,String contactStr,String cityStr,String addressStr) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/practice/5fileds.html");

        driver.manage().window().maximize();


        // Locate elements
        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement contact = driver.findElement(By.id("contact"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement address = driver.findElement(By.id("address"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));

        // Perform actions
        name.sendKeys(nameStr);
        email.sendKeys(emailStr);
        contact.sendKeys(contactStr);
        city.sendKeys(cityStr);
        address.sendKeys(addressStr);

        // Click submit
        //submitBtn.click();

    }

    @DataProvider
    Object[][] getData() throws IOException {
        // 1. Read the file
        FileInputStream fis = new FileInputStream("Data/Data2.xlsx");

        // 2. create the Workbook Object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // 3. choose the sheet
        XSSFSheet sheet = workbook.getSheet("user registration");

        // 4. count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for(int i=0 ; i<rowCount-1 ; i++)
        {
            XSSFRow row = sheet.getRow(i+1); // 1

           /* data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();
            data[i][2] = row.getCell(2).toString();
            data[i][3] = row.getCell(3).toString();
            data[i][4] = row.getCell(4).toString();*/

            for (int j=0;j<colCount;j++)
                data[i][j] = row.getCell(j).toString();

        }



        return data;

    }


}
