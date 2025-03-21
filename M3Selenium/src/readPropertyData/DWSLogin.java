package readPropertyData;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin implements IAutoInterface {

	public static void main(String[] args) throws IOException, InterruptedException {

		Flib flib = new Flib();

		String url = flib.readDataFromPropertyFile(PROP_PATH, "url");
		String email = flib.readDataFromPropertyFile(PROP_PATH, "email");
		String password = flib.readDataFromPropertyFile(PROP_PATH, "password");
	

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		Thread.sleep(2000);
		driver.close();
	}

}
