package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.demoqaAlerts_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.PropertiesReader;

public class demoqaAlerts_Test {
	BrowserUtils utils = new BrowserUtils();

	demoqaAlerts_Page alertPage = new demoqaAlerts_Page();

	@BeforeTest
	public void beforeMethod() {
		Driver.getDriver();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void test1() throws Exception {
		Driver.getDriver().get(PropertiesReader.getProperty("demoqaUrl"));
		Thread.sleep(3000);
		alertPage.alertButton.click();
		utils.switchToAlert();
		utils.waitUntilAlertIsPresent();
		String actualAlertMethod = utils.alertGetText();
		System.out.println("first Alert Text is: " + actualAlertMethod);
		Assert.assertEquals(actualAlertMethod, "You clicked a button");
		utils.alertAccept();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void test2() throws Exception {
		Driver.getDriver().get(PropertiesReader.getProperty("demoqaUrl"));
		alertPage.timerAlertButton.click();
		Thread.sleep(5000);
		utils.switchToAlert();
		utils.waitUntilAlertIsPresent();
		String actioalSecondText = utils.alertGetText();
		Assert.assertEquals(actioalSecondText, "This alert appeared after 5 seconds");
		utils.alertAccept();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void ThridAlertBtn() throws InterruptedException {
		Driver.getDriver().get(PropertiesReader.getProperty("demoqaUrl"));

		alertPage.confirmButton.click();
		Thread.sleep(2000);
		utils.switchToAlert();
		utils.waitUntilAlertIsPresent();
		String actioalThredText = utils.alertGetText();
		System.out.println("3 Alert Text is: " + actioalThredText);
		Assert.assertEquals(actioalThredText, "Do you confirm action?");
		Thread.sleep(3000);
		utils.alertDismiss();
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void fourthAlertBtn() throws InterruptedException {
		Driver.getDriver().get(PropertiesReader.getProperty("demoqaUrl"));
		alertPage.promtButton.click();
		utils.switchToAlert();
		utils.waitUntilAlertIsPresent();
		String actioalFourthText = utils.alertGetText();
		Assert.assertEquals(actioalFourthText, "Please enter your name");
		Thread.sleep(3000);
        utils.sendKeysOnAlert("Java");
		
		utils.alertAccept();
		Thread.sleep(3000);

	}

	@AfterTest
	public void afterMethod() {
		Driver.quitDriver();
	}

	/*
	 * Test case 1 go to https://demoqa.com/alerts Click on the ClickMe button for
	 * the first Alert and Accept the alert. Test case 2 go to
	 * https://demoqa.com/alerts Click on the ClickMe button for the second Alert
	 * and Accept the alert. Test case 3 go to https://demoqa.com/alerts Click on
	 * the ClickMe button for the third Alert and Dismiss the alert. Test case 4 go
	 * to https://demoqa.com/alerts Click on the ClickMe button for the last Alert,
	 * enter a text and accept.
	 */
}
