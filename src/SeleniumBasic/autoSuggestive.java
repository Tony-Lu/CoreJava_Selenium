package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class autoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct

		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 
		
		//from
		driver.findElement(By.id("fromCity")).click();
		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromCity.sendKeys("MUM");
		Thread.sleep(2000);
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//validate
		System.out.println(driver.findElement(By.xpath("//label[@for='fromCity']//span[@class='truncate airPortName']")).getText());
		
		//to
		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toCity.sendKeys("DEL");
		Thread.sleep(2000);
		toCity.sendKeys(Keys.ARROW_DOWN);
		toCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//validate
		System.out.println(driver.findElement(By.xpath("//label[@for='toCity']//span[@class='truncate airPortName']")).getText());
		
		
		driver.close();
		driver.quit();
		
		
		

	}

}
