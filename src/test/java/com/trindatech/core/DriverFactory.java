package com.trindatech.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory implements IBrowser{
	
	public static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		if (driver == null) {
			
			String browser = GlobalProperties.getProperty("selenium.browser");
			String path = GlobalProperties.getProperty("selenium.path");
			
			if (browser.equals(CHROME)) {
				System.setProperty("webdriver.chrome.driver", path + "chromedriver");
				driver = new ChromeDriver();
			}
			
			if (browser.equals(FIREFOX)) {
				System.setProperty("webdriver.gecko.driver", path + "geckodriver");
				driver = new FirefoxDriver();
			}
			
			if (browser.equals(CHROMEHEADLESS)) {
				System.setProperty("webdriver.chrome.driver", path + "chromedriver");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.addArguments("--window-size=1200x600");
				
				driver = new ChromeDriver(options);
			}
			
			if (browser.equals(FIREFOXHEADLESS)) {
				System.setProperty("webdriver.gecko.driver", path + "geckodriver");
				
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--headless");
				options.addArguments("--window-size=1200x600");
				
				driver = new FirefoxDriver(options);
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
