package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		// below is for headless chrome
				//=============================================
//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--headless");
//				WebDriver driver = new ChromeDriver(options);
				//=============================================
		
//		System.setProperty("webdriver.gecko.driver", "F:\\toolDownloaded\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.ie.driver", "F:\\toolDownloaded\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 
		
		//System.out.println(driver.getPageSource()); // to check page source html code, (some page not allowed right click
		
//		driver.get("https://login.salesforce.com/");
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		driver.navigate().forward();
		//driver.findElement(By.className("button r4 wide primary")).click(); // compound class names not permitted!!
		
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
