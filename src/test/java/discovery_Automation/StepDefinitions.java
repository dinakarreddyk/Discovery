package discovery_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepDefinitions {

	 @Given("^user is on discovery home page$")
	 public void user_is_on_Home_Page() throws Throwable {
	System.out.println("hello");
	System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.discovery.com/");	 
	 }
}
