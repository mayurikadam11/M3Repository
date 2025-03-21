package TestCasePackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_LaunchGoogle_001_Test {
  @Test
  public void launchGoogle() {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 System.out.print("mayuri");
	 driver.get("https://www.google.co.in/");
	 driver.close();
  }
}
