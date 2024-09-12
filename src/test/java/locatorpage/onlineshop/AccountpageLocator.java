package locatorpage.onlineshop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_onlineshop.Onlineshop_Base;

public class AccountpageLocator extends Onlineshop_Base {
	
	public AccountpageLocator() {
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="reg_username")
	public WebElement UserID;
	
	@FindBy(id="reg_email")
	public WebElement UserEmail;
	
	
	@FindBy(id="reg_password")
	public WebElement UserPassword;
	
	@FindBy(name="register")
	public WebElement RegisterButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/main/article/div/div[2]/div/div[2]/div[1]/ul/li/strong")
	public WebElement Profile;

	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement LoginPassword;
	
	@FindBy(name="login")
	public WebElement LoginButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/main/article/div/div[2]/div/div[2]/div/p[1]/strong[1]")
	public WebElement loginVerify;

	@FindBy(xpath="//a[text()='Log out']")
	public WebElement LogOut;
}

