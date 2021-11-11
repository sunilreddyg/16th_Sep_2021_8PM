package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		
		driver.findElement(By.xpath("//a[contains(.,'BUS HIRE')]")).click();
		Thread.sleep(4000);
		
		//Navigate to frame using frame url
		driver.navigate().to("https://www.redbus.in/bushire/req.html?hideBackArrow=true&isDesktop=true");
		
		//Click Outstation link
		driver.findElement(By.xpath("(//div[contains(@class,'Fulj1')])[1]")).click();

	}

}
