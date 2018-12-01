package common;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import exceptionLogText.CommonExceptionMsg;

public class Common {

	public static WebElement element;
	
	public static void waitFor(WebDriver driver, WebElement elementToWaitFor){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) elementToWaitFor));
	}
	public static Boolean select(String value, By DropDown, WebDriver driver) {

		try{
		Select dropdown = new Select(driver.findElement(DropDown));
		dropdown.selectByVisibleText(value);
		return true;
		}
		catch (Exception e) {
			System.out.println("select function failed for selecting "+ value);
			return false;
		}
	}
	
	public static Boolean findByNameAndType(WebDriver driver,Logger logger, String fieldName, String name){
		
		try{
			System.out.println(fieldName + name);
			
		 driver.findElement(By.name(fieldName)).sendKeys(name);
		}catch(Exception e){
			logger.log(Level.INFO, CommonExceptionMsg.findByNameAndType+" - "+name );
		}
		 return true;
	}
	
	public static Boolean findByXpathAndClick(WebDriver driver,Logger logger, String xpath){
	
		try{
			 driver.findElement(By.xpath(xpath)).click();
			}catch(Exception e){
				logger.log(Level.INFO,CommonExceptionMsg.findByXpathAndClick+" - "+xpath);
			}
			 return true;
	}

}

