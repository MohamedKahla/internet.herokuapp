package internet.herokuapp.com.StepDefinition;

import java.util.List;

import org.junit.Assert;

import internet.herokuapp.com.Pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
public class HomeStepDefinition {

	HomePage home = new HomePage();
	
	
	
	
@Then("^the Subtittle page is \"([^\"]*)\"$")
public void the_subtittle_page_is_something(String ExpectedSubtittlepage) throws Throwable {	
    	String	ActualSubtittleText	= home.GetSubTittletext();
    	Assert.assertEquals(ExpectedSubtittlepage, ActualSubtittleText);	
    	
    }	
	

@Then("^the list of the subpages below is displayed$")
public void the_list_of_the_subpages_below_is_displayed(DataTable Subpages) throws Throwable {

	List<String> expectedList = Subpages.asList();
	List<String> Acutallist = home.GetSubPagesName();
	Assert.assertEquals(expectedList, Acutallist);

}	

@When("^I click on the \"([^\"]*)\" link$")
public void i_click_on_the_something_link(String page) throws Throwable {
home.ClickOnSubpageLink(page);


}
	
	
	
	
	
	
	
	
	
}
