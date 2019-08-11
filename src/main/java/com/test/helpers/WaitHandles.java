package com.test.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandles {
	
	public void visibilityOfTheElementLocatedBy(WebDriver driver, WebDriverWait wait, By titleDescription2BeforeAddingToFav)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(titleDescription2BeforeAddingToFav));
		
	}

	
	public void elementToBeClickable(WebDriver driver, WebDriverWait wait, By addFavourite)
	{
		wait.until(ExpectedConditions.elementToBeClickable(addFavourite));
	    
	
	}
}
