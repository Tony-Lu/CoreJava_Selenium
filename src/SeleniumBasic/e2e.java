package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");

		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());  // validate if your page title is correct
		String url = driver.getCurrentUrl(); // to validate if we landed on correct URL 
		Assert.assertEquals(url, "https://www.spicejet.com/");

		// radio button: click Round trip
		// this return date select: look like disabled, Selenium confused		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//verify the change in "style"		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);			
		}
		else {
			Assert.assertTrue(false);	
		}

		//departure select
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		//destination
		//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']"
				+ " //a[@value='MAA']")).click();   // using parent div following to child a tag

		// calendar
		// avoid time zone conflict
		//driver.findElement(By.cssSelector(".ui-datepicker-unselectable.ui-state-disabled.ui-datepicker-current-day")).click(); 
		driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-today")).click();//due to time zone
		//below not working: pending after fix  ===  fixed on 0329
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		Thread.sleep(2000);	
		// find the desired date: 18
		int dateValid = driver.findElements(By.xpath("//td[@data-handler='selectDay'] //a[@class='ui-state-default']")).size();
		System.out.println(dateValid);
		for(int i=0;i<dateValid;i++) {
			String date = driver.findElements(By.xpath("//td[@data-handler='selectDay'] //a[@class='ui-state-default']")).get(i).getAttribute("text");
			System.out.println(date);
			if(date.contains("18")) {
				driver.findElements(By.xpath("//td[@data-handler='selectDay'] //a[@class='ui-state-default']")).get(i).click();
				//below is also okay
				//driver.findElements(By.xpath("//td[@data-handler='selectDay'] //a[@class='ui-state-default']")).get(i).sendKeys(Keys.ENTER);
				break;
			}
		}

		//passengers : Adult 5 , child 1, infant 1
		Thread.sleep(2000);
		String nulPassenger = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(nulPassenger); // get text value for validation afterwards
		driver.findElement(By.id("divpaxinfo")).click();

		// do for loop, 
		for(int i=1; i<5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();			
		}		

		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		Thread.sleep(2000);
		// do validation to get how many passengers been selected
		String passengerInput = driver.findElement(By.id("divpaxinfo")).getText();		
		System.out.println(passengerInput);

		//may use testng validation method: 
		Assert.assertEquals(passengerInput, "5 Adult, 1 Child, 1 Infant");		

		//currency
		Thread.sleep(2000);

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(currency);
		select.selectByVisibleText("USD");

		// checkbox:  Indian Armed Forces
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).click();
		//validate
		boolean chxStd = driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected();
		System.out.println(chxStd);				
		int chxDisCount = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(chxDisCount);

		for(int i=0; i<chxDisCount; i++) {
			String chxDisText = driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).getAttribute("name");
			System.out.println(chxDisText);
			if(chxDisText.endsWith("IndArm")) {
				driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());	

		// click search:
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


		driver.close();
		driver.quit();



	}

}
