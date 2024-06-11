package SwagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	
	@Test
	void frame()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// frame 1
		WebElement frm = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='mytext1']"));
		textbox.sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		
		// frame 2
		
		WebElement frm1 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm1);
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		textbox2.sendKeys("Selenium");
		
		
		driver.close();
	}

}
