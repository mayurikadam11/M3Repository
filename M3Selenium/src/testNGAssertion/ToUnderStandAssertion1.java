package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderStandAssertion1 {
	@Test
	public void validLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String expectedLoginPageTitle = "Demo Web Shop";
		String expectedWelcomePageTitle = "Demo Web Shop,Login ";
		Assert.assertEquals(driver.getTitle(), expectedWelcomePageTitle, "Welcome Page Not Found");

		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle().equalsIgnoreCase(expectedWelcomePageTitle), "Login Page Not Found");

		driver.findElement(By.id("Email")).sendKeys("kmayuri154@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mayuri@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
