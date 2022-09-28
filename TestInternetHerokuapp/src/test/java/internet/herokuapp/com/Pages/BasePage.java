package internet.herokuapp.com.Pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

public static	WebDriver driver;	

public static	String Url_de_base = "https://the-internet.herokuapp.com";	
public static	Map<String, String> Url_Page = new HashMap<String, String>();
static {
	
	Url_Page.put("home", Url_de_base + "/");	
	Url_Page.put("Add/Remove Elements", Url_de_base + "/add_remove_elements/" );	
	Url_Page.put("Basic Auth (user and pass: admin)", Url_de_base + "/basic_auth" );	
	Url_Page.put("Broken Images", Url_de_base + "/broken_images" );
	Url_Page.put("Challenging DOM", Url_de_base + "/challenging_dom" );
	Url_Page.put("Checkboxes", Url_de_base + "/checkboxes" );
	Url_Page.put("A/B Testing", Url_de_base + "/abtest" );
	Url_Page.put("Basic Auth", Url_de_base + "/basic_auth" );
}
	
	
public abstract String Gettiitletext();
	
	
public  BasePage() {
	PageFactory.initElements(driver, this);	
	}	

}
