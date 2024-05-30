package SwagLabs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest 
{
	@Test
	public void amazontest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		WebElement textbox= driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("iphone15 pro max");
		
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		Thread.sleep(5000);
		
		WebElement linktext = driver.findElement(By.partialLinkText("Apple iPhone 15 Pro Max (Black Titanium, 256 GB)"));
		linktext.click();
		
		//String window= driver.getWindowHandle();
		//System.out.println(window);
		
		//getwidowhandles()
		
				Set<String> windowid=driver.getWindowHandles();
				
				Iterator <String> it = windowid.iterator();
				
				String parentwindowid = it.next();
				String childwindowid = it.next();
				System.out.println("parent window id" +parentwindowid);
				System.out.println("child window id" +childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		Thread.sleep(4000);
		
		WebElement addtocart = driver.findElement(By.xpath("//div[@class='qOPjUY']/following::button[1]"));
		addtocart.click();
		
		Thread.sleep(4000);
		
		WebElement additem = driver.findElement(By.xpath("//button[@class='QqFHMw eTWN7O']"));
		additem.click();
		
		Thread.sleep(7000);
		
		WebElement palceorder = driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
		palceorder.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.quit();
	}
}
