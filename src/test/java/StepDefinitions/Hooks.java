package StepDefinitions;


import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.LogStatus;

import ProSchoolCore.WebConnector;
import ProSchool_Util.TestConfig;
import ProSchool_Util.monitoringMail;
import ProSchool_Util.testUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WebConnector{

	@Before("@MobileTest")
	public void openBrowser()
	{
		
		report.init("E:\\QA Manual Automation\\WebApplication_Project\\report.html", true);
		//Checking browser and launching according to it.
		report.startTest("Browser opening");
		report.log(LogStatus.INFO, "Navigated to chrome Browser");
		//Checking browser and launching according to it.
		if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(config.getProperty("browser").equals("Edge"))
		{
			System.setProperty("webdriver.msedgedriver.driver", "E:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\edgedriver_win64\\msedgedriver");
			driver=new  EdgeDriver();
			
		}else if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.geckodriver.driver", "E:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
			driver=new  FirefoxDriver();
		}
	}
	
	
	
	@After("@RegTest")
	public void close_Browser_after_execution() throws AddressException, MessagingException
	{
		if(driver!=null)
			driver.close();
		report.startTest("close_Browser_after_execution");
		report.log(LogStatus.INFO, "ScreenShot Zip File");
		testUtil.zip(System.getProperty("user.dir")+"\\screenshot\\");
		report.log(LogStatus.INFO, "Mail Sending");
		monitoringMail mail=new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		report.endTest();
	}
}