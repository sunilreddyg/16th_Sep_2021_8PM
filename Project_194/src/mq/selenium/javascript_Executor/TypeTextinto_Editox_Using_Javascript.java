package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeTextinto_Editox_Using_Javascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//using javascript type text into editbox using id
		((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='darshan@gmail.com'");

		//Javascript with xpath
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='darshan@gmail.com'",password);
	}

}
