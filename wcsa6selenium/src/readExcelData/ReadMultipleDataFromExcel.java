package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
//read the data from ipl sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read multiple values from sheet
		for(int i=1;i<=7;i++)
		{
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");//select the sheet 
		Workbook wb = WorkbookFactory.create(fis);//make file ready to read
		Sheet sheet = wb.getSheet("IPL");//provide the sheet name
		Row row = sheet.getRow(i);//get into desired row
		Cell cell = row.getCell(0);//get into the desired cell or column
		String data = cell.getStringCellValue();//it will read the value from the cell
		Thread.sleep(2000);
		System.out.println(data);
		}
	}
}
