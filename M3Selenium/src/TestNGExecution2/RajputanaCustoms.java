package TestNGExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RajputanaCustoms {
  @Test
  public void method2() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://rajputanacustoms.com/");
		 Thread.sleep(3000);
		 driver.close();
  }
}
