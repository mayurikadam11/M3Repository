package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependonMethod {
	
	// dependsOnMethod -- is a helper Attribute
  @Test(dependsOnMethods="register")
  public void login() {
	  Reporter.log("This method is login method",true);
  }
  
  @Test
  public void register() {
	  Reporter.log("This method is register method",true);
  }
  
  @Test(dependsOnMethods="login")
  public void checkAccountBalance() {
	  Reporter.log("This method is checkAccountBalance method",true);
  }
  
  @Test(dependsOnMethods= {"login","moneyTransfer"})
  public void logOut() {
	  Reporter.log("This method is logOut method",true);
  }
  
  @Test(dependsOnMethods= {"login","register"})
  public void moneyTransfer() {
	  Reporter.log("This method is moneyTransfer method",true);
  }
}

//Output:
//This method is register method
//This method is login method
//This method is checkAccountBalance method
//This method is moneyTransfer method
//This method is logOut method
