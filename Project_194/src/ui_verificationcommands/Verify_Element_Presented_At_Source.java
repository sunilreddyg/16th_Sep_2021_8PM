package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_Source {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//Check location available at source before perform action
		if(driver.getPageSource().contains("username"))
		{
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("info.dsnr@gmail.com");
		}
		else
		{
			System.out.println("Element is not presented at source");
		}

	}

}
