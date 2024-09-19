package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	
	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),\"Sign Out\")]")
	private WebElement signOutButton;

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	
	
	
	

}
