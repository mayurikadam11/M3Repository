package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchInstagram {
  @Test
  public void f1() throws InterruptedException {
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 driver.get("https://www.instagram.com/accounts/login/");
			 Thread.sleep(3000);
			 driver.close();
		  }
  }

