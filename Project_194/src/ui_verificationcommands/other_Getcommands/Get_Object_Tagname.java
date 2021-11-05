package ui_verificationcommands.other_Getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Tagname {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	  //Get object background color
		WebElement Buy_button=driver.findElement(By.xpath("//a[contains(.,'BUY')]"));
		//Get Selected object tagname from Backend hmtl
		
		String tagname=Buy_button.getTagName();
		System.out.println("Object tag available at backend html is --> "+tagname);

	}

}
