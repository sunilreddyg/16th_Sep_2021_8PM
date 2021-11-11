package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class SwitchTo_ParentFrame {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/info/redcare");
		Thread.sleep(5000);
		
		//Switch to parent frame
		WebElement ModelFrame=driver.findElement(By.xpath("//iframe[contains(@class,'modalIframe')]"));
		driver.switchTo().frame(ModelFrame);
		
		
		//Switch to Child Frame
		WebElement CHildFrame=driver.findElement(By.xpath("//iframe[contains(@title,'Sign in with Google Button')]"));
		driver.switchTo().frame(CHildFrame);
		Thread.sleep(3000);
		
		WebElement Signin_google_link=driver.findElement(By.xpath("//span[.='Sign in with Google']"));
		Signin_google_link.click();
		
		
		//Switch control back to mainframe
		driver.switchTo().parentFrame();
		
		
		//Switch control back to Main page
		driver.switchTo().defaultContent();
		
		
		//Click Close Button
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		
		
		
		
		
		

	}

}
