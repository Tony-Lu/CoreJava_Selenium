package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.path2usa.com/travel-companions");		
		
		driver.findElement(By.id("travel_date")).click();
		// month , date
				
		String monthText = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText();
		System.out.println(monthText); // current default text
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();			
		}			
		
		Thread.sleep(2000);
		List<WebElement> dates = driver.findElements(By.className("day"));
		System.out.println(dates.size());
		for(int i=0;i<dates.size();i++) {
			String dateText = driver.findElements(By.className("day")).get(i).getText();
			if(dateText.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();				
				break;
			}
		}
		
		

	}

}
