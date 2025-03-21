package dataDrivenFramework;

import java.awt.Window;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAUtoConstant {

	static WebDriver driver;

	public void browserSetUp() throws IOException {

		Flib flib = new Flib();

		String browserValue = flib.readPropertydata(PROP_PATH, "browser");
		String url = flib.readPropertydata(PROP_PATH, URL);

		if (browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Enter the valid browser name");
		}

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	public void browserTearDown() {
		driver.quit();
	}
}
