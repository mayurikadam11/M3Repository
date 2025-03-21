package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ElectronicsPage {
	// Declaration
	@FindBy(partialLinkText = "Cell phones")
	private WebElement CellphoneLink;
	@FindBy(xpath = "//a[text()='smartphone']/../..//input[@value='Add to cart']")
	private WebElement SmartphoneAddToCartButton;

	// Initialization
	public ElectronicsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getCellphoneLink() {
		return CellphoneLink;
	}

	public WebElement getSmartphoneAddToCartButton() {
		return SmartphoneAddToCartButton;
	}


}

