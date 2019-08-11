package com.test.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.test.locators.Locators;


public class ClickElementsMethods
{
	private WebElement element=null;

	
	/** Method scrollDownTillTheElementVisible
	*/
    public void scrollDownTillTheElementVisible(WebDriver driver, By recommened) {
    	
    	try {
    	element = driver.findElement(recommened);
   	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
   	 
			} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
   	 
    }

    
    public void scrollDown(WebDriver driver)
    {
    
    	
    	try {
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /** Method to click on an element
	*/
	public void click(WebDriver driver, By addFavourite)
	{
		try {
			
			
			element = driver.findElement(addFavourite);
			element.click();
		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
  public void mouseHover(WebDriver driver, Actions act, By rec) {
	  
		try {    
			
		 WebElement recom= driver.findElement(rec);
		 act.moveToElement(recom).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

}