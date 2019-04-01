package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.ca/");
		System.out.println(driver.getTitle());  // validate if your page title is correct	
		
		WebElement loginElmt = driver.findElement(By.id("nav-link-accountList"));
		WebElement searchInputBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions actions = new Actions(driver);
		// move to a element
		actions.moveToElement(loginElmt).build().perform();
		
		//input in a capitalized string
		actions.moveToElement(searchInputBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		actions.moveToElement(loginElmt).contextClick().build().perform();
		//drop and drag:
		
		
		

	}

}
