package internet.herokuapp.com.Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manager {

	

	
public static WebDriver getdriver () {
	WebDriver Driver = new ChromeDriver();	
	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	
	return Driver;
}
	
	
	
}
