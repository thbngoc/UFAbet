package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utilities.Utility;



public class Login_Page {
	
	//The element will be returned. Just one property per class.
	private static WebElement element = null;
	
	//Get the Selenium Web Element for User Name text box
	public static WebElement txt_UserName(WebDriver driver){
		
		Utility.waitForElement(driver, "id", "username", utilities.Constant.pollingValue,utilities.Constant.timedOutVale );
		element = driver.findElement(By.id("username"));

		return element;
	 
	    }
	
	//Get the Selenium Web Element for Password text box
	public static WebElement txt_Password(WebDriver driver){
		
		Utility.waitForElement(driver, "xpath", "//input[@type='password']", utilities.Constant.pollingValue,utilities.Constant.timedOutVale );
		element = driver.findElement(By.xpath("//input[@type='password']"));
	 
	    return element;
	 
	    }
	//Get the Selenium Web Element for Login button
		public static WebElement btn_Login(WebDriver driver){
			 
			
			Utility.waitForElement(driver, "linkText", "Login", utilities.Constant.pollingValue,utilities.Constant.timedOutVale );
			element = driver.findElement(By.linkText("Login"));
		 
		    return element;
		 
		}
}
