package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginWithDataProvider {
	@DataProvider(name="logincreds")
  
  public String[][] dataProvider() {
		String[][] data= {
				{"admin@1234@gmail.com","Mayu"},
				{"divya345@gmail.com","divya"},
				{"vaishu789gmail.com","vaishu"}
		};
		
	return data;
  }
	@Test(dataProvider = "logincreds",dataProviderClass=testNGDataProvider.loginWithDataProvider.class)
	public void invalidLogin(String email,String password) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
	}
}
