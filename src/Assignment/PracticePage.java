package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("http://qaclickacademy.com/practice.php");		

		String targetVar = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println("+"+targetVar+"+");
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Thread.sleep(1000);
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropDown);
		// replace O to o
//		String targetVarLowerCase = targetVar.replace("O", "o");
//		System.out.println(targetVarLowerCase);
		/// convert O to o at the first letter
		char[] chars = targetVar.toCharArray();
		chars[0] += 32;
		String targetVarLowerCase = String.copyValueOf(chars);
		System.out.println(targetVarLowerCase);
//		select.selectByValue(targetVarLowerCase);
		select.selectByVisibleText(targetVar);	// this works with ignoring O / o 
		
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys(targetVar);
		System.out.println(driver.findElement(By.id("name")).getText());
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		String alertPopUpText = alert.getText();
		if(alertPopUpText.contains(targetVar)) {
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Something wrong with execution");
		}
		alert.accept();
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();


	}

}
