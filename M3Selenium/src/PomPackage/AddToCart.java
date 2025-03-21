package PomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class AddToCart extends BaseTest implements IAutoConstant {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		WelcomePage wp = new WelcomePage(driver);
		wp.getloginLink().click();

		Flib flib = new Flib();

		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);

		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, password);

		ElectronicsPage ep = new ElectronicsPage(driver);
		wp.getelectronicsLink().click();

		ep.getCellphoneLink().click();

		ep.getSmartphoneAddToCartButton().click();

		wp.getShoppingCartLink().click();

		
//		ShoppingCartPage sp = new ShoppingCartPage(driver);
//		if (sp.getsmartphoneCartProduct().isDisplayed()) {
//			System.out.println("Product is added to cart");
//		} else {
//
//			System.out.println("Product is not added to cart");
//		}
		
		ShoppingCartPage sp =new ShoppingCartPage(driver);
		boolean result=sp.getSmartphoneCartProduct().isDisplayed();
		System.out.println(result);
		

	}

}
