package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Date_Cell_Value {

	public static void main(String[] args) throws IOException {
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get Required row using sheet
		XSSFRow row=sht.getRow(1);
		
		//Read date from excel cell
		Date date=row.getCell(4).getDateCellValue();
		System.out.println(date);
		
		//Create Simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");	
		System.out.println(sdf.format(date));
		
	}

}
