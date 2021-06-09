package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class demoqaAlerts_Page {
	public demoqaAlerts_Page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "alertButton")
	public WebElement alertButton;

	@FindBy(xpath  = "//button[@id='timerAlertButton']")
	public WebElement timerAlertButton;

	@FindBy(id = "confirmButton")
	public WebElement confirmButton;

	@FindBy(id = "promtButton")
	public WebElement promtButton;

}
