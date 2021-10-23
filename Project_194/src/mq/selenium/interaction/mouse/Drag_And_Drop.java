package interaction.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		WebElement Trash_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		
		//using Click and Hold method perform drag and drop feature
		new Actions(driver).clickAndHold(Doc1).moveToElement(Trash_Bin).release().perform();
		Thread.sleep(2000);
		new Actions(driver).clickAndHold(Doc2).moveToElement(Trash_Bin).release().perform();
		
		//Perform drag and drop method using direct command
		new Actions(driver).dragAndDrop(Doc3, Trash_Bin).perform();
		Thread.sleep(2000);
		new Actions(driver).dragAndDrop(Doc4, Trash_Bin).perform();
		

	}

}
