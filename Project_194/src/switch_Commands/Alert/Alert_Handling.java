package switch_Commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement alert_button=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		alert_button.click();
		
		
		
		try {
			//switching to alert and storing reference into variables
			Alert alert=driver.switchTo().alert();
			
			//Read text at alert message
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Click ok button alert window
			alert.accept();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

	}

}
