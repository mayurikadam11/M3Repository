package testNGPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandEnabled {
	
	//enabled -- is a helper method
	//By default it will be true
	//If it is true - will execute method, else if it is false- will not execute the method
	//enables -- will accept boolean type of data
	//If we don't want to execute method or testcase --either use invocationCount=0 or enables=false
	
	
	
  @Test(enabled=true)  //will be executed
  public void launchSelenium() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
		}
  @Test(enabled=true)  //will not be executed
  public void launchJavaPoint() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.tpointtech.com/");
	    driver.close();

	}
 
}
