package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompackage.LoginPage;
import pompackage.LoginPage;
import pompackage.WelcomePage;


public class BaseTest implements IAUtoConstant{
	

	protected static WebDriver driver;
   @BeforeClass
	public void browserSetUp() throws IOException  {
//		System.out.println("Working Directory = " + System.getProperty("user.dir"));
//		System.out.println("Working Directory = " + PROP_PATH_MAIN);

		Flib flib = new Flib();
		String browser = flib.readPropertydata(PROP_PATH_MAIN, "browser");
		String url = flib.readPropertydata(PROP_PATH_MAIN, URL);
//		System.out.println("params = " + browser + url);

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} 
		
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
		
		else {
			System.out.println("Enter the valid url");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

	}
   @BeforeMethod
   public void validLogin() throws EncryptedDocumentException, IOException, InterruptedException {
	   WelcomePage wp = new WelcomePage(driver);
	   wp.getloginLink().click();
	   
	  LoginPage lp = new LoginPage(driver);
	 Flib flib = new Flib();
	 String email = flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 0);
	    String password=flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 0);
	   lp.validLoginMethod(email, password);
   }
   @AfterMethod
   public void logOut() {
	   
	   
	   WelcomePage wp=new WelcomePage(driver);
	   wp.logout();
   }
   
   
   @AfterClass

	public void browserTearDown() {
		driver.quit();
	}

}

