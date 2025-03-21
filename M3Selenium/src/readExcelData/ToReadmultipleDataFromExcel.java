package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadmultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis1 = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("ipl");
		int rc = sheet1.getLastRowNum();
		System.out.println(rc);

		for (int i = 1; i <= rc; i++) {
			// To specify the path of file
			FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");

			// To make the file ready to read
			Workbook wb = WorkbookFactory.create(fis);

			// To go to the desired sheet
			Sheet sheet = wb.getSheet("ipl");

			// To go to the desired row
			Row row = sheet.getRow(i);

			// To go to the desired cell/column
			Cell cell = row.getCell(0);

			// to read data from desired cell/column
			String data = cell.getStringCellValue();

			System.out.println(data);
			Thread.sleep(1000);
		}

	}

}
