package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertJavascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
//		driver.switchTo().alert().accept(); // simple to click ok
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("xxxx");
		
		// below is an optional way:
		// this a javascript pop-up, belong to this browser
		// use Alert API to validate the pop-up

		Alert alert = driver.switchTo().alert();
		
		alert.getText();
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text.equals("Are you sure you want to give us the deed to your house?")) {
			System.out.println("correct alert message");
		}
		else {
			System.out.println("in-correct alert message");
		}

		alert.accept();  // click on OK btn
		//alert.dismiss(); // click on CANCEL btn
		
		driver.close();
		driver.quit();

	}

}



