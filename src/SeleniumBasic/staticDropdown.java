package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

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

		System.out.println(driver.getCurrentUrl()); // to validate if we landed on correct URL 

		//		Select objSelect = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//		
		//		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).isEnabled());
		//objSelect.selectByValue("Hubli (HBX)");   // not working

		//departure select
		//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//		driver.findElement(By.xpath("//a[@value='HBX']")).click();

		//destination
		//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();          
		//		driver.findElement(By.xpath("//div//ul//li//a[@value='HYD']")).click();  // why this not work ?

		//======================= below is from tutor assist - to select departure / dest  ====================
		
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//
//		Thread.sleep(2000);
//
//		String Origin ="AMD";
//
//		driver.findElement(By.xpath("//a[@value='"+Origin+"']")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//
//		Thread.sleep(2000);
//
//		//			String Destination ="Hyd";
//
//		//			driver.findElement(By.xpath("//a[@value='"+Destination+"'][2]")).click();
//
//		//		      driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
//
//		String dest ="Hyd"; //Hyderabad (HYD)
//
//		driver.findElement(By.xpath("(//a[contains(text(),'"+dest+"')])[2]")).click();
//
//		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		//=============================== above comes here end ====================================================

		//calendar  ======= below from turor, including some error, penging fix ============
		
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();  // //div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']
//
//		while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("April"))
//
//		{
//
//			// driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//
//			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//
//		}
//
//		List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
//
//		int count= dates.size();
//
//		for(int i=0; i<count; i++)
//
//		{
//
//			String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).getText();
//
//			if(txt.equalsIgnoreCase("16"))
//
//			{
//
//				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();
//
//				System.out.println(txt);
//
//				break;
//
//			}
//
//		}

		//===================== calendar comes here end =====================================================


		//passengers : Adult 2 , child 1, infant 1
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // get text value for validation afterwards
		driver.findElement(By.id("divpaxinfo")).click();
		
		// do while loop , increase 4 times
//		int i=1;
//		while(i<5) {
//			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();   //4 times
//			i++;			
//		}
		
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
		
		// may use testng validation method: 
		//"Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 1 Child, 1 Infant");
		
		
		
		


		// currency
		Thread.sleep(2000);

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select s = new Select(currency);

		s.selectByVisibleText("USD");





	}

}
