package mq.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Using_Webdriver_interface 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * WebDriver is a interface class it is designed to manipulate
		 * all browser instances supported by selenium..
		 * Advantages:-->
		 * 		=> Support cross browser automation we can define script
		 * 			for single browser and able to automate on multiple browsers
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();   //Optional
		
		
		/*
		 * Exceptions display in above lines of code
		 * 
		 * 1. IllegalStateException:-->
		 * 				This exception indicates you failed to provide proper
		 * 				driver location
		 * 
		 * 2. SessionNotCreatedException:-->
		 * 				When you browser driver version and browser version mismatched
		 * 
		 * 3. InvalidArgumentException:-->
		 * 				Url should start with http:// or https:// protocals
		 */
		
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		

	}

}
