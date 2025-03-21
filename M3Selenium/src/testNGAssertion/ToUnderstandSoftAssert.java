package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void validLogin() {
	  WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String expectedLoginPageTitle="Demo Web Shop"; //title with errors
		String expectedWelcomePageTitle="Demo Web Shop,Login ";//title with errors
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),expectedWelcomePageTitle, "Welcome Page Not Found");
		
		
		driver.findElement(By.linkText("Log in")).click();
		sa.assertEquals(driver.getTitle().equalsIgnoreCase(expectedLoginPageTitle), "Login Page Not Found");

		driver.findElement(By.id("Email")).sendKeys("kmayuri154@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mayuri@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		sa.assertAll();//mandatory
  }
}
