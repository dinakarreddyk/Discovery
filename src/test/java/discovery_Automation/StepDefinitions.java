package discovery_Automation;


import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.helpers.AssertionMethods;
import com.test.helpers.ClickElementsMethods;
import com.test.helpers.WaitHandles;
import com.test.locators.Locators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions extends Locators{
	
	String recommended_Title1="";
	String recommended_Description1="";
	String recommended_Title2="";
	String recommended_Description2="";
	String fav_Title1="";
	String fav_Description1="";
	String fav_Title2="";
	String fav_Description2="";
	

	ClickElementsMethods helperMethods=new ClickElementsMethods();
     AssertionMethods assertMethod=new AssertionMethods();
     WaitHandles waithandles=new WaitHandles();
	Actions act=new Actions(driver);
	Logger log=Logger.getLogger(StepDefinitions.class);
	 
	@Given("^user is on discovery home page$")
	 public void user_is_on_Home_Page() throws Throwable {
	
		System.out.println("Dir"+System.getProperty("user.dir"));
		driver.get("https://go.discovery.com/");
	log.info("Home Page");
	waithandles.elementToBeClickable(driver, wait, plusIcon);
	 
	}

@SuppressWarnings("unused")
@When("^user add recommended videos to favorite videos list$")
public void mousehoverOnRecommendedVideos() throws Throwable {
	
	
	 helperMethods.scrollDownTillTheElementVisible(driver, recommened);
	 helperMethods.mouseHover(driver, act, favVideo);
	 recommended_Title1=driver.findElement(title1BeforeAddingToFav).getText();
	 log.info(recommended_Title1);
	 System.out.println(" title before adding....     " +recommended_Title1);
	 recommended_Description1=driver.findElement(titleDescription1BeforeAddingToFav).getText();
	 System.out.println("description  before adding....    " +recommended_Description1);
	    helperMethods.click(driver,addFavourite);
	    Thread.sleep(3000);
	    helperMethods.mouseHover(driver, act, favVideo1);
	    recommended_Title2=driver.findElement(title2BeforeAddingToFav).getText();
	     waithandles.visibilityOfTheElementLocatedBy(driver,wait,titleDescription2BeforeAddingToFav);
	     System.out.println("Second video title before adding....     " + recommended_Title2);
		 recommended_Description2=driver.findElement(titleDescription2BeforeAddingToFav).getText();
		 System.out.println("Second Video description  before adding.....     " +recommended_Description2);
		  wait.until(ExpectedConditions.elementToBeClickable(addFavourite1));
		  helperMethods.click(driver,addFavourite1);
}

//add videos to favouirate videos

@And("^user should be able to see newly added videos under  favourite videos$")
public void userShouldBeAbleToSeeTheFavourite() throws Throwable
{
	
	helperMethods.click(driver,plusIcon);
	helperMethods.click(driver,myVideos);
	Thread.sleep(2000);
	helperMethods.scrollDown(driver);
	
 }

//verify the show title and description

@And("^verify the title and descriptions of videos under favaourite matches with the recommeneded videos$")
public void verifyTheShowTitleAndDescription() throws Throwable
{
	
	helperMethods.mouseHover(driver, act, video);
	 waithandles.visibilityOfTheElementLocatedBy(driver,wait,title1);
	fav_Title1=driver.findElement(title1).getText();
	 System.out.println("title After Adding....    " +fav_Title1);
	 waithandles.visibilityOfTheElementLocatedBy(driver,wait,titleDescription1);
	 fav_Description2=driver.findElement(titleDescription1).getText();
	 System.out.println("description After Adding....    " +fav_Description2);
	 helperMethods.mouseHover(driver, act, video1);
	 waithandles.visibilityOfTheElementLocatedBy(driver,wait,title2);
	 fav_Title2=driver.findElement(title2).getText();
	 System.out.println("title After Adding....    " +fav_Title2); 
    waithandles.visibilityOfTheElementLocatedBy(driver,wait,titleDescription2);
	  fav_Description2=driver.findElement(titleDescription2).getText();
     System.out.println("description After Adding....     " +fav_Description2);
	 assertMethod.checkTitle(recommended_Title1, fav_Title1);
	 }
}
