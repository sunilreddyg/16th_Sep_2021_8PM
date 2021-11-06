package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Example {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Given site url
		 * And selecting a checkbox
		 * When user click on reset button
		 * Then selected checkbox selection will be unchecked
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement ATM_Chekcbox=driver.findElement(By.xpath("//input[contains(@id,'amenity_category_order_types50')]"));
		if(!ATM_Chekcbox.isSelected())
		{
			ATM_Chekcbox.click();
		}
		
		
		//Click on Reset Button
		WebElement Reset_btn=driver.findElement(By.xpath("//a[@href='https://near-me.hdfcbank.com/branch-atm-locator']"));
		Reset_btn.click();
		Thread.sleep(5000);
		
		
		WebElement ATM_Checkbox1=driver.findElement(By.xpath("//input[contains(@id,'amenity_category_order_types50')]"));
		if(!ATM_Checkbox1.isSelected())
		{
			System.out.println("Reset is successfull");
		}
		else
		{
			System.out.println("Reset failed");
		}
		
		

		
	}

}
