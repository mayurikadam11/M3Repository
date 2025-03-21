package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheNumberOfRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

      //To specify the path of file
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");

		//to make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
	   
		//To get into the desired sheet
       Sheet sheet=wb.getSheet("ipl");
       
       //to count the no of rows
       int rc = sheet.getLastRowNum();
       System.out.println(rc);
       
       
       
   
       
	   Row row=sheet.getRow(5); //To get into the Row
	   Cell cell=row.createCell(5);//To create a new column
       System.out.print("create cell");
	    
	   cell.setCellValue("LSG"); //To set the value of column
	   FileOutputStream fos = new FileOutputStream ("./testData/testdata.xlsx");
	   wb.write(fos); // to write the data in excel file
	   wb.close();
	   System.out.print("done");


	}

}
