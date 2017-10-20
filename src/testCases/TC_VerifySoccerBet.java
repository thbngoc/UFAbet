package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;
import appModule.*;
import org.openqa.selenium.Alert;
import utilities.Constant;

public class TC_VerifySoccerBet {
	private static WebDriver driver;

	@Test
	public void TC_OddEvenTotalGoal() {
		
		SignIn_Action.Execute(driver, Constant.Username, Constant.Password);
		
		SelectSport_Action.Execute(driver, "Soccer","OddEven");
		Home_Page.lnk_OddValue(driver).click();
		Home_Page.txt_Amount(driver).sendKeys("10");
		
		//verify the Max Payout value is correct. Temporary down due to 'There is an unavailable game' message.
		//Assert.assertTrue(assertHandler.assertMaxPayout(driver, 10)); 
		Home_Page.btn_ProcessBet(driver).click();

		//Wait for 5 secs and click on 'Accept' button under the Alert
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Click on the 'OK' button on the Alert
		Alert a = driver.switchTo().alert();
		a.accept();

		//Wait for 5 secs (to see the result)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@BeforeMethod
	public void beforeMethod() {
		driver = WebDriver_Handler.initialDriver("Chrome", Constant.URL);
		// Print a Log In message to the screen
		System.out.println("Successfully opened the website http://ufa.kolabs");
	}

	@AfterMethod
	public void afterMethod() {
		WebDriver_Handler.quitDriver(driver);
	}

}
