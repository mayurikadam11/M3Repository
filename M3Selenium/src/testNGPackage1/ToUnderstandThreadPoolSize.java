package testNGPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//ThreadPoolSize-- is a helper Attribute
//It is used  to execute the testcase(method) multiple times Parallely.
//by default threadPoolSize will be 1
//threadPoolSize will accept integer,normally we will give it similar to invocationCount to run testcase same times parallely.
//dont't use threadPoolSize --without invocationCount
//This method will be invoked 5 times -- at a time in 3 browser and later once is done will exceute again 2times


public class ToUnderstandThreadPoolSize {
  @Test(invocationCount=5,threadPoolSize=3)
	  public void launchSelenium() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.selenium.dev/");
			Thread.sleep(2000);
			driver.close();
			
			
		}
  }
