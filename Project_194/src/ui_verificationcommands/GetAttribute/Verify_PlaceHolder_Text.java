package ui_verificationcommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_PlaceHolder_Text {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().setSize(new Dimension(783, 728));
	    
		
		WebElement email_textbox=driver.findElement(By.id("email"));
		String value=email_textbox.getAttribute("placeholder");
		
		
		//Verify watermark label presented at email editbox
		if(value.equals("Email address or phone number"))
			System.out.println("Expected watermark label presented at editbox");
		else
			System.out.println("Testfail, Expected watermark label not presented at editbox");
	}

}
