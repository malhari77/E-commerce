package SwagLabs;

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
		
		driver.get("https://www.amazon.in/");
		
		WebElement textbox= driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("iphone15 pro max");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		Thread.sleep(5000);
		
		WebElement linktext = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and @href='/sspa/click?ie=UTF8&spc=MTozNjA1MjYxMzk0MTY3MTQ4OjE3MTY5MDAyOTk6c3BfYXRmOjMwMDA1NDM0NTk0ODkzMjo6MDo6&url=%2FApple-iPhone-15-Pro-256%2Fdp%2FB0CHX5J2ND%2Fref%3Dsr_1_1_sspa%3Fdib%3DeyJ2IjoiMSJ9.OYvib3u__hXFvKmx0hKSh_ULCR4HTKOxGiaqvccZn0dST5LVVbP2IMAQw2HmjO8hYIwRSOoQ6sjXyMoy65z3vkOOT5njuMQJeWMqwJT3Lin4uq5liHvEiC_fD7NFttXkU4D3Ew91lWNXngSDxQVHS_zynwp8Q_iNr7yY9lh_bAKJerllr9mjxNlL06SwkdwHdqDr8xVdBn_k01iB96nfEX0mxuy4-W63NNCTYN1eFMw.g6DVtWgZxbd6N39VFHM-OPmEfzT3Ru3MocbSCw5VFuk%26dib_tag%3Dse%26keywords%3Diphone%2B15%2Bpro%2Bmax%26qid%3D1716900299%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1']"));
		linktext.click();
		
	}
}
