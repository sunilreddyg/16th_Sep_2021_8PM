package switch_Commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Prompt_Alert {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Navigate to Alert page
		WebElement link_Alert_with_text=driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]"));
		link_Alert_with_text.click();
		
		//Opening alert with textbox
		WebElement prompt_link=driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]"));
		prompt_link.click();
		Thread.sleep(4000);
		
		//Typing text into alert box
		driver.switchTo().alert().sendKeys("9030248855");
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
