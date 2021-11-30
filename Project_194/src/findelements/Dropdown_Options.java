package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		
		WebElement Departments=driver.findElement(By.xpath("//select[contains(@aria-describedby,'searchDropdownDescription')]"));
		
		List<WebElement> list=Departments.findElements(By.tagName("option"));
		System.out.println("Number of options available is --> "+list.size());
		
		
		for (int i = 0; i < list.size(); i++) 
		{
			  //Get Single object from list
			  WebElement EachOption=list.get(i);
			  //Get Name of each option
			  String OptionName=EachOption.getText();
			  System.out.println(OptionName);
			  
			  //Select EachOption
			  EachOption.click();
			  Thread.sleep(500);
		}
		
		
		
		
		

	}

}
