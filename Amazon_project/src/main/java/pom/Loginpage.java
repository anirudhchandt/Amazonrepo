package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	private WebElement emailTextbox;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement continueButton;
	
	@FindBy(id = "ap_password")
	private WebElement passwordTextbox;
	
	@FindBy(id = "signInSubmit")
	private WebElement submitButton;

	public WebElement getEmailTextbox() {
		return emailTextbox;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
}
