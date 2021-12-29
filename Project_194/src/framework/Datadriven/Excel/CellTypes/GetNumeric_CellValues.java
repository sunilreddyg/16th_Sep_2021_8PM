package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetNumeric_CellValues {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get Required row using sheet
		XSSFRow row=sht.getRow(1);
		
		
		//Read Numeric value [By default numer return in double format]
		double dble_value=row.getCell(1).getNumericCellValue();
		System.out.println(dble_value);
		
		Double new_dble=new Double(dble_value);
		int quality=new_dble.intValue();  //Converting double value into integer value
		System.out.println(quality);
		
		//Convert into String value
		System.out.println(new_dble.toString());
		
	}

}
