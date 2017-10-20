package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.function.Function;

public class Utility {
	
	// This method is to wait for and element to be there on the screen.
	public static void waitForElement (WebDriver driver, final String howToLocate, final String locator, int pollingEvery, int timedOut ) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		}
		/*
		 * Initial a wait object, set the polling and time out value, based on the parameters passed from outside.
		 * pollingEvery: the interval to check the element
		 * timedOut: maximum duration until the wait stop checking.
		 */
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.pollingEvery(pollingEvery,  TimeUnit.MILLISECONDS);
//		wait.withTimeout(timedOut, TimeUnit.MILLISECONDS);
//		wait.ignoring(NoSuchElementException.class);
//	 
//			Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
//					{
//						public Boolean apply(WebDriver arg0) {
//							
//							WebElement element = null;
//							//Dimension d = null;
//							
//							//based on each way to locate an element, we will try finding it.
//							switch (howToLocate.toString()) {
//							
//							case "id": element = arg0.findElement(By.id(locator));
//							break;
//							
//							case "linkText": element = arg0.findElement(By.linkText(locator));
//							break;
//							
//							case "xpath": element = arg0.findElement(By.xpath(locator));
//							break;
//							
//							//additional way of locate can be handle to have more comprehensive method				
//							
//							
//							}
//							
//							//d = element.getSize();
//							
//							//if the element is there on the screen, return 'true' and come back to the flow
//							if(element.isDisplayed())
//							{
//								return true;
//							}
//							return false;
//						}
//					};
//	 
//			wait.until(function);
//			
	}

}
}
