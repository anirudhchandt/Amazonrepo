package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchTextbox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchSubmitButton;

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getSearchSubmitButton() {
		return searchSubmitButton;
	}
	
	

}
