package TestNGExecution2;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
	
	@Test
	public void crossBrowser(@Optional("chrome") String browserValue) throws InterruptedException {
		WebDriver driver = null;

		if (browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(3000);
		driver.close();
	}
}
