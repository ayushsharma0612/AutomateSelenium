package Package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSnapDeal {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.snapdeal.com/");
			WebElement allofrs = driver.findElement(By.xpath("//span[text()='All Offers']"));
			
			//Mouse overing in All offers//
		Actions act=new Actions(driver);
	    act.moveToElement(allofrs).perform();
	    
	  
	List<WebElement> fashion = driver.findElements(By.xpath("//div[@id='category1Data']/div[2]"));
	List<WebElement> list1 = fashion.subList(1,8);
	    int count = list1.size();
	   System.out.println(count);
	    for(int i=0;i<count;i++)
	    {
	    	WebElement link = list1.get(i);
	    	String txt = link.getText();
	 	
	    	System.out.println(txt);
	    	if(txt.equals("Wallets"))
	    	{
	    		System.out.println(txt);
	    		break;
	    	}	
	    	else
	    	{
	    		System.out.println(txt);
	    	}
	    

	   // driver.quit();			
	}

		}
}