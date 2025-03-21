package TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
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
	public WebElement getEmailTextBox() {

		return  emailTB;
	}
	public WebElement getpasswordTextBox() {

		return passwordTB;
	}
	public WebElement getLoginButton() {

		return loginButton;
	}

	public void validloginMethod(String email, String password) {
		
		
	}
 
}

