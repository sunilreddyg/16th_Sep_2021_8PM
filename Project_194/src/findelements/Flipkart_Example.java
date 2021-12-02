package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Example {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		WebElement Close_window=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Close_window.click();
		Thread.sleep(1000);
		
		
		WebElement Search=driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		Search.sendKeys("samsung mobiles s10"+Keys.ENTER);
		Thread.sleep(5000);
		
		
		WebElement Next_btn;
		boolean flag;
		boolean Recordstatus=false;
		do {
			
			
			WebElement RecordsTable=driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
			List<WebElement> Products=RecordsTable.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']"));
			Products.remove(0);  //Removing first index object
			
			for (int i = 2; i < Products.size()-4; i++) 
			{
				
				//Get Each prodocu using index number
				WebElement Eachproduct=Products.get(i);
				
				//Get Each product name and price
				WebElement MobileName_location=Eachproduct.findElement(By.className("_4rR01T"));
				String MobileName=MobileName_location.getText();
				
				
				WebElement Mobileprice_location=driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				String MobilePrice=Mobileprice_location.getText();
				
				System.out.println(MobileName+"\t"+MobilePrice);
				
				
				if(MobileName.equalsIgnoreCase("SAMSUNG Galaxy A20s (Green, 64 GB)"))
				{
					Recordstatus=true;
					MobileName_location.click();
					break;  //Stop Iteration
				}
			}
			
			
			if(Recordstatus==true)
			{
				break;  //Do-while Condition
			}
			
			
			Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			flag=Next_btn.isDisplayed();
			if(flag==true)
			{
				Next_btn.click();
				Thread.sleep(3000);
			}
			
		} while (flag==true);
		
		
		
		
		
		
	}

}

	