package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class autoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
//		driver.get("https://www.makemytrip.com/");
//		System.out.println(driver.getTitle());  // validate if your page title is correct
//		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 		
//		//from
//		driver.findElement(By.id("fromCity")).click();
//		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
//		fromCity.sendKeys("MUM");
//		Thread.sleep(2000);
//		fromCity.sendKeys(Keys.ARROW_DOWN);
//		fromCity.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		//validate
//		System.out.println(driver.findElement(By.xpath("//label[@for='fromCity']//span[@class='truncate airPortName']")).getText());		
//		//to
//		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
//		toCity.sendKeys("DEL");
//		Thread.sleep(2000);
//		toCity.sendKeys(Keys.ARROW_DOWN);
//		toCity.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		//validate
//		System.out.println(driver.findElement(By.xpath("//label[@for='toCity']//span[@class='truncate airPortName']")).getText());		
//		driver.close();
//		driver.quit();
		
		// start a new URL for No.93
		//Javascript DOM can extract hidden elements
		// selenium can not identify hidden elements  -- (Ajax implementation)
		// using Javascript to get value of hidden obj: 
		driver.get("https://www.ksrtc.in/oprs-web/");	
		WebElement fromCity = driver.findElement(By.id("fromPlaceName"));
//		WebElement aboutUs = driver.findElement(By.xpath("//h5[contains(text(),'About Us')]"));		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(aboutUs).build().perform();	// this step is for view only
		
		fromCity.sendKeys("BENG");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//add a ";" after "value", this is for java execution
		String script = "return document.getElementById(\"fromPlaceName\").value;"; 
		String text = (String)js.executeScript(script);
//		System.out.println(fromCity.getAttribute("value"));   // this also works
//		String value = (String)js.executeScript("return arguments[0].value;",fromCity); // this is one method
		int i=0;
		while(!text.contains("BENGALURU INTERNATION AIRPORT")) {
			i++;
			fromCity.sendKeys(Keys.DOWN);
			text = (String)js.executeScript(script);
			System.out.println(text);
			Thread.sleep(1000);
			if(i>5) {
				System.out.println("element not found");
				break;
			}
			else {
				Assert.assertTrue(true);
			}
		}
				
		driver.close();
		driver.quit();

	}

}
