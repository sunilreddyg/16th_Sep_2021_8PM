package interaction.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Syntax {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Perform Escape keys on page
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		
		//Perform Tab Function on perticular location
		WebElement Element=driver.findElement(By.id("x"));
		new Actions(driver).sendKeys(Element, Keys.TAB).perform();
		
		
		//Pause keyword
		new Actions(driver).sendKeys(Element, "Hyd")
		.pause(4000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();

	}

}
