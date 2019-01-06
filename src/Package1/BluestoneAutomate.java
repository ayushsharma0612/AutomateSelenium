package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneAutomate {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(6000);
		driver.switchTo().frame("livechat-compact-view");
		WebElement chatbx = driver.findElement(By.id("open-label"));
		Thread.sleep(4000);
		chatbx.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Ayush Sharma");
		driver.findElement(By.id("email")).sendKeys("ayushsharma3910@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'container')]")).sendKeys("9013974946");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("livechat-full-view");
		WebElement msgbx = driver.findElement(By.id("message-placeholder"));
				msgbx.click();
		Thread.sleep(5000);
		msgbx.sendKeys("Hello chaii peelo!");
		msgbx.sendKeys(Keys.ENTER);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
