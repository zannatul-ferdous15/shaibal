package locatorpage.onlineshop;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_onlineshop.Onlineshop_Base;

public class HomepageLocator extends Onlineshop_Base {
	
	public HomepageLocator() {
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(linkText="Account")
	public WebElement Accountlink;


}
