package pompackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.SelectUtility;

public class CheckoutPage extends BaseTest {

	// Declaration

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryDD;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNoTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confiemOrderConfirmButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement orderProcessedText;
	@FindBy(id = "billing_address_select")
	private WebElement billingAddressOldAddressDD;

	// Intitialization

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Utilization

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddressTB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfiemOrderConfirmButton() {
		return confiemOrderConfirmButton;
	}

	public WebElement getOrderProcessedText() {
		return orderProcessedText;
	}

	public WebElement getBillingAddressOldAddressDD() {
		return billingAddressOldAddressDD;
	}

	// Operational Methods

	public void buyProduct() throws EncryptedDocumentException, IOException {

		SelectUtility su = new SelectUtility();
		try {
			if (billingAddressOldAddressDD.isDisplayed() == true) {
				su.selectByVisibleTextMethod(billingAddressOldAddressDD, "New Address");
			}
		} catch (Exception e) {
			su.selectByVisibleTextMethod(billingAddressOldAddressDD, "New Address");

		}

		su.selectByVisibleTextMethod(countryDD, "India");

		Flib flib = new Flib();
		int rn = flib.randomNumber();
		String city = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 1);
		long pin = flib.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
		long phone = flib.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);

		// Because of String we are getting dot(.) in the result so use long
		// String pin = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
		// String phone = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1,
		// 3);

		String phoneNo = phone + "" + rn;

		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(String.valueOf(pin));
		phoneNoTB.sendKeys(String.valueOf(phoneNo));
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confiemOrderConfirmButton.click();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(orderProcessedText.isDisplayed(), true, "order is not Placed");
		sa.assertAll();

	}
}
