package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// it is use to store Generic Reusable Methods
		// All the Generic Reusable Methods are non static
		
		   // Read the Data From Excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of file which we want to work with
		Workbook wb = WorkbookFactory.create(fis);//make a file ready to read
		 Sheet sheet = wb.getSheet(sheetName);//provide sheet name
	     Row row = sheet.getRow(rowcount);//get inti desired row
	     Cell cell = row.getCell(cellcount);//get into desired cell
	    String data = cell.getStringCellValue();//it is use to read the value from cell
	    return data;
	}
	//write the data into excel sheet
	public void writePropertyData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);	
	}
	
	// get the last row count from excel sheet
	public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc= sheet.getLastRowNum();//it is use to get count of last row where we store the data
		return rc;
	}
	
	// read the data From property File
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
	}
	
	
	


