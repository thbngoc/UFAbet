package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utilities.*;

public class welcome_Page {
	//The element will be returned. Just one property per class.
		private static WebElement element = null;
		
		//Get the Selenium Web Element for Agree Button
		public static WebElement btn_Agree(WebDriver driver){
			
			
			Utility.waitForElement(driver, "linkText", "Agree", utilities.Constant.pollingValue,utilities.Constant.timedOutVale );
			
			element = driver.findElement(By.linkText("Agree"));
			 
		    return element;
		 
		    }

}
