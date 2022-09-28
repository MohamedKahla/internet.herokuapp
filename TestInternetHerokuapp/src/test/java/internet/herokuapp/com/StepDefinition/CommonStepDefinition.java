package internet.herokuapp.com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import internet.herokuapp.com.Helper.Manager;
import internet.herokuapp.com.Pages.BasePage;
import internet.herokuapp.com.Pages.CheckboxesPage;
import internet.herokuapp.com.Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice.This;

public class CommonStepDefinition {

	String page;
	
	
public	BasePage getpage () {
	
	if (page.equals("home") ) {

	return new HomePage();
	}
	
	else if (page.equals("Checkboxes") ) {

		return new CheckboxesPage();
		}
	
	return null;
	
}

@Before
public void init() {
	
BasePage.driver = Manager.getdriver();	
	
}

@After
public void CloseDriver() {
	
BasePage.driver.close();	
	
}


@Given("^i have navigated on the 'the-internet' \"([^\"]*)\" page$")
    public void i_have_navigated_on_the_theinternet_something_page(String PageName) throws Throwable {
	this.page = PageName;
	String  UrlPage = BasePage.Url_Page.get(PageName);
	BasePage.driver.get(UrlPage);
}
	
	
@Then("^the page tittle is \"([^\"]*)\"$")
public void the_page_tittle_is_something(String ExpectedTittle) throws Throwable {
   String  ActualTittlePage =  getpage().Gettiitletext();
   Assert.assertEquals(ExpectedTittle, ActualTittlePage);
}	
	

@Then("^the \"([^\"]*)\" opens$")
public void the_something_opens(String page) throws Throwable {
 String ExpectedUrl	=	BasePage.Url_Page.get(page);
 WebDriverWait wait = new WebDriverWait(BasePage.driver, 20);
 wait.until(ExpectedConditions.urlToBe(ExpectedUrl));
 String ActualUrl = BasePage.driver.getCurrentUrl();	
 Assert.assertEquals(ExpectedUrl, ActualUrl);	
		 
}





}
