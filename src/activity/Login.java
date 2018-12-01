package activity;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;

import exceptionLogText.CommonExceptionMsg;
import exceptionLogText.LoginPageExceptionMsg;
import pages.LoginPage;
import values.CommonValues;
import values.IndexPageValues;

public class Login {

	public static void getUrl(WebDriver driver, String url, String expectedTitle) {

		try {
			driver.get(url);
			if (!(driver.getTitle().equals(expectedTitle))) {
				
				throw new Exception(CommonExceptionMsg.pageTitleMismatched);
			}
		} catch (Exception e) {
			CommonValues.logger.log(Level.INFO, CommonExceptionMsg.getURLFailed);
		}
	}

	public static Boolean doLogin(WebDriver driver) {

		try {
			LoginPage loginPage = new LoginPage(driver);
			try {
				loginPage.findByNameAndTypeEmail(IndexPageValues.email);
				loginPage.findByNameAndTypePassword(IndexPageValues.password);
				loginPage.findByXpathAndClickLoginBtn(location.LoginPage.loginBtnXpath);
			} catch (Exception e) {
				CommonValues.logger.log(Level.INFO, LoginPageExceptionMsg.doLoginFailed);
			}
		} catch (Exception e) {
			CommonValues.logger.log(Level.INFO, LoginPageExceptionMsg.LoginPageObjectCreationFailed);
		}
		return true;
	}
}
