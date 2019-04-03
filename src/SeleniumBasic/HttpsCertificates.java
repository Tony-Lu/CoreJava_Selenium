package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpsCertificates {	// No.102 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\toolDownloaded\\chromedriver.exe");	
		//Desired Capabilities:
		// general chrome profile: +++ adding plugin
		DesiredCapabilities ch = DesiredCapabilities.chrome();
//		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//below is setting for your local chrome language:
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--lang=en-US");
		op.merge(ch);
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		//driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("kdkdkd");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
//		driver.get("https://www.cricbuzz.com/");
		
		
		

	}

}
