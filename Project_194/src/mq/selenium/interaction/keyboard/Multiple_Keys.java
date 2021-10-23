package interaction.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Keys 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement DepartureCity=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		DepartureCity.clear();
		
		new Actions(driver).sendKeys(DepartureCity, "H").pause(4000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		/*
		 * Note:--> For keyboard shortcuts webdriver doesn't throw any excpetion
		 */
		
	}

}
