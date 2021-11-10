package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_With_WebElement_Reference {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/info/redcare");
		Thread.sleep(5000);
		
		//Switch to frame using frameelement
		WebElement FrameElement=driver.findElement(By.xpath("//iframe[contains(@class,'modalIframe')]"));
		driver.switchTo().frame(FrameElement);
		Thread.sleep(2000);
		
		WebElement Mobile_number=driver.findElement(By.id("mobileNoInp"));
		Mobile_number.click();
		Mobile_number.sendKeys("9652680806");

	}

}
