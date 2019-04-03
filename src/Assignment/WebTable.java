package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

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
		
		WebElement mouseHoverIcon = driver.findElement(By.xpath("//legend[contains(text(),'Mouse Hover Example')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHoverIcon).build().perform();
		
		WebElement webTable = driver.findElement(By.xpath("//table[@id='product']"));
		int rowCount = webTable.findElements(By.xpath("//table[@id='product']//tr")).size();
//		int rowCount = webTable.findElements(By.xpath("//tr")).size();  // not working: row: 12 ??
		System.out.println("Row number is: "+rowCount);
//		int colCount = webTable.findElements(By.xpath("//table[@id='product']//tr//th")).size();	
		int colCount = webTable.findElements(By.xpath("//tr//th")).size();
		System.out.println("Column number is: "+colCount);
		Thread.sleep(1000);
		int i;
		for(i=0;i<rowCount;i++) {	// here -1, due to unknown reason actual row is: 11, have to reduce 1
			String firstColVal = webTable.findElements(By.xpath("//table[@id='product']//tr")).get(i).getText();
			System.out.println(i+" row data: "+firstColVal);	
			while(i==2) {
				System.out.println(i+"nd row data: "+webTable.findElements(By.xpath("//table[@id='product']//tr")).get(i).getText());
				break;
			}
		}
		driver.close();
		driver.quit();

	}

}
