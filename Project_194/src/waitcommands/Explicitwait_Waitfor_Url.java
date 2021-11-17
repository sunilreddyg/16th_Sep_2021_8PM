package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Waitfor_Url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(40))
			.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
			System.out.println("Expected url is presented");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		WebElement Download_link=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_link.click();
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.urlContains("downloads/"));
			System.out.println("Expected url loaded at browser window");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
