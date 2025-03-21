package TestNGListener;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataDrivenFramework.Flib;
import dataDrivenFramework.IAUtoConstant;

@Listeners(TestNGListener.MyListeners.class)
public class ValidLogin extends BaseTest {

	@Test
	public void validLoginTC() throws EncryptedDocumentException, IOException  {
		
		WelcomePage wp=new WelcomePage(driver);
		wp.loginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);

		LoginPage lp=new LoginPage(driver);
		lp.validloginMethod(email,password);
	}

}


