package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest implements IAUtoConstant {

	public static void main(String[] args) throws IOException, InterruptedException {
		Flib flib = new Flib();
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		driver.findElement(By.linkText("Log in")).click();

		int rc = flib.lastRowCount(PROP_PATH, INVALIDLOGINCREDS);

		for (int i = 1; i <= rc; i++) {
			String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
			String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);

			driver.findElement(By.linkText(" Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();

			Thread.sleep(2000);
			bt.browserTearDown();

		}
	}

}
