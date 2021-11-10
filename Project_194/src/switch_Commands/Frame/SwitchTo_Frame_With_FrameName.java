package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_With_FrameName {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/account/trips");
		Thread.sleep(5000);
		
		//Switching to frame with name / id property
		driver.switchTo().frame("modal_window");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("darshan@gmail.com");
		
		WebElement TripId=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripId.sendKeys("37984793748");
		
		//Get Control back to page from frame
		driver.switchTo().defaultContent();
		
		
		WebElement FeedBack=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
		FeedBack.click();
		
		
		
		
		
		
		
		
		
		

	}

}
	