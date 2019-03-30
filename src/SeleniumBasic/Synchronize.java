package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Synchronize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		String url = driver.getCurrentUrl(); // to validate if we landed on correct URL 
		Assert.assertEquals(url, "https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		driver.findElement(By.xpath("//span[contains(text(),'Things to Do')]")).click();
		
		driver.findElement(By.id("A-destination")).sendKeys("nyc");
		Thread.sleep(1000);
		driver.findElement(By.id("A-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("A-fromDate")).sendKeys(Keys.ENTER);
		
		// explicit wait
		WebDriverWait d = new WebDriverWait(driver, 7);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='activity183589']//a[contains(@class,'flex-link')]")));
		
		
		driver.findElement(By.xpath("//div[@id='activity183589']//a[contains(@class,'flex-link')]")).click();
		
		
		

	}

}
