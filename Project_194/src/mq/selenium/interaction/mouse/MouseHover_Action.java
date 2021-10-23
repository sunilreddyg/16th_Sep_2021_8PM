package interaction.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Performing hover action on location
		WebElement PayMenu=driver.findElement(By.xpath("(//span[@class='pay-icon-large-off menu-icon'])[2]"));
		new Actions(driver).moveToElement(PayMenu).perform();
		Thread.sleep(2000);
		
	
			
		//Click Method using mouse actions class
		WebElement CreditCard=driver.findElement(By.xpath("(//span[contains(.,'Credit Cards')])[2]"));
		new Actions(driver).click(CreditCard).perform();
		
		
		
		
		
		
	}

}
