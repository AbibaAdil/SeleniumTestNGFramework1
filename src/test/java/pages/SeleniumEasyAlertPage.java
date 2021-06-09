package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;


public class SeleniumEasyAlertPage {

	public SeleniumEasyAlertPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement firstAlertBtn;

	@FindBy(xpath = "//button[@onclick='myConfirmFunction()']")
	public WebElement secondAlertBtn;

	@FindBy(xpath = "//button[@onclick='myPromptFunction()']")
	public WebElement thirdAlertBtn;

}
/*
 * Test case 1 go to https://demoqa.com/alerts Click on the ClickMe button for
 * the first Alert and Accept the alert. 
 * Test case 2 go to
 * https://demoqa.com/alerts Click on the ClickMe button for the second Alert
 * and Accept the alert. Test case 3 go to https://demoqa.com/alerts Click on
 * the ClickMe button for the third Alert and Dismiss the alert. Test case 4 go
 * to https://demoqa.com/alerts Click on the ClickMe button for the last Alert,
 * enter a text and accept.
 */