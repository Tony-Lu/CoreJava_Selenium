package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class cssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 
		
		//driver.findElement(new ByChained(By.id("xxxx"), By.xpath("xxxx"))
		
		//CSS regex
//		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("jtesef");
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("dkekek");
//		driver.findElement(new ByAll(By.cssSelector("input[id*=username]"), By.cssSelector("input[name*='username']"))).sendKeys("jtesef");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("iejfie233");
		driver.findElement(By.cssSelector("input[id='Login']")).click();		
		System.out.println(driver.findElement(By.cssSelector("[id='error']")).getText());

	}

}
