package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//Identifying location of footer area and finding all links under it
		WebElement FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
		List<WebElement> FooterLinks=FooterArea.findElements(By.tagName("a"));
		System.out.println(FooterLinks.size());
		
		
		for (int i = 0; i < FooterLinks.size(); i++) 
		{
			//Using index number get each link and storing into webElement reference
			WebElement EachLink=FooterLinks.get(i);
			//Read Text at each link
			String LinkName=EachLink.getText();
			
			//Read href property
			String LinkHref=EachLink.getAttribute("href");
			//System.out.println(LinkName+"    "+LinkHref);
			
			//Get Target property for links
			String objtarget=EachLink.getAttribute("target");
			EachLink.click();
			Thread.sleep(4000);
			
			//Condition accept when link type is external
			if(objtarget.equals("_blank"))
			{
				   String Mainwindow=driver.getWindowHandle();
				   for (String EachWindow : driver.getWindowHandles()) 
				   {
					   driver.switchTo().window(EachWindow);
					   Thread.sleep(2000);
				   }
				   System.out.println(LinkName+"     "+driver.getTitle());
				   driver.close();
				   driver.switchTo().window(Mainwindow);
			}
			else
			{
				System.out.println(LinkName+"     "+driver.getTitle());
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			
			//Restore all footerlinks to avoid staleelemntreference exception
			FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
			FooterLinks=FooterArea.findElements(By.tagName("a"));
			
			
			
		}
		
		
		
		
		

	}

}
