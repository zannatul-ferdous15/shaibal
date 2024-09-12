package utility_onlineshop;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Onlineshop_Base {
	public static WebDriver driver;
	public static Properties onlineshopProp;
	
	//CONSTRUCTOR
	public Onlineshop_Base() {
		try {
			FileInputStream onlineshopFile= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration\\onlineshop\\OnlineshopConfig.properties");
		    onlineshopProp= new Properties();
			onlineshopProp.load(onlineshopFile);
		} catch (FileNotFoundException e) {
			System.out.println("please fixd your constructor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//BROWSER SET UP
	public void OnlineshopBrowserSetup(){
		String onlineshopAllBrowser=onlineshopProp.getProperty("Browser1");
		if(onlineshopAllBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\onlineshop_driven\\chromedriver.exe");//set chromedriver	
			 ChromeOptions  obj=new ChromeOptions();
			 obj.addArguments("--remote-allow-origins=*");
			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Onlineshop_Utility.implicitlyWait));
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Onlineshop_Utility.pageLoadTimeout));
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			
		}
		else if(onlineshopAllBrowser.equals("IE")) {
			
		}
		
		
	}
	//URL SETUP
	public static void OnlineshopURLSetup(String URL) {
		driver.get(onlineshopProp.getProperty("OnlineshopURL"));
		
		
	}

}
