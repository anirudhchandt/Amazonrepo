package functionalTestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLib.Baseclass;
import pom.Homepage;

public class Testscript01_Test extends Baseclass {

	@Test
	public void searchFuntionality() {
		Homepage hp = new Homepage(driver);
		SoftAssert sa = new SoftAssert();
		hp.getSearchTextbox().sendKeys("Apple Iphone 15");
		sa.assertEquals(hp.getSearchTextbox().getAttribute("value"), "Apple Iphone 15",
				"The string entered in the textbox is not correct");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			js.executeScript("window.scrollBy(0,500)");
		}

		hp.getSearchSubmitButton().click();
		sa.assertAll();

	}

}
