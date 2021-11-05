package ui_verificationcommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Required_Options_IsSelected {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    driver.manage().window().setSize(new Dimension(783, 728));
	    
	    
	    WebElement Regular_Fares=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/ul/li[1]"));
	    String Runtime_Class=Regular_Fares.getAttribute("class");
	    
	    if(Runtime_Class.contains("activeItem"))
	    {
	    	System.out.println("Regular fare is selected");
	    }
	    else
	    {
	    	System.out.println("Regular fare is not selected");
	    }
	    
	    
	    
	    

	}

}
