package PomPackage;

	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

	public class BaseTest{
		private static final String PROP_PATH = null;
		private static final String URL = null;
		protected static WebDriver driver;
		
		public void browserSetUp() throws IOException{
	Flib flib = new Flib();
	String browser = flib.readPropertydata(PROP_PATH, "chrome");
	String url = flib.readPropertydata(PROP_PATH, URL);
	if(browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")){
		driver= new EdgeDriver(); 
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver(); 
	}
	else
	{
		System.out.println("Enter the valid url");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("url");

	}
		
		public void browserTearDown()
		{
			driver.quit();
		}
	}



