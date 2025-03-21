package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	

	//Declaration
		@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") 
		private WebElement smartphoneCartProduct;
		
		@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Phone Cover']") private WebElement phoneCoverCartProduct;

		
		@FindBy(className="cart=qty") private WebElement shoppingCartCount;
		
		@FindBy(xpath="//h1[text()='Shopping cart']/../..//img[@title='Show details for Phone Cover]/../..input[@name='removefromcart']") 
		private WebElement smartphoneCheckbox;

		

		//Initialization
		public  ShoppingCartPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//Utilization
		
		public WebElement getSmartphoneCartProduct() {
			return smartphoneCartProduct;
		}
		
		public WebElement getPhoneCoverCartProduct() {
			return phoneCoverCartProduct;
		}
		
		public WebElement getShoppingCartCount() {
			return shoppingCartCount;
		}

		public WebElement getSmartphoneCheckbox() {
			return smartphoneCheckbox;
		}


	}
	

