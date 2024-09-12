package stepdefination_onlineshop;

import actionpage.onlineshop.AccountPageAction;   
import actionpage.onlineshop.HomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



import utility_onlineshop.Onlineshop_Base;

//import cucumber.api.java.en.Given;
public class UserRegister extends Onlineshop_Base {
	HomePageAction homePageAction= new HomePageAction();
	AccountPageAction accountPageAction= new AccountPageAction();
	
	
	@Given("^Open onlineshop \"([^\"]*)\" application$")
	public void open_onlineshop_application(String URL) throws Throwable {
		OnlineshopURLSetup("URL");
	}

	@When("^Click account link$")
	public void click_account_link() throws Throwable {
		homePageAction.Click_account_link();
	}


@When("^Enter user name and email and password and Click register button$")
public void enter_user_name_and_email_and_password_and_Click_register_button() throws Throwable {
	accountPageAction.Enter_username_email_password_Click_register_button(onlineshopProp.getProperty("UserName"),onlineshopProp.getProperty("UserEmail"),onlineshopProp.getProperty("UserPassword") );

	}

	@Then("^verify register successfully$")
public void verify_register_successfully() throws Throwable {
		accountPageAction.verify_register_successfully();
	
	}
}


