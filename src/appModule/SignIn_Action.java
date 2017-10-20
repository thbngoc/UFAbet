package appModule;

import pageObjects.Login_Page;
import pageObjects.welcome_Page;

import org.openqa.selenium.WebDriver;

public class SignIn_Action {
	
	public static void Execute (WebDriver driver,String sUsername, String sPassword){
		Login_Page.txt_UserName(driver).sendKeys(sUsername);
		Login_Page.txt_Password(driver).sendKeys(sPassword);
		Login_Page.btn_Login(driver).click();
		welcome_Page.btn_Agree(driver).click();
	}

}
