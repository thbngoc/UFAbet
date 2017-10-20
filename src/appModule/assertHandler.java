package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.Home_Page;

public class assertHandler {
	
	public static Boolean assertMaxPayout (WebDriver driver, int inputAmount) {
		
		WebElement lbl_MaxPayout = Home_Page.lbl_MaxPayout(driver);
		WebElement lbl_betRatio = Home_Page.lbl_betRatio(driver);
		double expectedMaxPayout = inputAmount * Double.parseDouble(lbl_betRatio.getText()); //get the value of Bet Ratio
		double actualMaxPayout = Double.parseDouble(lbl_MaxPayout.getText());
		int compareResult = Double.compare(actualMaxPayout, expectedMaxPayout);
		
		if (compareResult == 0 )
			return true;
		else
			return false;
		
		
	}

}
