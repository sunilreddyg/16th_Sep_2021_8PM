package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Read Excel file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet Access using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Get Row using above sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get Cell Using above row reference
		XSSFCell cell=row.getCell(0);
		
		String Browser=cell.getStringCellValue();
		System.out.println(Browser);
		
		
		String url=row.getCell(1).getStringCellValue();
		System.out.println(url);
		
		
		String username=row.getCell(2).getStringCellValue();
		System.out.println(username);
		
		String password=row.getCell(3).getStringCellValue();
		System.out.println(password);
		
		
		
		
	}

}
