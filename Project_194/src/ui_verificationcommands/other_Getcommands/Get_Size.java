package ui_verificationcommands.other_Getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	  //Get object background color
		WebElement Buy_button=driver.findElement(By.xpath("//a[contains(.,'BUY')]"));
		
		
		//Get object height and width
		int Obj_height=Buy_button.getSize().getHeight();
		int Obj_width=Buy_button.getSize().getWidth();
		
		System.out.println("Object Height is ---> "+Obj_height);
		System.out.println("Object width is ---> "+Obj_width);
		
		
		//When object hidden height and width return 0 
		
		
		
		//Get rectangle method gives all dimensions and point methods
		System.out.println(Buy_button.getRect().getX());
		System.out.println(Buy_button.getRect().getY());
		System.out.println(Buy_button.getRect().getHeight());
		System.out.println(Buy_button.getRect().getWidth());
		
		

	}

}
