package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		
		//1.  get the count of links on this page: //a		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//2. get the count of links at the foot area:
		//div[@id='gf-BIG']//a
		// below is not the best way:
		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		
		// should create a subDriver to working on this area
		
		// limiting WebDriver scope !!!!
		WebElement btmAreaDriver = driver.findElement(By.id("gf-BIG"));		
//		System.out.println(btmAreaDriver.findElements(By.tagName("a")).size());
		
		//3. get the link count at the first column at the foot area:
//		WebElement firstColDriver = driver.findElement(By.xpath("(//div[@id='gf-BIG']//td)[1]//ul"));	
//		System.out.println(firstColDriver.findElements(By.tagName("a")).size());
		
		WebElement firstColDriver = btmAreaDriver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));		
		int firstColLinkCount = firstColDriver.findElements(By.tagName("a")).size();
		System.out.println(firstColLinkCount);

		// click on each link in this column, check if the pages are not opening:
//		for(int i=1;i<firstColLinkCount;i++) {
//			driver.findElement(By.xpath("(//div[@id='gf-BIG']//td)[1]//ul")).findElements(By.tagName("a")).get(i).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			Thread.sleep(3000);	
//		}
		
		// use Ctrl + click, will open a new window:
		for(int i=1;i<firstColLinkCount;i++) {
//			Actions actions = new Actions(driver);
////			actions.sendKeys(Keys.CONTROL).build().perform();
//			actions.keyDown(Keys.CONTROL).build().perform();
//			Thread.sleep(2000);	
//			firstColDriver.findElements(By.tagName("a")).get(i).click();			
////			Thread.sleep(3000);
////			driver.navigate().back();
//			Thread.sleep(2000);	
//			actions.keyUp(Keys.CONTROL).build().perform();
			
			//=============below is from tutor =================
			
			//====A very good example for optimized code, as a contribution to the team, time saver
			String ctrlAndClickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColDriver.findElements(By.tagName("a")).get(i).sendKeys(ctrlAndClickOnLink);
			Thread.sleep(2000);	
		}
			Set<String> handler =driver.getWindowHandles();
			Iterator<String> winObj = handler.iterator();
			
			while(winObj.hasNext()) {
				String windowID = winObj.next();
				driver.switchTo().window(windowID);
				System.out.println("runtimeWindowId is:  " + windowID);
				System.out.println("page title is: " + driver.getTitle());
			}					
			Thread.sleep(2000);	
			
				
		
		driver.close();
		driver.quit();

	}

}
