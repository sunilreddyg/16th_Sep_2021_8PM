package ui_verificationcommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Check_Color_Codes {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	     Color HEX_COLOUR = Color.fromString("#259702");
	     
	     Color Real_Color=Color.fromString("green");
	 
	     
	   //Get object background color
		 WebElement Buy_button=driver.findElement(By.xpath("//a[contains(.,'BUY')]"));
		 String BG_Color=Buy_button.getCssValue("background-color");
		 
		 if(BG_Color.equals(HEX_COLOUR.asRgba()))
			 System.out.println("Expected color is displayed");
		 else
			 System.out.println("Expected color is not displayed");
		 
		 
		System.out.println(HEX_COLOUR.equals(Real_Color));
		 
		 
	     
	}

}
