package PomPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest(); //create object of the base class
		bt.browserSetUp(); // to perform pre-requisites
		 
		WelcomePage wp = new WelcomePage(driver);  //create object of the welcome page
		 wp.getloginLink().click();//to click on login link
		
       Flib flib = new Flib();  //create object of the flib class
     String  email =flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0); //to read email
     String  password =flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0); //to read password
      
     LoginPage lp=new LoginPage(driver);// create object of login page

     lp.invalidLoginMethod(email,password); //to perform valid login
       

	}

}
