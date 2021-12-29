package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Boolean_value {

	public static void main(String[] args) throws Exception {
		
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get Required row using sheet
		XSSFRow row=sht.getRow(1);
		
		
		Boolean status=row.getCell(3).getBooleanCellValue();
		System.out.println(status);
		System.out.println("boolean to text --> "+status.toString());
		

	}

}
