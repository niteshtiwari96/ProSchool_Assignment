package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import ProSchoolCore.WebConnector;
import ProSchool_Util.testUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * @MobileTest 
Scenario: User wants to open into ProSchool website 
	Given  ProSchool website is open in the browser 
	Then  the website is launched successfully
	
@RegTest
Scenario: User wants to login into ProSchool website
    When user clicks on login menu button
    Then Welcome to ProSchool page is displayed
    When user clisks on student option button
    Then user Enter EmailID
    | erniteshtiwari186@gmail.com  | 
    And  user Enter Password 
    |  blu3@T0p    |
    When user clicks on login button
    Then user succussfully complete the login process
 */
public class Verify_ProSchool_Test extends WebConnector {

	@Given("^ProSchool website is open in the browser$")
	public void ProSchool_website_is_open_in_the_browser() throws Throwable {
		try {
			report.startTest("ProSchool website is open in the browser");
			Thread.sleep(5000);
			System.out.println("ProSchool website is open in the browser");
			report.log(LogStatus.INFO, "ProSchool website is open in the browser");
			driver.get(config.getProperty("testsite"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40L));
			report.log(LogStatus.INFO, "Get Title");
			System.out.println(driver.getTitle());

		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "ProSchool website Functionaltiy Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}

	}

	@Then("^the website is launched successfully$")
	public void the_website_is_launched_successfully() throws Throwable {

		try {
			report.startTest("the website is launched successfully");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "ProSchool website is launched successfully");
			System.out.println("the website is launched successfully");
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "ProSchool website launching is Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}

	}

	@When("^user clicks on login menu button$")
	public void user_clicks_on_login_menu_button() throws Throwable {

		try {
			report.startTest("user clicks on login menu button");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "user clicks on login menu button");
			System.out.println("------------------------------------");
			System.out.println("user clicks on login menu button");
			WebElement Login_Menu = driver.findElement(By.xpath(object.getProperty("Login_Menu")));
			Login_Menu.click();
			System.out.println("------------------------------------");

		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user clicks on login menu button is Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@Then("^Welcome to ProSchool page is displayed$")
	public void Welcome_to_ProSchool_page_is_displayed() throws Throwable {

		try {
			report.startTest("Welcome to ProSchool page is displayed");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "Welcome to ProSchool page is displayed");
			System.out.println("Welcome to ProSchool page is displayed");
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, " Welcome to ProSchool page is not displayed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@When("^user clisks on student option button$")
	public void user_clisks_on_student_option_button() throws Throwable {

		try {
			report.startTest("user clisks on student option button");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "user clisks on student option button");
			System.out.println("------------------------------------");
			System.out.println("user clisks on student option button");
			WebElement Student_Link = driver.findElement(By.xpath(object.getProperty("Student_Link")));
			Student_Link.click();
			System.out.println("------------------------------------");

		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user clisks on student option button is Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@Then("^user Enter EmailID$")
	public void user_Enter_EmailID(DataTable email) throws Throwable {

		try {
			report.startTest("user Enter EmailID");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "Then user Enter EmailID");
			System.out.println("------------------------------------");
			List<List<String>> obj = email.raw();
			System.out.println("user Enter EmailID : " + obj.get(0).get(0));
			WebElement emailID = driver.findElement(By.xpath(object.getProperty("email")));
			emailID.sendKeys(obj.get(0).get(0));
			System.out.println("------------------------------------");
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user Enter EmailID Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@And("^user Enter Password$")
	public void user_Enter_Password(DataTable pass) throws Throwable {

		try {
			report.startTest("user Enter Password");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "user Enter Password");
			System.out.println("user Enter Password");
			System.out.println("------------------------------------");
			List<List<String>> obj = pass.raw();
			System.out.println("user Enter Password : " + obj.get(0).get(0));
			WebElement Password = driver.findElement(By.xpath(object.getProperty("pass")));
			Password.sendKeys(obj.get(0).get(0));
			System.out.println("------------------------------------");
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user Enter Password Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

		try {
			report.startTest("user clicks on login button");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "user clicks on login button");
			System.out.println("user clicks on login button");
			WebElement Login_Button = driver.findElement(By.xpath(object.getProperty("Login_Button")));
			Login_Button.click();
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user clicks on login button Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

	@Then("^user succussfully complete the login process$")
	public void user_succussfully_complete_the_login_process() throws Throwable {

		try {
			report.startTest("user succussfully complete the login process");
			Thread.sleep(2000);
			report.log(LogStatus.INFO, "user succussfully complete the login process");
			System.out.println("user succussfully complete the login process");
		} catch (Throwable t) {
			report.log(LogStatus.FAIL, "user succussfully complete the login process Failed");
			testUtil.captureScreenshot("Verify_ProSchool_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());

		}
	}

}
