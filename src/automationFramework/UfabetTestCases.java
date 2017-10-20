package automationFramework;

import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;
import appModule.*;
import org.openqa.selenium.Alert;
import utilities.Constant;


public class UfabetTestCases {
	
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = WebDriver_Handler.initialDriver("Chrome", Constant.URL);
		// Print a Log In message to the screen
		System.out.println("Successfully opened the website http://ufa.kolabs");

		SignIn_Action.Execute(driver, Constant.Username, Constant.Password);

		SelectSport_Action.Execute(driver, "Soccer","OddEven");
		Home_Page.lnk_OddValue(driver).click();
		Home_Page.txt_Amount(driver).sendKeys("10");
		Home_Page.btn_ProcessBet(driver).click();

		//Wait for 5 secs and click on 'Accept' button under the Alert
		Thread.sleep(10000);

		//Click on the 'OK' button on the Alert
		Alert a = driver.switchTo().alert();
		a.accept();

		//Wait for 5 secs (to see the result)
		Thread.sleep(5000);

		// Close the driver	
		WebDriver_Handler.quitDriver(driver);
	}

}
