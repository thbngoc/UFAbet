package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;
import utilities.Constant;

public class Utility {
	
	// This method is to wait for and element to be there on the screen.
	public static void waitForElement (WebDriver driver, final String howToLocate, final String locator, int pollingEvery, int timedOut ) {

			waitForTheOverlayDisappeared(driver, Constant.timedOutValue, By.xpath("//div[@class='blockUI blockOverlay']"));
		/*
		 * Initial a wait object, set the polling and time out value, based on the parameters passed from outside.
		 * pollingEvery: the interval to check the element
		 * timedOut: maximum duration until the wait stop checking.
		 */
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(pollingEvery,  TimeUnit.MILLISECONDS);
		wait.withTimeout(timedOut, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
	 
			Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
					{
						public Boolean apply(WebDriver arg0) {
							
							WebElement element = null;
							switch (howToLocate.toString()) {
							
							case "id": element = arg0.findElement(By.id(locator));
							break;
							
							case "linkText": element = arg0.findElement(By.linkText(locator));
							break;
							
							case "xpath": element = arg0.findElement(By.xpath(locator));
							break;
							
							//additional way of locate can be handle to have more comprehensive methods				
							
							
							}
							
							if(element.isDisplayed())
							{
							return true;
								
							}
							return false;
						}
					};
	 
			wait.until(function);
		}
	
			
	
	//Method to wait for the Overlay
	private static void waitForTheOverlayDisappeared(WebDriver driver, long seconds, By locator) 	{
		
		
	    try {
	        new WebDriverWait(driver, seconds).until(ExpectedConditions.invisibilityOfElementLocated(locator));
	        return;
	       } catch (Exception ex) {
	        return; //wait too long for the overlay or something wrong
	       }
	}
	
	//Wait for the Alert is present
	public static boolean isAlertPresent(WebDriver driver){
	    boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(driver, Constant.timedOutValue /*timeout in seconds*/);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	    } catch (TimeoutException eTO) {
	        foundAlert = false;
	    }
	    return foundAlert;
	}
	
}

	



