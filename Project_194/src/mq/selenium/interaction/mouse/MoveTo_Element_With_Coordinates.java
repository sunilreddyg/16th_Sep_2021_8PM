package interaction.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo_Element_With_Coordinates {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		
		WebElement Item1=driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		new Actions(driver).clickAndHold(Item1).moveByOffset(140, 196).pause(4000).release(Item1).build().perform();
		
	}

}
