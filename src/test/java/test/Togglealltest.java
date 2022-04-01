package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.Toggleallpage;
import util.Browserfactory;

public class Togglealltest {
	WebDriver driver;

	@Test
	public void checkToggleAll() {
		driver = Browserfactory.init();
		Toggleallpage toggleAllPage = PageFactory.initElements(driver, Toggleallpage.class);
		toggleAllPage.clicktoggleall();
	
		//toggleAllPage.validateListItemChecked();

		//BrowserFactory.tearDown();
}
}