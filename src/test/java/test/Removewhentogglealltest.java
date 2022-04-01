package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.Removewhentoggleallpage;
import util.Browserfactory;

public class Removewhentogglealltest {


	WebDriver driver;

	@Test
	public void validateAllItemRemove() {
		driver = Browserfactory.init();
		Removewhentoggleallpage togglealltest = PageFactory.initElements(driver, Removewhentoggleallpage.class);
		togglealltest.clearData();
}}