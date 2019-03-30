package SeleniumBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class cleartripAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");
		// create a hashmap object
		Map<String, Object> prefs = new HashMap<String, Object>();
		// set up notification: 2 is for block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		ChromeOptions options = new ChromeOptions();
		// below is setting for chrome language:
		options.addArguments("--lang=en-US");
		options.setExperimentalOption("prefs", prefs);
		// import options to chrome driver
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle()); // validate if your page title is correct
		String url = driver.getCurrentUrl(); // to validate if we landed on correct URL
		Assert.assertEquals(url, "https://www.cleartrip.com/");

		Thread.sleep(2000);

		// select Adults
		WebElement adults = driver.findElement(By.id("Adults"));
		Select selectAdults = new Select(adults);
		selectAdults.selectByVisibleText("3");
		System.out.println(adults.getAttribute("value"));
		Assert.assertEquals(adults.getAttribute("value"), "3");

		// select children
		WebElement children = driver.findElement(By.id("Childrens"));
		Select selectChild = new Select(children);
		selectChild.selectByVisibleText("1");
		System.out.println(children.getAttribute("value"));
		Assert.assertEquals(children.getAttribute("value"), "1");

		// select depart date
		//		Thread.sleep(2000);
		//		WebElement element = driver.findElement(By.id("DepartDate"));
		//		Actions actions = new Actions(driver);
		//		actions.doubleClick(element).perform();

		Thread.sleep(2000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		// verify whether the current date has been successfully selected:
		Assert.assertEquals(driver.findElement(By.id("FromDate")).getAttribute("value"), "30/03/2019");

		// click More options link:
		driver.findElement(By.id("MoreOptionsLink")).click();

		// input "indigo" into Preferred Airline
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");

		// click Search flights
		driver.findElement(By.id("SearchBtn")).click();

		// get error message
		String errorMsg = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errorMsg);

		driver.close();
		driver.quit();

	}

}
