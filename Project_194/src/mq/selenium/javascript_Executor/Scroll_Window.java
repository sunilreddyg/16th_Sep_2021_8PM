package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_Window 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Scroll window horizontal
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 4000)");
		Thread.sleep(4000);
		
		//Using javascript how to perform click method in automation browser
		WebElement Signin=driver.findElement(By.xpath("//span[@class='action-inner']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", Signin);
	}

}
