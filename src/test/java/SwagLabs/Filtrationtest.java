package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filtrationtest 
{
	@Test
	public void filtrationtest() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement un1 =driver.findElement(By.id("user-name"));
		un1.sendKeys("standard_user");
		
		WebElement pd1 = driver.findElement(By.id("password"));
		pd1.sendKeys("secret_sauce");
		
		WebElement but = driver.findElement(By.id("login-button"));
		but.click();
		
		Select select = new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select.selectByValue("lohi");
		
		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		
		WebElement price = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String s = price.getText();
		System.out.println(s);
		
		Thread.sleep(4000);
		
		driver.close();
	
	}

}
