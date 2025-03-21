package testNGDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {
  @Test
  public String[][] dataproviderMethod() throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
	   
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
	   
	   Sheet sheet =wb.getSheet("invalidlogincreds");//To get into the desired sheet
	   
	  int rowCount = sheet.getPhysicalNumberOfRows() - 1;
	  int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	  String[][] arr=new String[rowCount][cellCount];
	  for(int i=1;i<=rowCount;i++) {
		  for(int j=0;j<=cellCount;j++) {
			  arr[i-1][j]=sheet.getRow(i).getCell(j).toString();
		  }
	  }
	  return arr;
  }
  @Test(dataProvider ="invalidlogincreds",dataProviderClass=testNGDataProvider.DataProviderUsingExcel.class)
	  
  public void invalidLogin(String email,String password) {
  
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
  }
}
	  
	  
	  
	  
	  
	  
	  
	  
	  

