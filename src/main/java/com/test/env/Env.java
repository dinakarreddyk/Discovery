package com.test.env;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Env 
{
	static WebDriver driver = null;
	static String browserName = null;
	static String currentPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	public static String getBrowserName()
	{
		browserName = System.getProperty("browser");
		
		//browserName = "ff";
		return browserName;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{
			System.out.println("Browser: " + browser);

			switch (browser.toLowerCase()) {
			case "ff":
			case "firefox":
				//ProfilesIni allProfiles = new ProfilesIni();
				//FirefoxProfile profile = allProfiles.getProfile("selenium");
				//driver = new FirefoxDriver(profile);
				driver = new FirefoxDriver();
				break;

			case "ch":
			case "chrome":
				driver = new ChromeDriver();
				break;

			case "ie" :
			case "internetexplorer":
				driver = new InternetExplorerDriver();
				break;

			case "safari":
				driver = new SafariDriver();
				break;
			
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
        }
	}
