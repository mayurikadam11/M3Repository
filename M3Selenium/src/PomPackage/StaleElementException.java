package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
          WebDriver	driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.get("https://demowebshop.tricentis.com/");
          
          driver.findElement(By.linkText("Log in")).click();
          
         WebElement email = driver.findElement(By.id("Email"));
         
         driver.navigate().refresh();
         Thread.sleep(2000);
         
         driver.findElement(By.id("Email")).sendKeys("kmayuri154@gmail.com");
         driver.findElement(By.id("Password")).sendKeys("Mayuri@123");
         
          
          

	}

}
