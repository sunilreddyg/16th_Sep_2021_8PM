package interaction.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement AmountHandler=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		new Actions(driver).dragAndDropBy(AmountHandler, 100, 0).perform();
		Thread.sleep(5000);
		
		WebElement years_Handler=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[2]"));
		new Actions(driver).dragAndDropBy(years_Handler, -100, 0).perform();
		
	}

}
