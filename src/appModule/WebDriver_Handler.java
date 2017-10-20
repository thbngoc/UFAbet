package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.Constant;


public class WebDriver_Handler {
	
	private static WebDriver driver = null;
	
	public static WebDriver initialDriver(String desiredDriver, String appURL) {
		
		switch (desiredDriver) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", Constant.chromeDriverPath);
			driver = new ChromeDriver();
			break;
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", Constant.fireFoxDriverPath);
			driver = new FirefoxDriver();
			break;
		//additional code may be added for support IE browser
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);
		return driver;
	}
	
	public static void quitDriver (WebDriver d) {
		d.quit();
	}
	
}
