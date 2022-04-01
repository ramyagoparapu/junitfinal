package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.Singlelistitempage;
import Page.Toggleallpage;
import util.Browserfactory;

public class Singlelistitemtest {
	WebDriver driver;

	@Test
	public void singleitemremoval() {
	driver = Browserfactory.init();
	//Toggleallpage toggleAllPage = PageFactory.initElements(driver, Toggleallpage.class);
Singlelistitempage singleitempage=PageFactory.initElements(driver, Singlelistitempage.class);

	
	
	
	singleitempage.singlelistitemremoval();
	singleitempage.validatingremovedelement();
}}