package com.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.env.DriverUtil;

public class Locators {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	public Locators() {
		
		driver = DriverUtil.getDefaultDriver();
		wait = new WebDriverWait(driver, 50);
	}
	
	protected By recommened=By.xpath("//div[text()='Recommended']");
	//protected By rec=By.xpath("(//div[@class='showTileSquare__content'])[18]");
	protected By favVideo=By.xpath("(//div[@class='showTileSquare__content'])[18]");
	protected By favVideo1=By.xpath("(//div[@class='showTileSquare__content'])[19]");

	protected By addFavourite=By.xpath("(//div[@class='my-favorites-button-container'])[18]");
	protected By addFavourite1=By.xpath("(//div[@class='my-favorites-button-container'])[19]");
	protected By plusIcon=By.xpath("//li[@class='dscHeaderMain__hideMobile']");
	protected By favoriteShows=By.xpath("//h2[text()='Favorite Shows']");
	protected By titleLocator=By.xpath("(//div[@class='showTileSquare__content']//div)[1]");
	protected By title1BeforeAddingToFav=By.xpath("(//h3[@class='showTileSquare__title'])[18]");
	protected By title2BeforeAddingToFav=By.xpath("(//h3[@class='showTileSquare__title'])[19]");
	protected By titleDescription1BeforeAddingToFav=By.xpath("(//div[@class='showTileSquare__description']//div)[18]");
	protected By titleDescription2BeforeAddingToFav=By.xpath("(//div[@class='showTileSquare__description']//div)[19]");
	protected By video=By.xpath("(//div[@class='showTileSquare__content'])[1]");
	protected By video1=By.xpath("(//div[@class='showTileSquare__content'])[2]");
	protected By title1=By.xpath("(//h3[@class='showTileSquare__title'])[1]");
	protected By title2=By.xpath("(//h3[@class='showTileSquare__title'])[2]");
	protected By titleDescription1=By.xpath("(//div[@class='showTileSquare__description']//div)[1]");
	protected By titleDescription2=By.xpath("(//div[@class='showTileSquare__description']//div)[2]");
	protected By myVideos=By.xpath("//span[text()='My Videos']");
	
}
