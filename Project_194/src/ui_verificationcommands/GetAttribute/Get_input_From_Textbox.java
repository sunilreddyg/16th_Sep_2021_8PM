package ui_verificationcommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_input_From_Textbox {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9030248855");
	    Thread.sleep(5000);
	    
	    
	    WebElement Operator_Textbox=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    String inputvalue=Operator_Textbox.getAttribute("value");
	    System.out.println(inputvalue);
	    
	    
	    WebElement Circle_Textbox=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    String circlename=Circle_Textbox.getAttribute("value");
	    System.out.println(circlename);
	    
	    

	}

}
