package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Waits {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		long start_time=System.currentTimeMillis();
		
		try {
			driver.findElement(By.id("email"));
			System.out.println("object found");
			System.out.println(System.currentTimeMillis()-start_time);
			
		} catch (Exception e) {
			System.out.println("object not found");
			System.out.println(System.currentTimeMillis()-start_time);
		}
		
		

	}

}
