package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ShoppingCartPage {
	
	
	//Declaration
	@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") 
	private WebElement smartphoneCartProduct;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Phone Cover]/../..input[@name='removefromcart']") 
	private WebElement smartphoneCheckbox;
	
	@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Phone Cover']") private WebElement phoneCoverCartProduct;
	
	@FindBy(className="cart=qty") private WebElement shoppingCartCount;
	
	@FindBy(name="updatecart") private WebElement updateShoppingCartButton;
	
	@FindBy(name="continueshooping") private WebElement continueShoppingButton;
	
	@FindBy(id="termsofservice") private WebElement termsofservicesCheckbox;
	
	@FindBy(id="checkout") private WebElement checkoutButton;
	
	
	
	//Intitialization
	public  ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
  //Utilization

  public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}



	public WebElement getSmartphoneCheckbox() {
		return smartphoneCheckbox;
	}



	public WebElement getPhoneCoverCartProduct() {
		return phoneCoverCartProduct;
	}



	public WebElement getShoppingCartCount() {
		return shoppingCartCount;
	}



	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}



	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}



	public WebElement getTermsofservicesCheckbox() {
		return termsofservicesCheckbox;
	}



	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	

}

