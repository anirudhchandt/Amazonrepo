package genericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.Welcomepage;
import pom.Homepage;
import pom.Loginpage;
import pom.Logoutpage;

public class Baseclass {

	public WebDriver driver;
	Welcomepage wp = new Welcomepage(driver);
	Loginpage lp = new Loginpage(driver);
	Logoutpage lpo = new Logoutpage(driver);

	@BeforeClass
	public void launchBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void loginWithCred() {
		// wp.getAccountListButton().click();
		/*wp.getSignInButton().click();
		lp.getPasswordTextbox().sendKeys("anirudhchand@hotmail.com");
		lp.getContinueButton().click();
		lp.getPasswordTextbox().sendKeys("427742Anirudh!");
		lp.getSubmitButton().click(); */

	}

	@AfterMethod
	public void logOut() {
		//wp.getAccountListButton().click();
		//lpo.getSignOutButton().click();
	}

	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

}
