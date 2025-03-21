package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage{
	//Declaration
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password") private WebElement passwordTB;
	@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
	@FindBy(id="RememberMe")  private WebElement rememberMeCheckBox;
	@FindBy(linkText="Forgot password") private WebElement forgotpasswordlink;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
	//Utilization
	public WebElement getemailTB() {
		return emailTB;
		
	}
	public WebElement getpasswordTB() {
		return passwordTB;
		
	}
	public WebElement  loginButton() {
		return  loginButton;
		
	}
	public WebElement rememberMeCheckBox() {
		return rememberMeCheckBox;
		
	}
	public WebElement  forgotpasswordlink() {
		return  forgotpasswordlink;
		
	}

	public void invalidLoginMethod(String email, String password) throws InterruptedException {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
		Thread.sleep(1000);
		emailTB.clear();
		passwordTB.clear();
		
		
	}
	public void validLoginMethod(String email, String password) throws InterruptedException {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
		
		
		
	}

}

