package common;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import exceptionLogText.CommonExceptionMsg;
import values.CommonValues;

public class Prerequisite {
	
	public static WebDriver preRequisite() {
//		WebDriver driver = null;
//		try{
//		System.setProperty("webdriver.chrome.driver", CommonValues.chromeDriverPath);
//		 driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//		}catch(Exception e){
//			CommonValues.logger.log(Level.INFO, CommonExceptionMsg.PreRequisiteFailed);
//		}
//		return driver;
//
//		}
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("security.insecure_field_warning.contextual.enabled", false);

		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\sagar\\Desktop\\Sel 3.4\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		return driver;
	}
}
