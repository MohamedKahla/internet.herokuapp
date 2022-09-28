package internet.herokuapp.com.Pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

	
	
@FindBy (xpath = "//h1[contains(text(),'Welcome to the-internet')]" )	
WebElement TittleElemnt;	

@FindBy (xpath = "//h2[contains(text(),'Available Examples')]" )
WebElement subTittleElement;

@FindBy(xpath="//ul//li//a")
List<WebElement> ListOfSubpages;

@FindBy(xpath="//ul//li//a")
List<WebElement> ListOfSubpagesLinks;

	@Override
	public String Gettiitletext() {		
		return TittleElemnt.getText();
	}
	
	public String GetSubTittletext () {	
		return subTittleElement.getText();	
	}
	
	

public List<String> GetSubPagesName () {
	List<String> ListOfSubpagesName = new ArrayList<String>();
for (WebElement Elment : ListOfSubpages  )	{
	ListOfSubpagesName.add(Elment.getText());
}
	return ListOfSubpagesName;
}
	

public HomePage () {		
PageFactory.initElements(driver, this);		
}	

public void ClickOnSubpageLink (String SubPageName) {
	
for ( WebElement SubpageLink : ListOfSubpagesLinks ) {

if (SubPageName.equals(SubpageLink.getText())) {
	
	SubpageLink.click();
	break;
}
		
}

}
	
	
	
	
}
