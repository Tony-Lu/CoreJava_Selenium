package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		System.out.println(driver.getTitle());  // validate if your page title is correct	
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		// using .getWindowHandles , is because that the pop-up window contains multi-objects
		// below will return a set of obj:		
		Set <String> handler = driver.getWindowHandles(); // this is only can be used in runtime to get 
		// get value from set object:
		Iterator <String> itVal = handler.iterator();
		
		String parentWindowId = itVal.next();
		System.out.println("parent window id is: " + parentWindowId);	// shift handler from 1st obj to 2nd obj
		
		String childtWindowId = itVal.next();
		System.out.println("child window id is: " + childtWindowId);
		
		driver.switchTo().window(childtWindowId); // this step shift handler from parent window to child window
		System.out.println("child window pop up title: " + driver.getTitle());
		driver.close(); // dont use driver.quit  --- this will close all browsers // now, driver is for child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window pop up title: " + driver.getTitle());
		

	}

}
