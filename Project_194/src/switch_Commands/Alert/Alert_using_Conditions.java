package switch_Commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_using_Conditions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement alert_button=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		alert_button.click();
		
		
		boolean alert_status=false;
		try {
			driver.switchTo().alert();
			alert_status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(alert_status==true)
		{
			System.out.println("alert is presented");
		}
		else
		{
			System.out.println("alert is not presented");
		}
		
		
		
		
	}

}
