package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),\"Account & Lists\")]")
	private WebElement accountListButton;
	
	@FindBy(xpath = "//span[contains(text(),\"Sign in\")]")
	private WebElement signInButton;

	public WebElement getAccountListButton() {
		return accountListButton;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	

}
