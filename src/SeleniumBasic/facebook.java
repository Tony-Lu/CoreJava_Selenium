package SeleniumBasic;

import java.util.concurrent.TimeUnit;
import java.util.regex.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 
		
		//xpath locator
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jtesef");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("iejfie233");
		
		// how to use Regex ??????????
		String loginBtnPreXpath = "//input[contains(@id,'u_0_')]";
		//String loginBtnPostXpath = "')]";		
		
		//String loginBtnXpath = loginBtnPreXpath+"2"+loginBtnPostXpath;
		
		
		//System.out.println(loginBtnXpath);
		System.out.println(driver.findElement(By.xpath(loginBtnPreXpath)).getAttribute("id"));
		driver.findElement(By.xpath(loginBtnPreXpath)).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());
		
		//CSS : tagName[attribute='value']
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("jtesef");  // tagName[attribute='value']
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("jtesef");  // tagName.className
//		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("iejfie233");
//		driver.findElement(By.cssSelector("label[id='loginbutton']")).click();		
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.cssSelector("div[class='_4rbf _53ij']")).getText());
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
