package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pompackage.CheckoutPage;
import pompackage.ElectronicsPage;
import pompackage.ShoppingCartPage;
import pompackage.WelcomePage;

@Listeners(genericLibrary.MyListeners.class)

public class TC_BuyAProductFromCart_003_Test extends BaseTest {
	@Test
	public void buyAProductMethod() throws EncryptedDocumentException, IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getelectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellphoneLink().click();

		ep.getSmartphoneAddToCartButton().click();
		wp.getShoppingCartLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartphoneCheckbox().click();

		sp.getTermsofservicesCheckbox().click();
		sp.getCheckoutButton().click();

		CheckoutPage cp = new CheckoutPage(driver);
		cp.buyProduct();
	}
}
