package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Toggleallpage {
WebDriver driver;
public Toggleallpage(WebDriver driver) {
	driver=this.driver;
	
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
	
	
	public boolean clicktoggleall() {
		TOGGLEALL_ELEMENT.click();
		List<WebElement> listofItemsAdded = driver.findElements(By.name("todo"));
		if (listofItemsAdded.isEmpty() == true) {
			// boolean itemsremoved = true;
			return true;
		} else {

			for (WebElement element : listofItemsAdded) {
				element.isSelected();
				System.out.println(element.getText());
			}
			return false;

		}
}
}
