package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
//		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int rdoCount = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(rdoCount);
				
		//  if "Cheese", then click
		for(int i=0; i<rdoCount;i++) {
			String rdoText = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(rdoText);
			// if (rdoText=="Cheese") {
			if (rdoText.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				break;	
			}			
		}
		
		driver.close();
		driver.quit();

	}

}


