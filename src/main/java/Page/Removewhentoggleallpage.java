package Page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.Browserfactory;

import org.junit.Assert;


public class Removewhentoggleallpage extends Browserfactory {
WebDriver driver;
	
	public Removewhentoggleallpage(WebDriver driver) {
		
		this.driver=driver;
	}
	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLEALL_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_BUTTON_ELEMENT;
	public boolean addListItem() {
List<WebElement> listofItemsAdded = driver.findElements(By.name("todo"));
		if(listofItemsAdded.isEmpty()==true) {
			//boolean itemsremoved = true;
			return true;
		}
		else {
			
			for (WebElement element: listofItemsAdded ) {
				element.isSelected();
				//System.out.println(element.getText());
			}
			return false;

		}

	}
	public  void clearData() {
		TOGGLEALL_ELEMENT.click();
		REMOVE_BUTTON_ELEMENT.click();
	}
	
	public void clickToggleAll() {
		TOGGLEALL_ELEMENT.click();
	}
	public void removeAll() {
		REMOVE_BUTTON_ELEMENT.click();
	}
	

	
}
