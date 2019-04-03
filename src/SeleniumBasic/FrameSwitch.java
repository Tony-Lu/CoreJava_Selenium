package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameSwitch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://fantasycricket.dream11.com/IN/");	// this website not working
		
		int number = findFrameNumber(driver,By.xpath("xxxxx"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("xxxxx")).click();
		
		driver.switchTo().defaultContent();
		
		
		

	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<frameCount;i++) {
			driver.switchTo().frame(i);			
			// below step is a method to check whether this obj is present:
			int Count = driver.findElements(by).size();	//isDisplayed() is not correct
			if(Count>0) {
				driver.findElement(by).click();
				break;
			}
			else {
				System.out.println("continue looping");
			}				
		}
		driver.switchTo().defaultContent();	//this is mandatory, back to initial step
		return i;
	}

}
