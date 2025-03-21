package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotation {
	  
    @BeforeTest
    public void beforeTestMethod() {
  	
  	  Reporter.log("This is BeforeTest Method", true);
    }
    
    @AfterMethod
    public void afterMethod() {
  	  
  	  Reporter.log("This is After Method", true);
    }
    
    @BeforeSuite
    public void beforeSuiteMethod() {
  	  
  	  Reporter.log("This is BeforeSuit Method", true);
    }
    
    @AfterClass
    public void afterClassMethod() {
    	  
    	  Reporter.log("This is afterClass Method", true);
      }
    
    
    @AfterSuite
    public void afterSuiteMethod() {
  	  
  	  Reporter.log("This is After Suite Method", true);
    }
  
   @BeforeClass
    public void beforeClassMethod() {
	   
	  	  Reporter.log("This is Before class", true);
   }
   
   @BeforeMethod
   public void beforeMethod() {
	   
	  	  Reporter.log("This is BeforeMethod Method", true);
  }
   
   @AfterTest
   public void afterTestMethod() {
	   
	  	  Reporter.log("This is AfterTest Method", true);
  }
   
   @Test
   public void Test2() {
	   
	  	  Reporter.log("This is Test Method", true);
  }
   
   
   
   
   
}
