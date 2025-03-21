package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class WelcomePage{
	@FindBy(linkText="Register") private WebElement registerLink;
	@FindBy(linkText=" Log in") private WebElement loginLink;
	@FindBy (xpath="//span[text()='Shopping cart") private WebElement ShoppingCartLink;
	@FindBy (xpath="//span[text()='Wishlist')]")  private WebElement wishlistLink;
    @FindBy(partialLinkText="BOOKS") private WebElement booksLink;
    @FindBy(partialLinkText="COMPUTERS") private WebElement computerLink;
    @FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLink;
	@FindBy(linkText="Log out") private WebElement logoutLink;

    
  //Initialization
  	public WelcomePage(WebDriver driver)
  	{
  		PageFactory.initElements(driver, this);
  	}
  			
  	//Utilization
  	public WebElement  getregisterLink() {
  		return  registerLink;
  		
  	}
  	public WebElement  getloginLink() {
  		return  loginLink;
  		
  	}
  	public WebElement getShoppingCartLink() {
  		return  ShoppingCartLink;
  		
  	}
  	public WebElement getwishlistLink() {
  		return  wishlistLink;
  		
  	}
  	public WebElement getbooksLink() {
  		return booksLink;
  		
  	}
  	public WebElement getcomputerLink() {
  		return computerLink;
  		
  	}
  	public WebElement getelectronicsLink() {
  		return electronicsLink;
  		
  	}

	public void logout() {
		logoutLink.click();
	}
	public WebElement getLogoutLink() {
  		return logoutLink;
  		
  	}
  	
}

