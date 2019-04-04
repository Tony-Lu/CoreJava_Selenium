package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));		
		WebElement dragTarget = driver.findElement(By.id("draggable"));
		WebElement dropTarget = driver.findElement(By.id("droppable"));	
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(dragTarget, dropTarget).build().perform();
		
		// switch back outside of frame:
//		driver.switchTo().defaultContent();		
		
		//verify drag and drop: AUT can not getAttribute value ?
		Thread.sleep(2000);
//		WebElement droppedElement = driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]"));
//		WebElement droppedElement = driver.findElement(By.xpath("//div[@id='droppable']//p[contains(text(),'Dropped!')]"));
		WebElement droppedElement = driver.findElement(By.id("droppable"));
		String droppedText = droppedElement.getText();//getAttribute("text"); not work
		System.out.println(droppedText);		
		// here printed out "droppedText" is : null , why ?
		Assert.assertEquals(droppedText, "Dropped!");
		
		driver.close();
		driver.quit();

	}

}
