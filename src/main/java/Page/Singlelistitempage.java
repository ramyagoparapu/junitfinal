package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.junit.Assert;


public class Singlelistitempage {
	WebDriver driver;

	public Singlelistitempage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLEALL_ELEMENT;
	@FindBy(how = How.NAME, using = "data")
	WebElement LIST_ITEM_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[3]")
	WebElement FIRST_LIST_ITEM_BOX_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[4]")
	WebElement SECOND_LIST_ITEM_BOX_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[5]")
	WebElement THIRD_LIST_ITEM_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")
	WebElement ADD_LIST_ITEM_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"todos-content\"]/form/ul/li/input") 
	WebElement singleelement;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/a[77]/span")
	WebElement elementtobedeletedElement;
	@FindBy(how=How.XPATH,using="\"/html/body/a[1]\"")
	WebElement yesElement;
	public void singlelistitemremoval()  {
		
		
		singleelement.click();
		singleelement.isSelected();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	elementtobedeletedElement.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.navigate().back();
	REMOVE_BUTTON_ELEMENT.click();
	}
	public void validatingremovedelement() {
	if(elementtobedeletedElement.isSelected())
	{
		System.out.println("item not deleted");
	}else {
		System.out.println("item deleted");
	}
	}


}
