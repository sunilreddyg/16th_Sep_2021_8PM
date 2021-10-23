package interaction.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//Dont't run this program it's just for syntax example
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sample.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Press Control+Alt+T using keyboard shortcuts
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys(Keys.chord("T")).perform();
		
		
		//Press Shift+TAB
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).release();
		

	}

}
