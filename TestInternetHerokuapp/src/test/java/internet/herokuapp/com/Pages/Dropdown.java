package internet.herokuapp.com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown extends BasePage {

@FindBy (xpath = "//select[@id='dropdown']" )
WebElement	listeDropdown;
	
public Dropdown () {
	
PageFactory.initElements(driver, this);	
	
}
	
	
	
	public String Gettiitletext() {
		
		return null;	
		}
	
	
	
}
