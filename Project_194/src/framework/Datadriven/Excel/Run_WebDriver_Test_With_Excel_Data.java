package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import miniproject.Common_Reusable_Actions;

public class Run_WebDriver_Test_With_Excel_Data {

	public static void main(String[] args) throws IOException
	{
		
		//Read Excel file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet Access using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		
		String browsername=sht.getRow(1).getCell(0).getStringCellValue();
		String url=sht.getRow(1).getCell(1).getStringCellValue();
		String username=sht.getRow(1).getCell(2).getStringCellValue();
		
		
		Common_Reusable_Actions obj=new Common_Reusable_Actions();
		obj.LaunchBrowser(browsername);
		obj.load_webpage(url);
		obj.set_explicitwait_time(20);
		obj.click_element("(//a[contains(.,'Sign in')])[1]");
		obj.Type_text("//input[@id='i0116']", username);

	}

}
