package SwagLabs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink 
{
	@Test
	public void link()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		String url ="https://www.saucedemo.com/";
		
		WebElement un = driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user");
		
		WebElement pd = driver.findElement(By.id("password"));
		pd.sendKeys("secret_sauce");
		
		WebElement login= driver.findElement(By.id("login-button"));
		login.click();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total Broken Links "+ link.size());
		
		Iterator<WebElement> iterator = link.iterator();
		while(iterator.hasNext())
		{
			url=iterator.next().getText();
			System.out.println(url);
			
			driver.close();
		}
		
		
		
	}

}
