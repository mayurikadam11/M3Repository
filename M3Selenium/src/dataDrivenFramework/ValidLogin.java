package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		Flib flib = new Flib();
		
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);
		
		String url = flib.readPropertydata(PROP_PATH, URL);
		
       BaseTest bt = new BaseTest();
       bt.browserSetUp();
       
     

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);		
		bt.browserTearDown();

	}

}
