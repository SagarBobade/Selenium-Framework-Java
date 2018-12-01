package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import activity.Login;
import values.IndexPageValues;

public class TestIndex {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
//	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html",true);
//	report.loadConfig(new File(System.getProperty("user.dir")));
//	test = report.startTest("ExtentDemo");
	}
	
  @Test
  public void TestIndexfunc() throws Exception {
	  
	  WebDriver driver = Prerequisite.preRequisite();
	  Login.getUrl(driver, IndexPageValues.webURL, IndexPageValues.expectedTitle);
	 
		Login.doLogin(driver);
		System.out.println("Hi your are done");

  }
  @AfterClass
  public static void endTest()
  {

  }
}
