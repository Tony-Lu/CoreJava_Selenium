package SeleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TableGrid {   //No. 97-100 + No. 105 - takescreenshots

	public static void main(String[] args) throws IOException {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//below is setting for chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		//		driver.get("https://www.cricbuzz.com/");
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22409/rr-vs-rcb-14th-match-indian-premier-league-2019");

		// concept of sub-object/sections:
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		//		int rowCount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size(); // ???? why Rhaul's on video works ?
		int colCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for(int i=0;i<colCount-2;i++) {
			String dataMainTable = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			System.out.println(dataMainTable);
			int dataMainTableInt = Integer.parseInt(dataMainTable);
			sum=sum+dataMainTableInt;

		}

		//need tell Selenium to go to the last parent tag > then > 2nd div: ? or, find a reference for "Extras" / "Total" 
		//		String firstColTargetXpath1 = "//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[contains(text(),'Extras')]";
		//		String extrasData = driver.findElement(By.xpath("("+firstColTargetXpath1+"//following-sibling::div)[1]")).getText();
		String extrasData = driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div")).getText();
		System.out.println(extrasData);
		int extrasDataInt = Integer.parseInt(extrasData);
		sum=sum+extrasDataInt;
		System.out.println("runtime output sum is: "+sum);
		//		String firstColTargetXpath2 = "//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[contains(text(),'Total')]";
		//		String totalData = driver.findElement(By.xpath("("+firstColTargetXpath2+"//following-sibling::div)[1]")).getText();
		String totalData = driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div")).getText();
		System.out.println(totalData);
		int totalDataInt = Integer.parseInt(totalData);
		System.out.println("runtime output Total-value is: "+totalData);
		if(sum == totalDataInt) {
			Assert.assertEquals(sum, totalDataInt);
			System.out.println("Count Matches");
		}

		// Selenium can take screenshot by using "getScreenshotAs" method
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Java\\1stJava\\test.png"));

		driver.close();
		driver.quit();
		driver=null;

	}

}
