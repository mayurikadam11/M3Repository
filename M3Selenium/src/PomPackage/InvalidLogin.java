package PomPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.browserSetUp();

		WelcomePage wp = new WelcomePage(driver);  //create object of the welcome page
		wp.getloginLink().click();//to click on login link
		
       
		Flib flib = new Flib();
		int rc = flib.lastRowCount(PROP_PATH, INVALIDLOGINCREDS);

		
		LoginPage lp=new LoginPage(driver);// create object of login page

		for (int i = 1; i <= rc; i++) {
			String email = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 0);//to read email
			String password = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 1);
			
			lp.invalidLoginMethod(email,password);

			

		}
	}

}
