package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightObject {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Scroll to view option
		WebElement Blog=driver.findElement(By.xpath("//a[contains(.,'Blog')]"));		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", Blog);
		Thread.sleep(2000);
		
		//Set Outline to Blog
		((JavascriptExecutor)driver).executeScript("arguments[0].style.outline='thick solid #FF0000'", Blog);
	}

}
