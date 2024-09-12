package stepdefination_onlineshop;

import actionpage.onlineshop.AccountPageAction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility_onlineshop.Onlineshop_Base;

public class UserLogin extends Onlineshop_Base  {
	
	AccountPageAction accountPageAction= new AccountPageAction();
	
	@When("^Enter user name and password and Click login button$")
	public void enter_user_name_and_password_and_Click_login_button() throws Throwable {
		accountPageAction.Enter_username_password_Click_login_button(onlineshopProp.getProperty("UserName1"),onlineshopProp.getProperty("UserPassword1") );
	}

	@Then("^verify login successfully$")
	public void verify_login_successfully() throws Throwable {
		accountPageAction.verify_login_successfully();
	}
	
	@Then("^click logout button$")
	public void click_logout_button() throws Throwable {
		accountPageAction.click_logout_button(); 
	}
	
	

}
