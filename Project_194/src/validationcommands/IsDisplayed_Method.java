package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Changing email object into hidden state
	    ((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('style','display:none')");
	    Thread.sleep(4000);
	    
	    WebElement email=driver.findElement(By.id("email"));
	    if(email.isDisplayed())
	    	System.out.println("email object is visible");
	    else
	    	System.out.println("email object is not visible");

	}

}
