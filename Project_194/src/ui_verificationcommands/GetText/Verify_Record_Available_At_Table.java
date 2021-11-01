package ui_verificationcommands.GetText;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.ssl.SslContextOption;

public class Verify_Record_Available_At_Table {

	public static void main(String[] args) throws Exception {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().setSize(new Dimension(783, 728));
	    Thread.sleep(4000);
	    
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
	    
	    
	    
	    
	    //Target table location
	    String table_text=driver.findElement(By.id("resultTable")).getText();
	    //System.out.println(table_text);
	    
	    if(table_text.contains("SunilReddy"))
	    	System.out.println("Record found at table");
	    else
	    	System.out.println("Record not found at table");
	    

	}

}
