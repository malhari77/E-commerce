package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart 
{
	@Test
	public void FleeceJacket() throws InterruptedException 
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
		
		WebElement linktext = driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
		linktext.click();
		
		WebElement click = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
		click.click();
		WebElement add = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		add.click();
		
		WebElement text = driver.findElement(By.xpath("//div[@class='inventory_item_desc']"));
		String a = text.getText();
		System.out.println(a);
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
