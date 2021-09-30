package sample1;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class FB_login 
{
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("https://www.facebook.com/");
    driver.manage().window().setSize(new Dimension(1349, 728));
    driver.findElement(By.id("email")).sendKeys("sunilreddy");
    driver.findElement(By.id("pass")).sendKeys("hello1234");
    driver.findElement(By.name("login")).click();
  }
}
