package SeleniumBasic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteGrid {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		// provide: which server
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		driver.get("https://www.google.ca");
		
		// below are steps on Hub machine:
		//>java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.175:4444/grid/register -port 5566
		
		// below are steps on Node machine:
		//>java -Dwebdriver.chrome.driver="F;\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub +++
				// +++++  http://192.168.1.175:4444/grid/register -port 5566
		
		//shut down Hub machine, cmd is: Ctrl c

	}

}
