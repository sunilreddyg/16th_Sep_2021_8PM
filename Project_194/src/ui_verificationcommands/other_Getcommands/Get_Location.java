package ui_verificationcommands.other_Getcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	  //Get object background color
		WebElement Buy_button=driver.findElement(By.xpath("//a[contains(.,'BUY')]"));
		
		
		//Get selected location x and y coorindates
		int Obj_x=Buy_button.getLocation().getX();
		int Obj_y=Buy_button.getLocation().getY();
		
		System.out.println(Obj_x+"   "+Obj_y);
		
		
		//How to verify object visible at webpage using coordinates
		//Getlocation return 0 coordinates when object hidden at webpage
		if(Obj_x > 0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is not visible at webpage");
		
		
		
		
		
		
		
	}

}
