package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;

public class SelectSport_Action {
	
	public static void Execute (WebDriver driver, String sport, String betType) {
		
		switch (sport) {
		
		case "Soccer": 
			Home_Page.lnk_Soccer(driver).click();
			
			if (betType == "OddEven")
				Home_Page.lnk_OddEvenTotalGoal(driver).click();
			else if (betType =="HDPOU") 
				//handle code here
			//more Bet type will be added	
			break;
			}
		//additional Sport will be added here.
		}
	}


