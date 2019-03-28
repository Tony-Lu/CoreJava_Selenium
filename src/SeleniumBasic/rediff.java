package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 
		
		//CSS regex
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  // cannot work w/o  * 
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("jtesef");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("iejfie233");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		//   .getAttribute("xxx");
		//google.ca - search box:
		//div[@class='SDkEP']//following-sibling::input[@name='q']
		
		
		driver.close();
		driver.quit(); 
		
		

	}

}
