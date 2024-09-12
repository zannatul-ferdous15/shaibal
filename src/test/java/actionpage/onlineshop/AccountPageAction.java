package actionpage.onlineshop;




import org.testng.Assert;  

import locatorpage.onlineshop.AccountpageLocator;
import utility_onlineshop.Onlineshop_Base;

public class AccountPageAction extends Onlineshop_Base  {
	AccountpageLocator accountpageLocator= new AccountpageLocator();
	
	public void Enter_username_email_password_Click_register_button(String U,String E,String P ) {
		
		accountpageLocator.UserID.sendKeys(U);
		accountpageLocator.UserEmail.sendKeys(E);
		accountpageLocator.UserPassword.sendKeys(P);
		accountpageLocator.RegisterButton.click();
		
	}
	public void verify_register_successfully() {
		boolean profilevarification=accountpageLocator.Profile.isDisplayed();
		Assert.assertTrue(profilevarification);
	}
	
	public void Enter_username_password_Click_login_button(String N,String L) {
		
		accountpageLocator.UserName.sendKeys(N);
		accountpageLocator.LoginPassword.sendKeys(L);
		accountpageLocator.LoginButton.click();
		
		
	}
	public void verify_login_successfully() {
		boolean loginverify=accountpageLocator.loginVerify.isDisplayed();
		Assert.assertTrue(loginverify);
		
		
	}
	public void click_logout_button() {
		accountpageLocator.LogOut.click();	
	}
}
	
	

