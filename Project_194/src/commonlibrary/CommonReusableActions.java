package commonlibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonReusableActions 
{
	
	public WebDriver driver;
	WebDriverWait wait;
	String drivers_path="C:\\Users\\SUNIL\\Desktop\\drivers\\";
	
	/*
	 * Keyword:--> Launch Any browser by using name[Chrome,firefox,edge]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", drivers_path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;

		default: System.out.println("browser name is mismatched");
			break;
		}
	}
	
	
	/*
	 * Keyword:--> Get Current Class Browser driver
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	
	/*
	 * Keyword:--> loading new page
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void loadwebpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword:--> Manage ImplicitWait
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void set_implicitwait(long seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	
	/*
	 * Keyword:--> Manage ExplicitWait timeout
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void set_explicitwait(long seconds)
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	
	
	/*
	 * Keyword:--> Type text into editbox
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void typetext(String xpath, String input)
	{
		try {
			WebElement Textbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Textbox.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
