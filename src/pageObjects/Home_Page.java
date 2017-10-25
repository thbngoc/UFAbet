package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utility;
public class Home_Page {
	//The element will be returned. Just one property per class.
			private static WebElement element = null;
			private static Alert homePage_Alert = null;
			
			//Get the Selenium Web Element for 'Soccer' link
			public static WebElement lnk_Soccer(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//*[@id='key-soccer']/li[1]/a/span", utilities.Constant.pollingValue,utilities.Constant.timedOutValue );
				element = driver.findElement(By.xpath("//*[@id='key-soccer']/li[1]/a/span"));
				 
			    return element;
			 
			    }	
			
			//Get the Selenium Web Element for 'Odd/Even total goal' link
			public static WebElement lnk_OddEvenTotalGoal(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//*[@id='soccer-oddEvenTotalGoal']/a", utilities.Constant.pollingValue,utilities.Constant.timedOutValue );
				element = driver.findElement(By.xpath("//*[@id='soccer-oddEvenTotalGoal']/a"));
				 
			    return element;
			 
			    }	
			
			//Get the Selenium Web Element for 'Odd Value link (e.g. 0.96)
			public static WebElement lnk_OddValue(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//*[@id='mount']/div/main/div/div/article/div[2]/table/tbody/tr[2]/td[4]/div/span", utilities.Constant.pollingValue,utilities.Constant.timedOutValue);
				element = driver.findElement(By.xpath("//*[@id='mount']/div/main/div/div/article/div[2]/table/tbody/tr[2]/td[4]/div/span"));
				 
			    return element;
			 
			    }	
			//Get the Selenium Web Element for 'Amount' text field
			public static WebElement txt_Amount(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//*[@id='amount']", utilities.Constant.pollingValue,utilities.Constant.timedOutValue);
				element = driver.findElement(By.xpath("//*[@id='amount']"));
				 
			    return element;
			 
			    }	
			//Get the Selenium Web Element for 'Process Bet' button
			public static WebElement btn_ProcessBet(WebDriver driver){
				
				Utility.waitForElement(driver, "linkText", "Process Bet", utilities.Constant.pollingValue,utilities.Constant.timedOutValue );
				element = driver.findElement(By.linkText("Process Bet"));
				 
			    return element;
			 
			    }	
			
			//Get the Selenium Alert Element for Home Page
			public static Alert alt_Alert(WebDriver driver){
				
				//wait for the Alert to appear
				if(Utility.isAlertPresent(driver) ) {
					homePage_Alert  = driver.switchTo().alert();
			 
			    }
				return homePage_Alert ;
			}
			public static WebElement lbl_MaxPayout(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//div[@class=\"bet-max-min margin-top-20\"]/div[2]", utilities.Constant.pollingValue,utilities.Constant.timedOutValue);
				element = driver.findElement(By.xpath("//div[@class='bet-max-min margin-top-20']/div[2]"));
				 
			    return element;
			 
			    }	
			
			public static WebElement lbl_betRatio(WebDriver driver){
				
				Utility.waitForElement(driver, "xpath", "//div[@class=\"bet-box\"]/div/span[2]", utilities.Constant.pollingValue,utilities.Constant.timedOutValue);
				element = driver.findElement(By.xpath("//div[@class=\"bet-box\"]/div/span[2]"));
				 
			    return element;
			 
			    }
}
