package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://the-internet.herokuapp.com");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		
		System.out.println(driver.findElements(By.tagName("frame")).size());		
		System.out.println(driver.findElement(By.name("frame-middle")).getAttribute("src"));
		
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
//		driver.switchTo().frame(1);
		String targetText = driver.findElement(By.id("content")).getText();
		System.out.println(targetText);
		
		Assert.assertEquals(targetText, "MIDDLE");
		
		//switch back outside of frame:
		driver.switchTo().defaultContent();	
		driver.switchTo().defaultContent();	
		
		driver.close();
		driver.quit();
		

	}

}
