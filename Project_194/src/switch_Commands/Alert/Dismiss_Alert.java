package switch_Commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dismiss_Alert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//This link navigate to alert page
		WebElement Ok_And_Cancel_link=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		Ok_And_Cancel_link.click();
		
		//This action will prompt alert
		WebElement alert_button=driver.findElement(By.xpath("//button[contains(@onclick,'confirmbox()')]"));
		alert_button.click();
		
		
		//Switch to alert and click cancel button
		driver.switchTo().alert().dismiss();
		
		
		
		

	}

}
