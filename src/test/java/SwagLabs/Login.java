package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	@Test
	public void login_test() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement UN = driver.findElement(By.id("user-name"));
		UN.sendKeys("standard_user");
		
		WebElement PD = driver.findElement(By.id("password"));
		PD.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.close();
	}
}
