package DataDriven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
		
		// scrolling by using pixel
		//js.executeScript("window.scrollBy(0,1000", "");
		
		WebElement username = driver.findElement(By.id("signInName"));
		username.sendKeys("malharipatil7@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Malha");
		
		WebElement login = driver.findElement(By.id("signInbtn"));
		login.click();
		
		Thread.sleep(4000);
		
		//Alert a =driver.switchTo().alert();
		//a.accept();
		
		//Thread.sleep(2000);
		
		WebElement a = driver.findElement(By.xpath("//span[@class='w-20 truncate text-xs']"));
		a.click();
		
		Thread.sleep(4000);
		
		WebElement profile = driver.findElement(By.partialLinkText("View Profile"));
		profile.click();
		// using sendkeys  only used for if type= file then use sendkeys
	
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='inline-resume']"));
		upload.click();
		js.executeScript("arguments[0].scrollIntview();", upload);
	}

}
