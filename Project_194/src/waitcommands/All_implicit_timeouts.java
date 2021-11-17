package waitcommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_implicit_timeouts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100))
		.pageLoadTimeout(Duration.ofSeconds(100));
		
		
		/*
		 * Implicitwait timeout enabled when object not found at HTML source
		 * PageloadTimeout enable when all page object not load into browser window
		 */

	}

}
