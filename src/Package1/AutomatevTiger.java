package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomatevTiger {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		WebElement Resources = driver.findElement(By.xpath("//a[text()='Resources']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Resources).perform();
		Thread.sleep(3000);
		WebElement cntacts = driver.findElement(By.xpath("//a[text()='Contact']"));
		act.click(cntacts).perform();
		
		
		//scrolling down//
		Thread.sleep(4000);
	//	WebElement hrpage = driver.findElement(By.xpath("//span[text()='Other Communication']"));
		//String jscode = "arguments[0].scrollIntoView(true)";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript(jscode, hrpage);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		WebElement cntact = driver.findElement(By.xpath("//div[text()='Human Resources']/../div[2]"));
		
		System.out.println(cntact.getText());
		
		driver.close();
		
		
		
		
	}
	

}
