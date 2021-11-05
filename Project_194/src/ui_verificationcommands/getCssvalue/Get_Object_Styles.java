package ui_verificationcommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Styles {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	    
	    //Get object background color
	    WebElement Buy_button=driver.findElement(By.xpath("//a[contains(.,'BUY')]"));
	    String BG_Color=Buy_button.getCssValue("background-color");
	    System.out.println(BG_Color);
	    
	    
	    //Check text available in Uppercase
	    String TextType=Buy_button.getCssValue("text-transform");
	    if(TextType.equals("uppercase"))
	    	System.out.println("Testpass");
	    else
	    	System.out.println("Testfail");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
