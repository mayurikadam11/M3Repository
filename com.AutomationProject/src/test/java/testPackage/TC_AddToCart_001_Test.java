package testPackage;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;

import pompackage.ElectronicsPage;

import pompackage.ShoppingCartPage;

import pompackage.WelcomePage;

@Listeners(genericLibrary.MyListeners.class)

public class TC_AddToCart_001_Test extends BaseTest{
  @Test

public void addToCartMethod() {
	
	WelcomePage wp = new WelcomePage(driver);
	wp.getelectronicsLink().click();

	ElectronicsPage ep = new ElectronicsPage(driver);
	ep.getCellphoneLink().click();

	ep.getSmartphoneAddToCartButton().click();
	wp.getShoppingCartLink().click();

	ShoppingCartPage sp = new ShoppingCartPage(driver);
	sp.getSmartphoneCheckbox().click();
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(),true,"Product is added to cart");
	
	sa.assertAll();
	
//	if (sp.getsmartphoneCartProduct().isDisplayed()) {
//		System.out.println("Product is added to cart");
//	} 
//	else 
//	{
//
//		System.out.println("Product is not added to cart");
//	}
	
	

}
}
