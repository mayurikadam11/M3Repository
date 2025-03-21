package testNGPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

  //invocationCount -- is a helper Attribute
  //It is used when we want to execute same method multiple times
  //We can pass count in the form of integer -- that much times method will get execute
  //invocation count should be equal to or greater than 0 -- that is it will be always positive
  //By default the invocation count will be 1-- and execute the method once


public class ToUnderstandInvocationCount {
	@Test(invocationCount = 2) // will be invoked 2 times
	public void launchSelenium() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
		
	}

	@Test(invocationCount = 0) // will be invoked 0 times
	public void launchJavaPoint() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.tpointtech.com/");
		Thread.sleep(2000);
		driver.close();

	}
}
