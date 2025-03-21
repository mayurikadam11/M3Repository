package TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText="Register") private WebElement registerLink;
	@FindBy(linkText=" Log in") private WebElement loginLink;
	@FindBy (xpath="//span[text()='Shopping cart") private WebElement ShoppingCartLink;
	@FindBy (xpath="//span[text()='Wishlist')]")  private WebElement wishlistLink;
    @FindBy(partialLinkText="BOOKS") private WebElement booksLink;
    @FindBy(partialLinkText="COMPUTERS") private WebElement computerLink;
    @FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLink;
    
  //Initialization
  	public WelcomePage(WebDriver driver)
  	{
  		PageFactory.initElements(driver, this);
  	}
  			
  	//Utilization
  	public WebElement  registerLink() {
  		return  registerLink;
  		
  	}
  	public WebElement  loginLink() {
  		return  loginLink;
  		
  	}
  	public WebElement ShoppingCartLink() {
  		return  ShoppingCartLink;
  		
  	}
  	public WebElement wishlistLink() {
  		return  wishlistLink;
  		
  	}
  	public WebElement booksLink() {
  		return booksLink;
  		
  	}
  	public WebElement computerLink() {
  		return computerLink;
  		
  	}
  	public WebElement electronicsLink() {
  		return electronicsLink;
  		
  	}
  	
}
