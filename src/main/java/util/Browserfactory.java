package util;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {
	 static WebDriver driver;

	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vanga\\eclipse-workspace\\junitpracticalecam\\driveruse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");
		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
		// TODO Auto-generated method stub
		
	}

}
