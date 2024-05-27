package SwagLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
	@Test
public void blinks() 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement un = driver.findElement(By.id("user-name"));
	un.sendKeys("standard_user");
	
	WebElement pd = driver.findElement(By.id("password"));
	pd.sendKeys("secret_sauce");
	
	WebElement login= driver.findElement(By.id("login-button"));
	login.click();
	String title = driver.getTitle();
	System.out.println(title);
	
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	
	String source = driver.getPageSource();
	System.out.println(source);
	
	List<WebElement> Totallinks = driver.findElements(By.tagName("a"));
	
	System.out.println("Total Links on the web page " + Totallinks.size());
	
	driver.close();
	
}
}
