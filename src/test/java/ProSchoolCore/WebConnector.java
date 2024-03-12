package ProSchoolCore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import StepDefinitions.Verify_ProSchool_Test;

public class WebConnector {
	public static Properties config=new Properties();
	public static Properties object=new Properties();
	public static FileInputStream fis;
	public static WebDriver driver=null;
	public static Logger logs=Logger.getLogger("devpinoyLogger");
	public static ExtentReports report=ExtentReports.get(Verify_ProSchool_Test.class);
	
	public WebConnector() 
	{
		if(driver==null)
		{
			//loading config property file
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ProSchoolConfig\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//loading object property file
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ProSchoolConfig\\Object.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				object.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}	

}



